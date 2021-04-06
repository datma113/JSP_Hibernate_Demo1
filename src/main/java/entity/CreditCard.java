package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CreditCard {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	private String type;
	private String number;
	
	@ManyToOne
	@JoinColumn(name = "personID")
	private Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public CreditCard(String type, String number) {
		super();
	
		this.type = type;
		this.number = number;
	}

	public CreditCard() {
		super();
	}

	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", type=" + type + ", number=" + number + "]";
	}
	 
}
