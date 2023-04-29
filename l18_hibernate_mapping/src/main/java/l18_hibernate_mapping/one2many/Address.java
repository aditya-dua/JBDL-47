package l18_hibernate_mapping.one2many;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jbdl-47-mapping-O2M-address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;

	@Column(name="country")
	private String country;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee emp;

	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Address(int id, String street, String city, String country) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.country = country;
		
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", country=" + country + ", emp=" + emp
				+ "]";
	}

	

}
