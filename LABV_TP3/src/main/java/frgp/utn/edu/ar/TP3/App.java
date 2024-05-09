package frgp.utn.edu.ar.TP3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

import frgp.utn.edu.ar.dao.DaoDoctor;
import frgp.utn.edu.ar.entidad.Doctor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DaoDoctor daoDoctor = new DaoDoctor();
    	// Creacion nuevos medicos
    	Doctor doctor = new Doctor();
    	doctor.setName("Ricardo");
    	doctor.setSurname("Guzman");
    	doctor.setSex('m');
    	doctor.setBirth(getDateOf(1980, 05, 16, 0, 0));
    	doctor.setAddress("Mariano Artigas 654");
    	doctor.setLocality("General Pacheco");
    	doctor.setEmail("ricardoguzman@gmail.com");
    	doctor.setPhone("+5491168457523");
    	daoDoctor.Add(doctor);
    	
    	Doctor x = daoDoctor.getDoctorByFile(1);
    	if(x != null) {
    		System.out.println(x);
    	}
    	
    	daoDoctor.deleteByFile(1);
    	
    	
    	
    	
    }
    
    public static Date getDateOf(int year, int month, int day, int hours, int minutes) {
		return Date.from(
				LocalDate
					.of(year, month, day)
					.atTime(LocalTime.of(hours, minutes))
					.atZone(ZoneId.systemDefault())
					.toInstant()
				);
	}
    /// Modifica por id de medico
    public static bool ModifyByID(int id, Doctor doctor) {
    	DaoDoctor daoDoctor = new DaoDoctor();
    	Doctor IDdoctor = daoDoctor.ReadOne(id);
    	if(doctor != null) {
    		doctor.setFile(IDdoctor.getFile());
    		daoDoctor.Update(doctor);
    		return true;
    	}
    	else {
    		return false ;
    	}
    }
    
}


