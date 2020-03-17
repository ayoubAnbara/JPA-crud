package testWithoutUsingInterfacePersonneDAO;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entities.Personne;

public class MainRefresh {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("s11tp1tmp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();

		Personne p = manager.find(Personne.class, 2);
		System.out.println("Avant:"+p.getNom());
		p.setNom("Nabil");
		System.out.println("Apres:"+p.getNom());
		
		manager.refresh(p);
		p = manager.find(Personne.class, 2);
		System.out.println("Apres reinitialisation "+p.getNom());
		
		transaction.commit();
		
		manager.close();
		factory.close();
		

	}

}
