package utn.frgp.tp3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import utn.frgp.tp3.entidad.Doctor;

public class TestingRecordGenerator {
	public static String[] MEN_NAMES = new String[] {
		"JOSE","ANTONIO","JUAN","MANUEL","FRANCISCO","LUIS","JAVIER","MIGUEL","CARLOS","ANGEL","JESUS","DAVID","DANIEL","PEDRO","ALEJANDRO","MARIA","ALBERTO","PABLO","FERNANDO","RAFAEL","JORGE","RAMON","SERGIO","ENRIQUE","ANDRES","DIEGO","ADRIAN","VICENTE","VICTOR","ALVARO","IGNACIO","RAUL","EDUARDO","IVAN","OSCAR","RUBEN","JOAQUIN","SANTIAGO","MARIO","ROBERTO","GABRIEL","MARCOS","ALFONSO","JAIME","RICARDO","HUGO","JULIO","EMILIO","MARTIN","SALVADOR","GUILLERMO","MOHAMED","NICOLAS","TOMAS","JORDI","JULIAN","GONZALO","AGUSTIN","CRISTIAN","CESAR","MARC","FELIX","JOAN","JOSEP","SAMUEL","SEBASTIAN","LUCAS","HECTOR","FELIPE","ISMAEL","ALFREDO","DOMINGO","AITOR","ALEX","MARIANO","RODRIGO","MATEO","ALEXANDER","IKER","MARCO","XAVIER","ESTEBAN","ARTURO","GREGORIO","LORENZO","DARIO","BORJA","ALBERT","AARON","JOEL","ISAAC","EUGENIO","CRISTOBAL","ERIC","JONATHAN","CHRISTIAN","MOHAMMED","PAU","GERMAN","OMAR"
	};
	public static String[] WOMEN_NAMES = new String[] {
		"MARIA","CARMEN","ANA","ISABEL","DOLORES","PILAR","TERESA","ROSA","JOSEFA","CRISTINA","LAURA","ANGELES","ELENA","ANTONIA","LUCIA","MARTA","FRANCISCA","MERCEDES","LUISA","CONCEPCION","ROSARIO","JOSE","PAULA","SARA","RAQUEL","ROCIO","EVA","PATRICIA","BEATRIZ","VICTORIA","JUANA","MANUELA","JULIA","JESUS","ANDREA","BELEN","ALBA","SILVIA","ESTHER","IRENE","NURIA","ENCARNACION","MONTSERRAT","SANDRA","ANGELA","MONICA","ALICIA","INMACULADA","YOLANDA","MAR","SONIA","MARINA","SOFIA","SUSANA","MARGARITA","CLAUDIA","NATALIA","CAROLINA","INES","ALEJANDRA","DANIELA","CARLA","VERONICA","AMPARO","GLORIA","LOURDES","NIEVES","LUZ","SOLEDAD","NOELIA","LORENA","FATIMA","BEGOÑA","BLANCA","OLGA","NEREA","MIRIAM","CLARA","CONSUELO","ASUNCION","MILAGROS","ESPERANZA","MARTINA","LIDIA","CATALINA","ADRIANA","CELIA","ANNA","AURORA","MAGDALENA","EMILIA","ELISA","VANESA","AINHOA","VIRGINIA","EUGENIA","DIANA","GEMA","ALEXANDRA","VALERIA"
	};
	public static String[] SURNAMES = new String[] {
		"GARCIA","RODRIGUEZ","GONZALEZ","FERNANDEZ","LOPEZ","MARTINEZ","SANCHEZ","PEREZ","GOMEZ","MARTIN","JIMENEZ","HERNANDEZ","RUIZ","DIAZ","MORENO","MUÑOZ","ALVAREZ","ROMERO","GUTIERREZ","ALONSO","NAVARRO","TORRES","DOMINGUEZ","RAMOS","VAZQUEZ","RAMIREZ","GIL","SERRANO","MORALES","MOLINA","BLANCO","SUAREZ","CASTRO","ORTEGA","DELGADO","ORTIZ","MARIN","RUBIO","NUÑEZ","MEDINA","SANZ","CASTILLO","IGLESIAS","CORTES","GARRIDO","SANTOS","GUERRERO","LOZANO","CANO","CRUZ","MENDEZ","FLORES","PRIETO","HERRERA","PEÑA","LEON","MARQUEZ","CABRERA","GALLEGO","CALVO","VIDAL","CAMPOS","REYES","VEGA","FUENTES","CARRASCO","DIEZ","AGUILAR","CABALLERO","NIETO","SANTANA","VARGAS","PASCUAL","GIMENEZ","HERRERO","HIDALGO","MONTERO","LORENZO","SANTIAGO","BENITEZ","DURAN","IBAÑEZ","ARIAS","MORA","FERRER","CARMONA","VICENTE","ROJAS","SOTO","CRESPO","ROMAN","PASTOR","VELASCO","PARRA","SAEZ","MOYA","BRAVO","RIVERA","GALLARDO","SOLER"
	};
	public static String[] STREET_NAMES = new String[] {
		"Crisólogo Larralde","Rubén Darío","Río Quinto","Avenida Cazón","Avenida Constitución","Florida","Avenida Corrientes","Avenida Brasil","Figueroa","René Favaloro","Paraná","Luis Viale","Formosa","Montevideo","Córdoba","Adolfo Alsina","Humberto Primo","Lavalle","Pedro Goyena","Avenida San Martín","Avenida Callao","Las Heras","Avenida Cabildo","Julio Argentino Roca","Avenida Maipú","Avenida del Libertador","Avenida Santa Fe","Avenida Dardo Rocha","General Arias","Avenida Italia"
	};
	public static String[] LOCALTIES = new String[] {
		"Tigre","General Pacheco","Núñez","Palermo","Nordelta","Carupá","San Fernando","San Isidro","Temperley","Avellaneda","Munro","Adrogué","Belgrano","Florida","Vicente López","Grand Bourg","Pilar","Escobar","Ingeniero Maschwitz","Garín","Benavídez","Quilmes","Chascomús","Don Torcuato","Florencio Varela","Monte Grande","Los Troncos del Talar","Ezeiza","Burzaco","Puerto Madero"
	};
	public static int LAST_NAME_LENGTH = 0;
	public static int LAST_SURNAME_LENGTH = 0;
	public static int LAST_STREETNAME_LENGTH = 0;
	public static int LAST_LOCALTY_LENGTH = 0;
	/**
	 * Genera un nombre aleatorio.
	 * @param sex 1 para hombre, 0 para mujer.
	 * @return Nombre aleatoriamente elegido.
	 */
	public String generateRandomName(int sex) {
		Random random = new Random();
	    int index = random.nextInt(100); 

	    String[] names = (sex == 1 ? MEN_NAMES : WOMEN_NAMES);

	    String name = names[index];
	    if (LAST_NAME_LENGTH == 0 || name.length() == LAST_NAME_LENGTH) {
	        index = random.nextInt(100);
	        name = names[index];
	    } 
	    
	    LAST_NAME_LENGTH = name.length();
	    
	    return name;
	}
	
