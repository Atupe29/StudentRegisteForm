package com.jdc04.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Hospital")
public class Hospital {
	@Id
	private Integer Id;
	private String Name;
	private String Address;
	private String Contact;
	private String Type;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Hospital(Integer id, String name, String address, String contact, String type) {
		super();
		Id = id;
		Name = name;
		Address = address;
		Contact = contact;
		Type = type;
	}

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hospital [Id=" + Id + ", Name=" + Name + ", Address=" + Address + ", Contact=" + Contact + ", Type="
				+ Type + "]";
	}

}