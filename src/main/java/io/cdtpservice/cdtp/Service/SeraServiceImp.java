package io.cdtpservice.cdtp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.cdtpservice.cdtp.DataBase.SeraDatabase;
import io.cdtpservice.cdtp.DataBase.SeraDatabaseImp;
import io.cdtpservice.cdtp.Model.Sera;

@Service
public class SeraServiceImp implements SeraService {
	
	@Autowired
	private SeraDatabase seraDatabaseImp;
	
	@Transactional
	@Override
	public List<Sera> get() {
		return seraDatabaseImp.get();
	}
	@Transactional
	@Override
	public Sera get(int id) {
		return seraDatabaseImp.get(id);
	}
	@Transactional
	@Override
	public void save(Sera sera) {
		seraDatabaseImp.save(sera);
	}
	@Transactional
	@Override
	public void delete(int id) {
		seraDatabaseImp.delete(id);

	}

}
