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
	
    public static void main( String[] args )
    {
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
