package io.cdtpservice.cdtp.DataBase;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.cdtpservice.cdtp.Model.Sera;

@Repository
public class SeraDatabaseImp implements SeraDatabase {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Sera> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Sera> query =  currentSession.createQuery("from Sera", Sera.class);
		List<Sera> list = query.getResultList();
		return list;
	}

	@Override
	public Sera get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Sera.class, id);
	}

	@Override
	public void save(Sera sera) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(sera);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Sera sera = currentSession.get(Sera.class, id);
		currentSession.delete(sera);

	}

}
