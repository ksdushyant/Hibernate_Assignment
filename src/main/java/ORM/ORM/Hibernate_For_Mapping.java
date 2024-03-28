package ORM.ORM;



import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import Enitity.Badge;
import Enitity.actor;
import Enitity.child;
import Enitity.emp;
import Enitity.movie;
import Enitity.parent;


public class Hibernate_For_Mapping {

    @SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory(){
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = null;

        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate_db");
        settings.put(Environment.USER, "root");
        settings.put(Environment.PASS, "password");
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.HBM2DDL_AUTO, "update");

        configuration.setProperties(settings);
        configuration.addAnnotatedClass(emp.class);
        configuration.addAnnotatedClass(Badge.class);
        configuration.addAnnotatedClass(parent.class);
        configuration.addAnnotatedClass(child.class);
        configuration.addAnnotatedClass(movie.class);
        configuration.addAnnotatedClass(actor.class);
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        return sessionFactory;
    }

}