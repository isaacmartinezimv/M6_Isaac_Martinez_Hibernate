import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.Date;
import primeroo.*;

/* 2.2. Realiza un programa Java (puedes modificar el Main anterior) que añada una nueva fila 
 * en la tabla emple. El nuevo empleado estará asignado al departamento 10. Para asignarle el departamento
 * será necesario crear un objeto de tipo Depart y asignar como número de departamento el valor 10 con 
 * el método setDeptNo(). */

public class Bateria02_Ejerc02_Hibernate {
	public static void main(String[] args) {

		//En primer lugar se obtiene la sesión creada por el Singleton.
		SessionFactory sesion = HibernateUtil.getSessionFactory();

		//Abrimos sesión e iniciamos una transacción
		Session session = sesion.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("Inserto una fila en emple");

		//Creamos un nuevo objeto Depart y damos valor a sus atributos
		Depart dep = new Depart();
		Date fecha = new Date();
		Emple emp = new Emple();
		
		emp.setEmpNo(9876);
		emp.setDepart(new Depart(10));
		emp.setApellido("CALIMERO");
		emp.setOficio("BUCEADOR");
		emp.setDir(7844);
		emp.setFechaAlt(fecha);
		emp.setSalario(5275);

		//Guardamos en la base de datos y comprometemos la información
		session.save(emp);
		transaction.commit();
		session.close();
		System.exit(0);
	}
}