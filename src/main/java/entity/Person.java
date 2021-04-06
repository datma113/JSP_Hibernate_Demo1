package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Person {
	@Id
	private String id;
	private String name;
	private String gmail;
	
	@OneToMany (mappedBy = "person")
	private List<CreditCard> list;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public List<CreditCard> getList() {
		return list;
	}

	public void setList(List<CreditCard> list) {
		this.list = list;
	}

	public Person(String id, String name, String gmail) {
		super();
		this.id = id;
		this.name = name;
		this.gmail = gmail;
		this.list = new ArrayList<>();
	}

	public Person() {
		super();
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gmail=" + gmail + "]";
	}
	
	public void addCreditCard(CreditCard c) {
		list.add(c);
	}

	

}
