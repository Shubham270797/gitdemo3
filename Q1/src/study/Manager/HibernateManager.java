package study.Manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import study.entity.AddressEntity;



public class HibernateManager {
	
	Session session=null;
	public static Session getSession(){
		//Session session=getSession();
		//Reading the hibernate.cfg.xml from classpath
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		//Create MetadataSources
		MetadataSources sources=new MetadataSources(registry);
		//create Metadata
		Metadata metadata=sources.getMetadataBuilder().build();
		//
		SessionFactory sessionFactory= metadata.getSessionFactoryBuilder().build();
		
		Session session=sessionFactory.openSession();//Start transaction
		return session;
	}
	
	public  void addIntoCustomer(String fname,String lname,String address) {
		session=getSession();
		session.beginTransaction();
	AddressEntity obj=new AddressEntity(fname,lname,address);
		session.save(obj);
		System.out.println("inserted succesfully");
		session.getTransaction().commit();
	}
	
}
