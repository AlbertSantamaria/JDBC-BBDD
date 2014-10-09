#JDBC, MYSQL y Bases de Datos

Repositorio contenedor de las soluciones de los ejercicios sobre Singleton y DAO.

Estos dos ejercicios los he resuelto uno a partir del otro aunque inicialmente estaban 
en proyectos separados, decidi unirlos en uno manteniendo un package para cada uno.

De esta manera para ver la solucion del Singleton se debe correr la clase Main.

Para correr el DAO previamente a su ejecución se debe crear el usuario de mysql de la 
siguiente manera:

1) Abrir mysql con el usuario root desde la carpeta del repositorio y con el comando 

SOURCE crearUsuario.sql;

Se creara el usuario que usara la app.

2) Salir de mysql, reentrar con el nuevo usuario y poner el siguiente comando

SOURCE crearBBDD.sql

De esta manera se creara la bbdd que necesita el proyecto.

A partir de aqui ya esta todo listo compilar y ejecutar. 


Albert Santamaria