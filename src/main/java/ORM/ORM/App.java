package ORM.ORM;

import Enitity.Employee;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	    Employee employee1 = new Employee();
	    employee1.setEmpName("Manoj Arora");
       employee1.setEmpEmail("dushyant@gmail.com");
       Employee employee2 = new Employee();
       employee2.setEmpName("Test");
       employee2.setEmpEmail("second@gmail.com");
       SessionFactory sessionFactory = HibernateUtlis.getSessionFactory();
       Session session = sessionFactory.openSession();
       session.beginTransaction();
       
       
       //Insert Operation
       System.out.println("Inserting Deatils of Two Employees");
       session.persist(employee1);
       session.persist(employee2);
//       session.getTransaction().commit();
       
       //Read Operation
       System.out.println("Reading Employee Deatils with ID = 2");
       Employee savedEmployee = session.get(Employee.class, 2);
       System.out.println(savedEmployee);
       
       
       // Update Operation
       employee1.setEmpName("Dushyant Kumar Singh");
       session.merge(employee1);
       savedEmployee = session.get(Employee.class, 1);
       System.out.println(savedEmployee);
       
       
       //Remove Operation
       session.remove(employee2);
       session.getTransaction().commit();
       System.out.println("Printing all the Employee Details");
       session.createQuery("From Employee ", Employee.class).list().forEach(System.out::println);
       session.close();
    }
}
