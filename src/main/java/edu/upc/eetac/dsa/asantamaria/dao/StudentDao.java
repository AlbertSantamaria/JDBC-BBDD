package edu.upc.eetac.dsa.asantamaria.dao;

//Clase donde se ubica el listado de declaraciones de funciones
public interface StudentDao {
	
	public Student getStudent(String key);

	public boolean deleteStudent(Student key);
}