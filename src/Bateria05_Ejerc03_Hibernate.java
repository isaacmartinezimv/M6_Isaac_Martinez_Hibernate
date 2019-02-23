import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import primeroo.*;

/* 5.3. Visualiza los nombres de los empleados junto con el departamento al que pertenecen. 
 * (Ayuda: consulta en el manual de HQL cómo realizar un JOIN. Observarás que es muy parecido a SQL) */

public class Bateria05_Ejerc03_Hibernate {
	public static void main(String[] args) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		String sql = "from Emple as e join Depart as d on e.depart.deptNo = d.deptNo";
		Query query = session.createQuery(sql);

		List<?> filas = query.list();
		Iterator<?> iterator = filas.iterator();
		Emple empleado;
		Depart departamento;

		while (iterator.hasNext()) {
			Object[] fila = (Object[]) iterator.next();
			empleado = (Emple)fila[0];
			departamento = (Depart)fila[1];
			System.out.println("APELLIDO: " + empleado.getApellido() + " DEPARTAMENTO: " + departamento.getDnombre());
		}
		session.close();
	}
}
