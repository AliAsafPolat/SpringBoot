package io.cdtpservice.cdtp.DataBase;

import java.util.List;

import io.cdtpservice.cdtp.Model.Sera;

public interface SeraDatabase {
	List<Sera> get();
	
	Sera get(int id);
	
	void save (Sera sera);
	
	void delete(int id);
}
