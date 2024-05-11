package utn.frgp.tp3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
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
	
	public static void addDoctors(int quantity) {

        DaoDoctor daoDoctor = new DaoDoctor(); 

        for(int i = 0; i < quantity; i++) {
        	Doctor doctor = TestingRecordGenerator.generateRecord();
        	daoDoctor.Add(doctor);
        }

    	
	}
    public static void main( String[] args )
    {
        DaoDoctor daoDoctor = new DaoDoctor(); 
        
    	System.out.println("Agregando registros...");
    	addDoctors(10);
    	System.out.println("Agregados los diez registros de médicos. ");
    	
    	Doctor doctor1 = null;
    	int i = 1;
    	while(doctor1 == null) {
    		doctor1 = daoDoctor.getDoctorByFile(i);
    		if(doctor1 == null) {
    			i++;
    			continue;
    		}
    	}
    	
    	System.out.println("Doctor a modificar: ");
    	System.out.println(doctor1);
    	
    	doctor1.setName("Ariel");
    	doctor1.setSurname("Bouchard");
    	System.out.println("Se cambiará el nombre de este doctor (#" + doctor1.getFile() + ") por Ariel Bouchard.");
    	
    	daoDoctor.Update(doctor1);
    	
    	Doctor doctor2 = daoDoctor.getDoctorByFile(doctor1.getFile());
    	if(doctor2 != null) {
    		System.out.println(doctor2);
    	} else {
    		System.out.println("ERR. No se encontró el doctor (#" + doctor1.getFile() + ") cuyo nombre se modificó recientemente. ");
    	}
    	
    	System.out.println("Ahora se procederá a eliminar el registro (#" + doctor1.getFile() + "). ");
    	daoDoctor.deleteByFile(doctor1.getFile());
    	
    	Doctor doctor3 = daoDoctor.getDoctorByFile(doctor1.getFile());
    	if(doctor3 == null) {
    		System.out.println("El doctor #" + doctor1.getFile() + " fue eliminado correctamente. ");
    	} else {
    		System.out.println("ERR. No se pudo borrar el registro. ");
    	}
    	
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
