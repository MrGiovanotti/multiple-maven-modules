package com.mrgiovanotti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int clasification;
	private boolean isOpen;

	protected Hotel() {
	}

	public Hotel(String name, int clasification, boolean isOpen) {
		this.name = name;
		this.clasification = clasification;
		this.isOpen = isOpen;
	}

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

	public int getClasification() {
		return clasification;
	}

	public void setClasification(int clasification) {
		this.clasification = clasification;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

}
