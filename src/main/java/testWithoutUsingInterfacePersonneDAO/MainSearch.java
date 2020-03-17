package testWithoutUsingInterfacePersonneDAO;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entities.Personne;

public class MainSearch {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("s11tp1tmp");
		EntityManager manager = factory.createEntityManager();
		
	

		Personne p=manager.find(Personne.class, 2);
		System.out.println(p);

		
		manager.close();
		factory.close();
		

	}

}
