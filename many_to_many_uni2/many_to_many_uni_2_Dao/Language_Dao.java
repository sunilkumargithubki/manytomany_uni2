package many_to_many_uni_2_Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_uni_2_Dto.Language;
import many_to_many_uni_2_Dto.Person;

public class Language_Dao {
	public void saveLanguage(Language language) {
       EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	    entityTransaction.begin();
	    entityManager.persist(language);
	    entityTransaction.commit();
	    
	   
	}
	public void updatelanguage(int id,String name) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	    Language language1=entityManager.find(Language.class, id);
	    language1.setCountry(name);
	    entityTransaction.begin();
	    entityManager.merge(language1);
	    entityTransaction.commit();
	    
	    
		
	}
	public void deleteLanguage(int id1) {
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
			
		    EntityManager entityManager=entityManagerFactory.createEntityManager();
		    EntityTransaction entityTransaction=entityManager.getTransaction();
		   
		    Language language1=entityManager.find(Language.class, id1);
		    
		    entityTransaction.begin();
		   
		    entityManager.remove(language1);
		   
		    entityTransaction.commit();
		    
		
	}
	public Language getLanguage(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	    Language language=entityManager.find(Language.class, id);
	    return language;
	    
		
		
	}
	
	

}
