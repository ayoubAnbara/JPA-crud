package testUsingInterfacePersonneDAO;

import java.util.List;

import entities.Personne;

public interface IPersonneDAO {

	void insert(Personne p);

	void update(Personne p);

	Personne getById(int id);

	List<Personne> getAll();

	void remove(Personne p);

	void removeById(int id);
	void close();
}
