package edu.upc.eetac.dsa.asantamaria.dao;

public class DaoPatternDemo {

	public static void main(String[] args) throws Exception {

		// Objeto para realizar operaciones
		StudentDao studentDao = new StudentDaoImpl();

		boolean eliminar;
		String student_to_delete="Albert";
		
		eliminar = studentDao.deleteStudent(new Student(student_to_delete));
		// Variable booleana que comprueba la operación de eliminado

		if (eliminar == true) {
			System.out.println("[---] Eliminado correctamente el estudiante: "+student_to_delete+"\n");
		} else {
			System.out.println("[XXX] No se encuentra estudiante en la BBDD\n");
		}
		
		String profesor="Machado";
		System.out.println("[---] Buscando estudiantes alumnos de "+profesor);

		Student buscar = studentDao.getStudent(profesor);
		
		if (buscar == null) {
			System.out.println("[XXX] No se encuentra estudiante en la BBDD");
		} else
			System.out.print("[VVV] Alumnos del profesor "+profesor+": "+buscar.getName());

		}
	
}
