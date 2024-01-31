package com.admin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ward")

public class Ward {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wardId")
	private long id;
	@Column(name = "wardName")
	private String name;
	@Column(name = "capacity")
	private int capacity;
	@Column(name = "availability")
	private int availability;
	@ManyToOne
	@JoinColumn(name = "medication_id",referencedColumnName = "id")
	private Medication medication_id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public Medication getMedication_id() {
		return medication_id;
	}

	public void setMedication_id(Medication medication_id) {
		this.medication_id = medication_id;
	}

	public Ward(int id, String name, int capacity, int availability, Medication medication_id) {
		this.id =id;
		this.name = name;
		this.capacity = capacity;
		this.availability = availability;
		this.medication_id = medication_id;
	}

	public Ward() {

	}

	@Override
	public String toString() {
		return "Ward [id=" + id + ", name=" + name + ", capacity=" + capacity + ", availability="
				+ availability + ", medication_id=" + medication_id + "]";
	}

}
