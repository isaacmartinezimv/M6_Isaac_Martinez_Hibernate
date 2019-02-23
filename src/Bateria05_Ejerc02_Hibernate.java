import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import primeroo.*;

/* 5.2. Visualiza los datos del señor “ARROYO” */

public class Bateria05_Ejerc02_Hibernate {
	
	public static void main(String[] args) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		String sql = "from Emple as e where e.apellido='ARROYO'";
		Query query = session.createQuery(sql);
		
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
