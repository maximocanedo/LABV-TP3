package frgp.utn.edu.ar.dao;

import org.hibernate.Session;

import frgp.utn.edu.ar.entidad.Doctor;

public class DaoDoctor {
	public void Add(Doctor doctor) {
		ConfigHibernate config = new ConfigHibernate();
		Session session = config.openSession();
		// Se agrega un nuevo medico
		session.beginTransaction();
		session.save(doctor);
		
		session.getTransaction().commit();
		config.closeSession();
	}
}
