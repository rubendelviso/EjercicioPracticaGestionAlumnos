package ar.com.unpaz.principal;

import java.util.ArrayList;
import java.util.List;
import ar.com.unpaz.model.Alumno;

public class Principal {
    
    	private List<Alumno> listaDeAlumnos;
    	
    	//👉 Si tu clase “administra algo” → atributo
    	//👉 Si solo estás probando → variable local, este comentario del chat hace una sugerencia
    	//En nuestro caso estamos administrando los alumnos  y ademas la usan otros metodos
    	
    	
    	public Principal() {
    		listaDeAlumnos = new ArrayList<>();
    	}
    	
    	public void agregarAlumno(Alumno alumno) {
    		if (!alumno.verificarAcceso()) {
    			System.out.println("No se pudo ingresar al alumno " + alumno.getNombre());
    			
    		}
    		else {
        		listaDeAlumnos.add(alumno);}}
        
    	
    	public void MostrarAlumnos() {for (Alumno alumno : listaDeAlumnos) {
			System.out.println("alumno: "+alumno.getNombre()+"\t Legajo:"+alumno.getLegajo()+ "\t Edad:" + alumno.getEdad());
		}}
    	
    	public static void main (String[]args) {
    		
    		Principal Objlista= new Principal(); //Objeto lista
    		
    		Alumno alumno1 = new Alumno("Ruben",22,3);
    		Alumno alumno2 = new Alumno("Alexis",0,-2);
    		Alumno alumno3 = new Alumno("Lurdes",12,4);
    		
    		Objlista.agregarAlumno(alumno1);
    		Objlista.agregarAlumno(alumno2);
    		Objlista.agregarAlumno(alumno3);
    		
    		Objlista.MostrarAlumnos();
    		
    		
    		//Hay dos tipos de metodos, unos que solo pueden ser accedidos con la definicion de la clase
    		//Y los otros metodos son con un instancia de la clase (objeto)
    		
    		
    	}
    	
    	
	

    }
  





	


