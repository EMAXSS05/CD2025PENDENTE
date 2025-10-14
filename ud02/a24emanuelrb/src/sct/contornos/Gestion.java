package sct.contornos;
import sct.contornos.gestion.Ciclo;
import sct.contornos.gestion.Modulo;

/*
 * autor: a24Emanuelrb
 */

public class Gestion {
    
    public static void main(String[] args) {
           // Crear Centro
           sct.contornos.gestion.Centro centro1 = new sct.contornos.gestion.Centro("IES Exemplo", 1234, "Vigo", "Calle Falsa", "42", 36201);
           System.out.println("Centro: " + centro1);

           // Crear Nivel
           sct.contornos.gestion.Nivel nivel1 = new sct.contornos.gestion.Nivel("Superior");
           System.out.println("Nivel: " + nivel1);

           // Crear Ciclo
           Ciclo ciclo1 = new Ciclo("DAM", "Desarrollo de Aplicaciones Multiplataforma", nivel1, centro1);
           System.out.println("Ciclo: " + ciclo1);

           // Crear Módulo
           Modulo modulo1 = new Modulo("PROG", "Programación", "Aprender Java", 200, 100, ciclo1);
           System.out.println("Módulo: " + modulo1);
           System.out.println("Sesiones AP: " + modulo1.sesionesAP());
           System.out.println("Sesiones PD: " + modulo1.sesionesPD());

           // Crear Alumno
           java.sql.Date fechaNac = java.sql.Date.valueOf("2000-01-01");
           sct.contornos.persona.Alumno alumno1 = new sct.contornos.persona.Alumno("12345678A", "Juan", "Pérez", "Gómez", "juan@example.com", 600123456, fechaNac, "X123", true);
           System.out.println("Alumno: " + alumno1.getNombre() + " " + alumno1.getApellido1());

           // Crear Profesor
           java.sql.Date fechaOpo = java.sql.Date.valueOf("2020-06-01");
           sct.contornos.persona.Profesor profesor1 = new sct.contornos.persona.Profesor("87654321B", "Ana", "López", "Martínez", "ana@example.com", 600654321, fechaNac, "Informática", "Secundaria", false, fechaOpo);
           System.out.println("Profesor: " + profesor1.getNombre() + " " + profesor1.getApellido1());

           // Crear Matrícula
           sct.contornos.gestion.Matricula matricula1 = new sct.contornos.gestion.Matricula(alumno1, modulo1, 9, "2025/2026");
           System.out.println("Matrícula: " + matricula1);
    }
    
}
