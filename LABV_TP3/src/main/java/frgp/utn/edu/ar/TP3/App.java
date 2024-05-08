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
}
