package testUsingInterfacePersonneDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Personne;

public class ImpIPersonneDAO implements IPersonneDAO {
	EntityManagerFactory factory;
	EntityManager manager;
	EntityTransaction transaction;

	public ImpIPersonneDAO() {
		factory = Persistence.createEntityManagerFactory("s11tp1tmp");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	@Override
	public void close() {
		this.manager.close();
		this.factory.close();
	}

	@Override
	public void insert(Personne p) {
		transaction.begin();
		manager.persist(p);
		transaction.commit();

	}

	@Override
	public void update(Personne p) {
		transaction.begin();
		manager.merge(p);
		transaction.commit();

	}

	@Override
	public Personne getById(int id) {

		return manager.find(Personne.class, id);

	}

	@Override
	public List<Personne> getAll() {
		Query qry = manager.createNamedQuery("Personne.findAll");
		return qry.getResultList();
	}

	@Override
	public void remove(Personne p) {

		transaction.begin();
		manager.remove(manager.merge(p));
		transaction.commit();

	}

	@Override
	public void removeById(int id) {
		this.remove(this.getById(id));

	}

}
