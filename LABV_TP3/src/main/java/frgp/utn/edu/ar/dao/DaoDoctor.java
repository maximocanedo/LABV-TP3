package frgp.utn.edu.ar.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import frgp.utn.edu.ar.entidad.Doctor;

public class DaoDoctor {
    public void Add(Doctor doctor) {
        Session session = null;
        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            session.save(doctor);
            transaction.commit();
        } catch (Exception e) {
            handleException(e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
    public Doctor getDoctorByFile(int file) {
        Session session = null;
        Doctor doctor = null;
        try {
            session = getSession();
            doctor = (Doctor) session.get(Doctor.class, file);
            if (doctor == null) {
                System.out.println("El medico no esta en el sistema.");
            }
        } catch (Exception e) {
            handleException(e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return doctor;
    }
    
    public void deleteByFile(int file) {
        Session session = null;
        try {
            session = getSession();
            session.beginTransaction();
            Doctor doctor = getDoctorByFile(file);
            if (doctor != null) {
                session.delete(doctor);
                session.getTransaction().commit();
                System.out.println("El medico con legajo "+ file + " fue eliminado.");
            }
        } catch (Exception e) {
            handleException(e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }


	private Session getSession() {
        return new ConfigHibernate().openSession();
    }

    private void handleException(Exception e) {
        e.printStackTrace();
        System.out.println("Error: "+e.getMessage());
    }
    
  ///modificar por ID
  /// Buscar doctor por ID 
  public Doctor ReadOne(int id) {
  	Session session = null;
  	try {
          session = getSession();
          Transaction transaction = session.beginTransaction();
          Doctor doctor = (Doctor)session.get(Doctor.class, id);
          transaction.commit();
          return doctor;
      } catch (Exception e) {
          handleException(e);
  	} finally {
      if (session != null) {
      	session.close();
      }
  	}
  	return null;
  }
  /// Modifcar doctor     
  public void Update(Doctor doctor)
  {
  	Session session = null;
  	try {
          session = getSession();
          Transaction transaction = session.beginTransaction();
          session.update(doctor);
          transaction.commit();
      } catch (Exception e) {
          handleException(e);
      } finally {
          if (session != null) {
              session.close();
          }
      } 
  }
   
}