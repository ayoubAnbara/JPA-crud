package testUsingInterfacePersonneDAO;

import java.util.Date;

import entities.Personne;

public class Main {

	public static void main(String[] args) {

		IPersonneDAO personneDAO = new ImpIPersonneDAO();

		// personneDAO.insert(new Personne(6,new Date(),"insertion"));
		// personneDAO.getAll().forEach(System.out::println);
		// personneDAO.update(new Personne(1, new Date(), "after update"));

		// personneDAO.remove(new Personne(6,new Date(),"insertion"));
		personneDAO.removeById(2);
		
		personneDAO.close();
	}
}
