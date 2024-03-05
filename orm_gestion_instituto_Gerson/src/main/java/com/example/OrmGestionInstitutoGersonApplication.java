package com.example;

import com.example.Servicio.AlumnosServicio;
import com.example.Servicio.DireccionesServicio;
import com.example.Servicio.ModuloServicio;
import com.example.Servicio.ProfesorServicio;
import com.example.entities.Alumnos;
import com.example.entities.Direcciones;
import com.example.entities.Modulos;
import com.example.entities.Profesores;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.*;

@SpringBootApplication
public class OrmGestionInstitutoGersonApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(OrmGestionInstitutoGersonApplication.class, args);

		var alumnosServicio = context.getBean(AlumnosServicio.class);
		var direccionServicio = context.getBean(DireccionesServicio.class);
		var modulosServicio = context.getBean(ModuloServicio.class);
		var profesoresServicio = context.getBean(ProfesorServicio.class);

	//	Alumnos alumno = new Alumnos(null,"12345","Ana","viciano","fabregat","686686686");
	//	alumnosServicio.insertarAlumno(alumno);
		// Nota la primera vez que añado un alumno dice que hay un error porque no puede haber dos con el mismo id , despues probe otra vez y si fue

	//	Direcciones direccion = new Direcciones(null,139,"mayor","castellón","catellón",null);
	//	direccionServicio.insertarDireccion(direccion);
		// Cambiar el numero en direccion cada vez que insertemos una nueva direccion

	//	Modulos modulo = new Modulos(null,"DAW",400,"DWES",1,null);
	//	modulosServicio.insertarModulo(modulo);

	//	Profesores profesor = new Profesores(null,"nombreP","apellido1P","apellido2P","117",17,null, Collections.singletonList(null));
	//	profesoresServicio.insertarProfesor(profesor);
		//profesor_direccion tiene que estar en la id de Direcciones y no puede repetirse 2 veces la misma profesor_direccion y el telefono tiene que ser cada vez diferente .
	}
}
