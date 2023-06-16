package edu.damago.cookbook.server;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import edu.damago.cookbook.persistence.Document;


public class EntitySanityCheck {

	static public void main (String[] args) {
		final EntityManagerFactory factory = Persistence.createEntityManagerFactory("cookbook");
		final EntityManager entitymanager = factory.createEntityManager();
		
		final Document defaultAvatar = entitymanager.find(Document.class, 1L);
		System.out.println(defaultAvatar.getContent().length);
	}

}
