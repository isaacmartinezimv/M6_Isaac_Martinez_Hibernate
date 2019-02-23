import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import primeroo.*;

/* 5.1. Visualiza el apellido y salario de los empleados del departamento 20. (Ayuda: la consulta HQL
 * necesaria es: “from Emple as e where e.depart.deptNo=20”) */

public class Bateria05_Ejerc01_Hibernate {
	public static void main(String[] args) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();

		Query query = session.createQuery("from Emple as e where e.depart.deptNo=20");
		List<Emple> listaEmpleados = query.list();
		Iterator<Emple> iterator = listaEmpleados.iterator();
		Emple empleado;

		while (iterator.hasNext()) {
			empleado = iterator.next();
			System.out.println("Apellido: " + empleado.getApellido() + " Salario: " + empleado.getSalario());
		}

		session.close();
	}
}
