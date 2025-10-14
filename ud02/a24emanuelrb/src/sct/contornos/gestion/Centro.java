package sct.contornos.gestion;

/*
 * autor: a24emanuelrb
 */
public class Centro {
    private Integer codigo;
    private String nombre;
    private String localidad;
    private String calle;
    private String numero;
    private Integer codigoPostal;

    public Centro(){}

    public Centro(String nombre, Integer codigo, String localidad, String calle, String numero, Integer codigoPostal) {
        this.nombre=nombre;
        this.codigo = codigo;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "nombre: "+getNombre()+",código: "+getCodigo()+",localidad: "+getLocalidad()+",calle: "+getCalle()+",número: "+getNumero()+"codigo Postal: "+getCodigoPostal();
    }

    String getDireccion(){
      return "La direccion es: "+getCalle()+","+"numero "+getNumero()+","+getLocalidad();
    }

    
    


}