	public String generateRandomSurname() {
		Random random = new Random();
	    int index = random.nextInt(100); 

	    String surname = SURNAMES[index];
	    if (LAST_SURNAME_LENGTH == 0 || surname.length() == LAST_SURNAME_LENGTH) {
	        index = random.nextInt(100);
	        surname = SURNAMES[index];
	    } 
	    
	    LAST_SURNAME_LENGTH = surname.length();
	    
	    return surname;
	}
	
	public String generateRandomAddress() {
		Random random = new Random();
	    int index = random.nextInt(30); 

	    String street = STREET_NAMES[index];
	    if (LAST_STREETNAME_LENGTH == 0 || street.length() == LAST_STREETNAME_LENGTH) {
	        index = random.nextInt(30);
	        street = STREET_NAMES[index];
	    } 
	    
	    LAST_STREETNAME_LENGTH = street.length();
	    
	    int no = random.nextInt(1000);
	    
	    return street + " " + no;
	}
	
	public String generateRandomLocalty() {
		Random random = new Random();
	    int index = random.nextInt(30); 

	    String localty = LOCALTIES[index];
	    if (LAST_SURNAME_LENGTH == 0 || localty.length() == LAST_SURNAME_LENGTH) {
	        index = random.nextInt(30);
	        localty = LOCALTIES[index];
	    } 
	    
	    LAST_LOCALTY_LENGTH = localty.length();
	    
	    return localty;
	}
	
