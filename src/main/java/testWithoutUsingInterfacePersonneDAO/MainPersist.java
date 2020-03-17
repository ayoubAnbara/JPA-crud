package testWithoutUsingInterfacePersonneDAO;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entities.Personne;

public class MainPersist {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("s11tp1tmp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
//		Personne personne=new Personne(1, new Date(), "anbara");
		
		Personne personne=new Personne(2, new GregorianCalendar(2000, 0, 15).getTime()
				                        , "anbara");
		
		manager.persist(personne);
		transaction.commit();
		
		manager.close();
		factory.close();
		

	}

}
