package sct.contornos.persona;

import java.sql.Date;

/*
 * autor: a24Emanuelrb
 */
public class Alumno extends Persona {
    String codigoXade;
    private boolean autorizaTutores;

    public Alumno(){

    }
    

    public Alumno(String dni, String nombre, String apellido1, String apellido2, String correo, int movil,
            Date fecNacimiento, String codigoXade, boolean autorizaTutores) {
        super(dni, nombre, apellido1, apellido2, correo, movil, fecNacimiento);
        this.codigoXade = codigoXade;
        this.autorizaTutores = autorizaTutores;
    }



    public String getCodigoXade() {
        return codigoXade;
    }
    public void setCodigoXade(String codigoXade) {
        this.codigoXade = codigoXade;
    }
    public boolean isAutorizaTutores() {
        return autorizaTutores;
    }
    public void setAutorizaTutores(boolean autorizaTutores) {
        this.autorizaTutores = autorizaTutores;
    }

    

}
