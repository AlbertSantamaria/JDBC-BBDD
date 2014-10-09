package edu.upc.eetac.dsa.asantamaria.dao;

public class DaoPatternDemo {

	public static void main(String[] args) throws Exception {

		// Objeto para realizar operaciones
		StudentDao studentDao = new StudentDaoImpl();

		boolean eliminar;

		eliminar = studentDao.deleteStudent(new Student("Victor"));
		// Variable booleana que comprueba la operación de eliminado

		if (eliminar == true) {
			System.out.println("Eliminado estudiante correctamente");
		} else {
			System.out.println("No se encuentra estudiante en la BBDD");
		}
		Student buscar = studentDao.getStudent("Machado");

		if (buscar == null) {
			System.out.println("No se encuentra estudiante en la BBDD");
		} else
			System.out.println(buscar.getName());
	}
}
