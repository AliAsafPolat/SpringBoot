package io.cdtpservice.cdtp.Service;

import java.util.List;

import io.cdtpservice.cdtp.Model.Sera;


public interface SeraService {
	
	List<Sera> get();
	
	Sera get(int id);
	
	void save (Sera sera);
	
	void delete(int id);
}
