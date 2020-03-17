package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Personne database table.
 * 
 */
@Entity
@NamedQuery(name="Personne.findAll", query="SELECT p FROM Personne p")
public class Personne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_NAISS")
	private Date dateNaiss;

	@Column(name="NOM")
	private String nom;

	public Personne() {
	}

	public Personne(int id, Date dateNaiss, String nom) {
		super();
		this.id = id;
		this.dateNaiss = dateNaiss;
		this.nom = nom;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateNaiss() {
		return this.dateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", dateNaiss=" + dateNaiss + ", nom=" + nom + "]";
	}

}