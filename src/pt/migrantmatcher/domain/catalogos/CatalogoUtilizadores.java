package pt.migrantmatcher.domain.catalogos;

import java.util.List;

import pt.migrantmatcher.domain.Migrante;
import pt.migrantmatcher.domain.Utilizador;
import pt.migrantmatcher.domain.Voluntario;

import java.util.ArrayList;


public class CatalogoUtilizadores {
	
    private List<Utilizador> users;
    private List<Voluntario> voluntarios;
    private List<Migrante> migrantes;

	/**
	 * Class constructor for Utilizadores catalog
	 */
	public CatalogoUtilizadores() {
		this.users = new ArrayList<Utilizador>();
		this.voluntarios = new ArrayList<Voluntario>();
		this.migrantes = new ArrayList<Migrante>();
		
		//Voluntarios com identificação
		addVoluntario(918376458);
		addVoluntario(987654321);
		addVoluntario(999000999);
		
	}
	
	/**
	 * Adds Migrant object to catalogs
	 * @param nome migrant's name
	 * @param telemovel telephone number
	 * @return 
	 */
	public Migrante addMigrante(String nome, int telemovel) {
		
		Migrante m = new Migrante(nome, telemovel);
		users.add(m);
		migrantes.add(m);
		
		return m;
	}
	
	public Migrante addMigrante(String nome, int telemovel, int numFamiliares) {
		Migrante m = new Migrante(nome, telemovel);
		m.setFamily(numFamiliares);
		
		users.add(m);
		migrantes.add(m);
		
		return m;
	}
	/**
	 * Adds Voluntario object to catalogs
	 * @param nome migrant's name
	 * @param telemovel telephone number
	 */
	public void addVoluntario(int telemovel) {
		Voluntario v = new Voluntario(telemovel);
		users.add(v);
		voluntarios.add(v);
	}
	
	
	public Migrante getMigrante(int telemovel) {
		for (Migrante m : migrantes) {
			if (telemovel == m.getTelephoneNumber()) {
				return m;
			}
		}
		return null;
	}
	
	public Voluntario getVoluntario(int telemovel) {
		for (Voluntario v : voluntarios) {
			if (telemovel == v.getTelephoneNumber()) {
				return v;
			}
		}
		return null;
	}
}
