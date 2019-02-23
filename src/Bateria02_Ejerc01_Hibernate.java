import primeroo.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/* 2.1. Realiza el ejemplo expuesto anteriormente. Comprueba que añade una nueva fila en depart */

public class Bateria02_Ejerc01_Hibernate {

	public static void main(String[] args){
		//En primer lugar se obtiene la sesión creada por el Singleton
		SessionFactory sesion = HibernateUtil.getSessionFactory();

		//Abrimos sesión e iniciamos una transacción
		Session session = sesion.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("Inserto una fila en depart");

		//Creamos un nuevo objeto Depart y damos valor a sus atributos
		Depart dep = new Depart();
		dep.setDeptNo((byte) 234);
		dep.setDnombre("COCINA");
		dep.setLoc("TAILANDIA");

		//Guardamos en la base de datos y comprometemos la información
		session.save(dep);
		transaction.commit();
		session.close();
		System.exit(0);
	}
}