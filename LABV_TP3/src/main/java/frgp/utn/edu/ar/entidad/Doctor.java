package frgp.utn.edu.ar.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="doctors")
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
	
	
	
	
}
