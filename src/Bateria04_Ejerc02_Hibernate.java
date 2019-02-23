import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import java.util.Set;
import java.util.Iterator;	
import primeroo.*;

/* 4.2. Obtén los datos del departamento 10 y el APELLIDO y SALARIO de sus empleados. 
 * Ayuda: para obtener los empleados usamos el método getEmples() de la clase Depart y usamos un 
 * Iterator (java.util.Iterator) para recorrer la lista de empleados. */

public class Bateria04_Ejerc02_Hibernate {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory (new StandardServiceRegistryBuilder().configure().build() ) ;
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction transaction = session.beginTransaction();

		Depart dep = new Depart();
		Emple emp;
		
		try {
			dep = session.load(Depart.class, 10);
		} catch (ObjectNotFoundException o) {
			System.out.println("El departamento no existe");
		}
		
		Set<Emple> listaEmpleados = dep.getEmples();
		Iterator<Emple> iterator = listaEmpleados.iterator();

		while(iterator.hasNext()) {
			emp = iterator.next();
			System.out.printf("APELLIDO: %s%n", emp.getApellido());
			System.out.printf("SALARIO: %s%n", emp.getSalario());
		}

		transaction.commit();
		session.close();
		System.exit(0);
	}
}