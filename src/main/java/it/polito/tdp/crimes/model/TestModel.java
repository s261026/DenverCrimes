package it.polito.tdp.crimes.model;

import it.polito.tdp.crimes.db.EventsDao;

public class TestModel {

	public static void main(String[] args) {
		
		Model m = new Model();
		EventsDao dao = new EventsDao();
		m.creaGrafo("aggravated-assault", 4);
		System.out.println(dao.getAdiacenze("aggravated-assault", 4));
		System.out.println(m.getArchi());
		
	}

}
