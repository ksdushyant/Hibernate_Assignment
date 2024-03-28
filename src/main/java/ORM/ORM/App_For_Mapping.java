package ORM.ORM;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Enitity.Badge;
import Enitity.actor;
import Enitity.child;
import Enitity.emp;
import Enitity.movie;
import Enitity.parent;

/**
 * Hello world!
 *
 */
public class App_For_Mapping 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = Hibernate_For_Mapping.getSessionFactory();
       
       
//       // ONE TO ONE MAPPING
//       Badge ad = new Badge();
//       ad.setId(101);
//       ad.setBadge("Level 1");
//       
//       emp e = new emp();
//       e.setId(201);
//       e.setaccess_level(ad);
//       e.setjob_title("Software Developer Intern");
//       
//       Session session = sessionFactory.openSession();
//       session.beginTransaction();
//       
//       session.persist(ad);
//       session.persist(e);
//       
////       emp e_temp = (emp) session.get(emp.class, 201);
////       System.out.println(e_temp.getjob_title());
//       
//       
//       session.getTransaction().commit();
//       session.close();
//       sessionFactory.close();
       
       
//       // ONE TO MANY MAPPING
//       
//       child c1 = new child(001,"Dushyant");
//       child c2 = new child(002,"Naveen");
//       
//       List<child> list1 = new ArrayList<child>();
//       list1.add(c1);
//       list1.add(c2);
//       
//       parent p1 = new parent();
//       p1.setName("Father");
//       p1.setParent_id(101);
//       p1.setChildren(list1);
//       	
//       Session session = sessionFactory.openSession();
//       session.beginTransaction();
//       
////       session.persist(p1);
////       session.persist(c1);
////       session.persist(c2);
////       
//       parent temp = (parent)session.get(parent.class, 101);
//       System.out.println(temp.getName());
//       
//       session.getTransaction().commit();
//       session.close();
//       sessionFactory.close();
       
       
       // MANY TO MANY MAPPING
       
    	actor a1 = new actor();
    	a1.setActor_id(011);
    	a1.setName("Shah Rukh Khan");
    	
    	actor a2 = new actor();
    	a1.setActor_id(012);
    	a1.setName("Salman Khan");
    	
    	movie m1 = new movie();
    	m1.setMovie_id(101);
    	m1.setName("Karan Arjun");
    	
    	movie m2 = new movie();
    	m2.setMovie_id(102);
    	m2.setName("Pathaan");
    	
    	List<movie> movie_list = new ArrayList<movie>();
    	movie_list.add(m1);
    	movie_list.add(m2);
    	
    	List<actor> actor_list = new ArrayList<actor>();
    	actor_list.add(a1);
    	actor_list.add(a2);
    	
    	a1.setMovies(movie_list);
    	m1.setActors(actor_list);
    	
    	
       Session session = sessionFactory.openSession();
       session.beginTransaction();
       
       session.persist(m1);
       session.persist(m2);
       session.persist(a1);
       session.persist(a2);
       
//       session.createQuery("from actor",actor.class).list().forEach(System.out::println);
       
       session.getTransaction().commit();
       session.close();
       sessionFactory.close();
    }
}