	public Date getDateOf(int year, int month, int day, int hours, int minutes) {
		return Date.from(
				LocalDate
					.of(year, month, day)
					.atTime(LocalTime.of(hours, minutes))
					.atZone(ZoneId.systemDefault())
					.toInstant()
				);
	}
	
	public Date generateDate() {
		Random random = new Random();
		int year = 1995 - random.nextInt(40);
		int month = random.nextInt(11) + 1;
		int day = random.nextInt(27) + 1;
		return getDateOf(year, month, day, 0, 0);
	}
	
	public String generateEmail(String name, String surname, Date birth) {
		Random random = new Random();
		String e_name = "";
		if(name.length() <= 4) e_name = name;
		else {
			int end = random.nextInt(name.length() - 4) + 4;
			e_name = name.substring(0, end);
		}
		e_name = e_name.toLowerCase();
		String div = "";
		String e_surname = surname;
		if(surname.length() > 5) {
			int end = random.nextInt(surname.length() - 5) + 5;
			e_surname = surname.substring(0, end);			
		}
		e_surname = e_surname.toLowerCase();
		
		String post = "";
		
		int r = random.nextInt(100);
		if(r % 5 == 0) {
			post = (birth.getYear() + 1900) + "";
		} else if(r % 3 == 0) {
			post = (birth.getYear() % 100) + "";
		} else if(r % 2 == 0) {
			post = (random.nextInt(1000)) + "";
		} else {
			post = "";
		}
		String email = "";
		int s = random.nextInt(100);
		if(s % 5 == 0) {
			email = e_name + div + e_surname + post;
		} else if(s % 3 == 0) {
			email = e_surname + div + e_name + post;
		} else if(s % 2 == 0) {
			email = e_name + div + e_surname + div + post;
		} else {
			email = e_name + div + e_surname;
		}
		
		
		String[] domains = new String[] { "gmail.com", "outlook.com", "hotmail.com", "yahoo.es", "live.com", "msf.org" };
		
		String dom = domains[random.nextInt(6)];
		
		email += "@" + dom;
		
		return email;
	}
	

	public String generatePhone() {
        Random random = new Random();
        StringBuilder numero = new StringBuilder();
        
        numero.append("11 ");
        
        for (int i = 0; i < 8; i++) {
            numero.append(random.nextInt(10));
            if(i == 3) numero.append("-");
        }
        
        return numero.toString();
    }
	
	public TestingRecordGenerator() {
		
	}
	
	public static Doctor generateRecord() {
		TestingRecordGenerator trg = new TestingRecordGenerator();
		Random random = new Random();
		int sex = random.nextInt(2) % 2;
		Doctor d = new Doctor();
		String n = trg.generateRandomName(sex);
		String s = trg.generateRandomSurname();
		Date dd = trg.generateDate();
		d.setName(n);
		d.setSurname(s);
		d.setAddress(trg.generateRandomAddress());
		d.setLocality(trg.generateRandomLocalty());
		d.setBirth(dd);
		d.setSex(sex == 1 ? 'M' : 'F');
		d.setEmail(trg.generateEmail(n, s, dd));
		d.setPhone(trg.generatePhone());
		return d;
	}
	public static void main(String[] args) {
		TestingRecordGenerator trg = new TestingRecordGenerator();
		for(int i = 0; i < 15; i++) {
			Doctor d = generateRecord();
			System.out.println(d);
		}
	}
}
