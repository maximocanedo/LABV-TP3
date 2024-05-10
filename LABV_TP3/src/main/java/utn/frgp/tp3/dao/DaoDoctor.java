package utn.frgp.tp3.dao;

import java.awt.print.Pageable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.*;
import utn.frgp.tp3.entidad.Doctor;

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
    @SuppressWarnings("unchecked")
	public List<Doctor> list() {
    	Session session = null;
        List<Doctor> doctors = null;
        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            Query q = session.createQuery("FROM Doctor");
            doctors = q.list();
            transaction.commit();
        } catch (Exception e) {
            handleException(e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return doctors;
    }
    
    @SuppressWarnings("unchecked")
	public List<Doctor> list(int page, int size) {
    	Session session = null;
        List<Doctor> doctors = null;
        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            Query q = session.createQuery("FROM Doctor");
            q.setFirstResult((page - 1) * size);
            q.setMaxResults(size);
            doctors = q.list();
            transaction.commit();
        } catch (Exception e) {
            handleException(e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return doctors;
    }
    
  /* //modificar por ID
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
*/   
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
  } // */
   
}