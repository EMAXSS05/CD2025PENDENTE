package sct.contornos.persona;

import java.sql.Date;

/*
 * autor: a24Emanuelrb
 */
public class Profesor extends Persona {

    private String especialidad;
    private String cuerpo;
    private boolean sustituto;
    private Date fecOposición;

    public Profesor(){}


    public Profesor(String dni, String nombre, String apellido1, String apellido2, String correo, int movil,
            Date fecNacimiento, String especialidad, String cuerpo, boolean sustituto, Date fecOposición) {
        super(dni, nombre, apellido1, apellido2, correo, movil, fecNacimiento);
        this.especialidad = especialidad;
        this.cuerpo = cuerpo;
        this.sustituto = sustituto;
        this.fecOposición = fecOposición;
    }



    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public boolean isSustituto() {
        return sustituto;
    }

    public void setSustituto(boolean sustituto) {
        this.sustituto = sustituto;
    }

    public Date getFecOposición() {
        return fecOposición;
    }

    public void setFecOposición(Date fecOposición) {
        this.fecOposición = fecOposición;
    }

    @Override
    public String toString() {
        return "especialidad: "+getEspecialidad()+", sustituto: "+isSustituto()+",cuerpo: "+getCuerpo()+",fecOposición: "+getFecOposición();
    }

    

    

}
