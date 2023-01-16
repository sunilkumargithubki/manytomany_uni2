package many_to_many_uni_2_controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_uni_2_Dao.Language_Dao;
import many_to_many_uni_2_Dao.PersonDao;
import many_to_many_uni_2_Dto.Language;
import many_to_many_uni_2_Dto.Person;

public class PersonMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean flag=true;
		do {
		System.out.println("enter choice");
		System.out.println("1.save person");
		System.out.println("2.update person");
		System.out.println("3.delete person");
		System.out.println("4.get person");
		System.out.println("5.exit person");
		System.out.println("enter choice");
		PersonDao crud=new PersonDao();
		int choice=scanner.nextInt();
		switch(choice) {
		case 1 :{
			Language l1=new Language();
			System.out.println("enter language id");
			l1.setId(scanner.nextInt());
			System.out.println("enter language name");
			l1.setName(scanner.next());
			System.out.println("enter language country");
			l1.setCountry(scanner.next());
			System.out.println("enter language origin");
			l1.setOrigin(scanner.next());
			Language l2=new Language();
			System.out.println("enter language id");
			l2.setId(scanner.nextInt());
			System.out.println("enter language name");
			l2.setName(scanner.next());
			System.out.println("enter language country");
			l2.setCountry(scanner.next());
			System.out.println("enter language origin");
			l1.setOrigin(scanner.next());
			l2.setOrigin(scanner.next());
			Language l3=new Language();
			System.out.println("enter language id");
			l3.setId(scanner.nextInt());
			System.out.println("enter language name");
			l3.setName(scanner.next());
			System.out.println("enter language country");
			l3.setCountry(scanner.next());
			System.out.println("enter language origin");
			l3.setOrigin(scanner.next());
			System.out.println("enter person name");
			Person p1=new Person();
			p1.setId(scanner.nextInt());
			p1.setName(scanner.next());
			p1.setAdress(scanner.next());
			p1.setPhone(scanner.nextLong());
			Person p2=new Person();
//			p2.setId(21);
//			p2.setName("gani");
//			p2.setAdress("balarr");
//			p2.setPhone(19821);
//			Person p3=new Person();
//			p3.setId(31);
//			p3.setName("pirsh");
//			p3.setAdress("maharr");
//			p3.setPhone(19821);
			List<Language>list=new ArrayList<Language>();
			list.add(l1);
			list.add(l2);
			list.add(l3);
			p1.setList(list);
//			p2.setList(list);
//			p3.setList(list);
			crud.savePerson(p1, list);
			
			 
			
			
		}
		case 2 :{
			System.out.println("enter person id ");
			int id=scanner.nextInt();
			System.out.println("enter new person name");
			String name=scanner.next();
			crud.updatePerson(id, name);
			
		}
		break;
		case 3 :{
			System.out.println("enter person id ");
			int id=scanner.nextInt();
	
			crud.deletePerson(id);
			
			
		}
		break;
		case 4 : {
			System.out.println("enter person id ");
			int id=scanner.nextInt();
			System.out.println(crud.getPerson(id));
			
			
		}
		case 5 :{
			System.out.println("exit");
			flag=false;
			
		}
		}
		}while(flag);
		
		 
		
		
		
	}

}
