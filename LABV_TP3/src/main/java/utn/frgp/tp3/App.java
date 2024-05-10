package utn.frgp.tp3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import utn.frgp.tp3.dao.DaoDoctor;
import utn.frgp.tp3.entidad.Doctor;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void addDoctors() {

        DaoDoctor daoDoctor = new DaoDoctor();  
		// Ricardo Guzmán
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
    	
    	// Antonella Yamaha
    	Doctor doctor2 = new Doctor();
    	doctor2.setName("Antonella");
    	doctor2.setSurname("Yamaha");
    	doctor2.setSex('f');
    	doctor2.setBirth(getDateOf(1940, 04, 16, 0, 0));
    	doctor2.setAddress("Las Heras 1024");
    	doctor2.setLocality("General Pacheco");
    	doctor2.setEmail("anto_yamaha@gmail.com");
    	doctor2.setPhone("+5491135813685");
    	daoDoctor.Add(doctor2);
    	
    	// Héctor Herrera
    	Doctor doctor3 = new Doctor();
    	doctor3.setName("Héctor");
    	doctor3.setSurname("Herrera");
    	doctor3.setSex('m');
    	doctor3.setBirth(getDateOf(1986, 06, 20, 0, 0));
    	doctor3.setAddress("Av. Da Silva 2048");
    	doctor3.setLocality("General Pacheco");
    	doctor3.setEmail("hector_herrera@gmail.com");
    	doctor3.setPhone("+5491119487563");
    	daoDoctor.Add(doctor3);
    	
    	// Gustavo De La Fuente
    	Doctor doctor4 = new Doctor();
    	doctor4.setName("Gustavo");
    	doctor4.setSurname("De La Fuente");
    	doctor4.setSex('m');
    	doctor4.setBirth(getDateOf(1996, 06, 20, 0, 0));
    	doctor4.setAddress("Sobremonte 1648");
    	doctor4.setLocality("General Pacheco");
    	doctor4.setEmail("delafuente_gustavo@gmail.com");
    	doctor4.setPhone("+5491130481526");
    	daoDoctor.Add(doctor4);
    	
    	// Lucas Martínez
    	Doctor doctor5 = new Doctor();
    	doctor5.setName("Lucas");
    	doctor5.setSurname("Martínez");
    	doctor5.setSex('m');
    	doctor5.setBirth(getDateOf(1992, 5, 7, 0, 0));
    	doctor5.setAddress("Corrientes 783");
    	doctor5.setLocality("Rosario");
    	doctor5.setEmail("lucas_martinez@example.com");
    	doctor5.setPhone("+5493412567934");
    	daoDoctor.Add(doctor5);

    	// Solana Gómez
    	Doctor doctor6 = new Doctor();
    	doctor6.setName("Solana");
    	doctor6.setSurname("Gómez");
    	doctor6.setSex('f');
    	doctor6.setBirth(getDateOf(1990, 9, 25, 0, 0));
    	doctor6.setAddress("San Martín 237");
    	doctor6.setLocality("La Plata");
    	doctor6.setEmail("solana_gomez@example.com");
    	doctor6.setPhone("+5492213945827");
    	daoDoctor.Add(doctor6);

    	// Esteban Rivas
    	Doctor doctor7 = new Doctor();
    	doctor7.setName("Esteban");
    	doctor7.setSurname("Rivas");
    	doctor7.setSex('m');
    	doctor7.setBirth(getDateOf(1979, 1, 30, 0, 0));
    	doctor7.setAddress("Sarmiento 1012");
    	doctor7.setLocality("Mar del Plata");
    	doctor7.setEmail("esteban_rivas@example.com");
    	doctor7.setPhone("+5492235421678");
    	daoDoctor.Add(doctor7);
    	
    	// Mariana López
    	Doctor doctor8 = new Doctor();
    	doctor8.setName("Mariana");
    	doctor8.setSurname("López");
    	doctor8.setSex('f');
    	doctor8.setBirth(getDateOf(1984, 4, 10, 0, 0));
    	doctor8.setAddress("Alvear 233");
    	doctor8.setLocality("Santa Fe");
    	doctor8.setEmail("mariana_lopez@example.com");
    	doctor8.setPhone("+5493425687123");
    	daoDoctor.Add(doctor8);

    	// Diego Vargas
    	Doctor doctor9 = new Doctor();
    	doctor9.setName("Diego");
    	doctor9.setSurname("Vargas");
    	doctor9.setSex('m');
    	doctor9.setBirth(getDateOf(1970, 12, 5, 0, 0));
    	doctor9.setAddress("Maipú 876");
    	doctor9.setLocality("Córdoba");
    	doctor9.setEmail("diego_vargas@example.com");
    	doctor9.setPhone("+5493516789324");
    	daoDoctor.Add(doctor9);

    	// Paula Espinoza
    	Doctor doctor10 = new Doctor();
    	doctor10.setName("Paula");
    	doctor10.setSurname("Espinoza");
    	doctor10.setSex('f');
    	doctor10.setBirth(getDateOf(1994, 7, 18, 0, 0));
    	doctor10.setAddress("Córdoba 789");
    	doctor10.setLocality("Salta");
    	doctor10.setEmail("paula_espinoza@example.com");
    	doctor10.setPhone("+5493874928165");
    	daoDoctor.Add(doctor10);

    	
	}
    public static void main( String[] args )
    {
    	System.out.println("Agregando registros...");
    	addDoctors();
    	System.out.println("Agregados los diez registros de médicos. ");
        DaoDoctor daoDoctor = new DaoDoctor(); 
    	List<Doctor> eee = daoDoctor.list();
    	for(Doctor e : eee) {
    		System.out.println(e);
    	}
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
