package many_to_many_uni_2_Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_uni_2_Dto.Language;
import many_to_many_uni_2_Dto.Person;

public class PersonDao {
	public void savePerson(Person person,List<Language> list) {
	       EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
			
		    EntityManager entityManager=entityManagerFactory.createEntityManager();
		    EntityTransaction entityTransaction=entityManager.getTransaction();
		    entityTransaction.begin();
		   
		    for(Language language1:list) {
		    	entityManager.persist(language1);
		    	
		    	
		    }
		    entityManager.persist(person);
		    entityTransaction.commit();
		    System.out.println("saved");
		    
		   
		}
	public void updatePerson(int id,String name) {
		    EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
			
		    EntityManager entityManager=entityManagerFactory.createEntityManager();
		    EntityTransaction entityTransaction=entityManager.getTransaction();
		    Person person=entityManager.find(Person.class, id);
		    person.setName(name);
		    entityTransaction.begin();
		    entityManager.merge(person);
		    entityTransaction.commit();
		    System.out.println("updated");
		    
		    
		
	}
	public void deletePerson(int id) {
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
			
		    EntityManager entityManager=entityManagerFactory.createEntityManager();
		    EntityTransaction entityTransaction=entityManager.getTransaction();
		    Person person=entityManager.find(Person.class, id);
		    
		    entityTransaction.begin();
		    entityManager.remove(person);
		    
		    entityTransaction.commit();
		    System.out.println("dedleted");
		
		
	}
	public Person getPerson(int id) {
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
			
		    EntityManager entityManager=entityManagerFactory.createEntityManager();
		    EntityTransaction entityTransaction=entityManager.getTransaction();
		    Person person=entityManager.find(Person.class, id);
		    
		   
		    return person;
		    
		    
		
		
	}
	
	

}
