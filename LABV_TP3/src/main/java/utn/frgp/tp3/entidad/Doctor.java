package utn.frgp.tp3.entidad;


import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import javax.persistence.*;

import utils.FormattedLine;
import utils.FormattedLine.Alignment;
import utils.IFormattedLine;

@Entity
@Table(name="medicos")
public class Doctor implements Serializable {
	
	private static final long serialVersionUID = 135L;
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int file;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	@Column
	private char sex;
	
	@Column
	private Date birth;
	
	@Column
	private String address;
	
	@Column
	private String locality;
	
	@Column
	private String email;
	
	@Column
	private String phone;
	
	public Doctor() {
		
	}

	public int getFile() {
		return file;
	}

	public void setFile(int file) {
		this.file = file;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		
		String e =  "Doctor [file=" + file + ", name=" + name + ", surname=" + surname + ", sex=" + sex + ", birth=" + birth
				+ ", address=" + address + ", locality=" + locality + ", email=" + email + ", phone=" + phone + "]";
		
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.SHORT);
		IFormattedLine header = new FormattedLine("LEGAJO N.º " + file);
		header.setLineSize(48);
		header.setTopHeader(true);
		String cont = "";
		String[] lines = new String[] {
			surname + ", " + name,
			"Sexo: " + sex,
			"Fecha de nacimiento: " + df.format(birth),
			"Dirección: " + address, 
			"Localidad: " + locality
		};
		for(String line: lines) {
			cont += line + "\n";
		}
		IFormattedLine content = new FormattedLine(cont);
		content.setLineSize(48);
		IFormattedLine contact = new FormattedLine(email + "\n" + phone);
		contact.setAlignment(Alignment.RIGHT);
		contact.setLineSize(48);
		
		IFormattedLine end = new FormattedLine("···");
		end.setAlignment(FormattedLine.Alignment.CENTER);
		end.setTopHeader(true);
		end.setHeaderMiddleDelimiters('—');
		end.setLineSize(48);
		
		String tot = header.toString() + content.toString() + contact.toString();
		
		return tot + end.toString() + "\n";
		
		
	}
	
	
	
	
}
