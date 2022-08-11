package com.tns.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
	 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student = new Student();
		student.setName("Tanvi");
		Address homeAddress = new Address();
		homeAddress.setStreet("Bariwada");
		homeAddress.setCity("Boisar");
		homeAddress.setState("MH");
		homeAddress.setZipcode("001");
		
		student.setAddress(homeAddress);
		
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();

	}

}

