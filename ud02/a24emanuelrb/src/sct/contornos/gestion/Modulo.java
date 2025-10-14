package sct.contornos.gestion;

/*
 * autor: a24Emanuelrb
 */
public class Modulo {
   private String codigo;
   private String nombre;
   private String descripcion;
   private Integer horas;
   private Integer sesiones;
   private Ciclo ciclo;

   public Modulo() {
   }

   public Modulo(String codigo, String nombre, String descripcion, Integer horas, Integer sesiones, Ciclo ciclo) {
      this.codigo = codigo;
      this.nombre = nombre;
      this.descripcion = descripcion;
      this.horas = horas;
      this.sesiones = sesiones;
      this.ciclo = ciclo;
   }

   public String getCodigo() {
      return codigo;
   }

   public void setCodigo(String codigo) {
      this.codigo = codigo;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getDescripcion() {
      return descripcion;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }

   public Integer getHoras() {
      return horas;
   }

   public void setHoras(Integer horas) {
      this.horas = horas;
   }

   public Integer getSesiones() {
      return sesiones;
   }

   public void setSesiones(Integer sesiones) {
      this.sesiones = sesiones;
   }

   public Ciclo getCiclo() {
      return ciclo;
   }

   public void setCiclo(Ciclo ciclo) {
      this.ciclo = ciclo;
   }

   public Integer sesionesAP() {
      double calculo = sesiones * 0.10; // 10%
      return (int) Math.round(calculo);
   }

   public Integer sesionesPD() {
      double calculo = sesiones * 0.20; // 20%
      return (int) Math.round(calculo);
   }

   @Override
   public String toString() {
      return "codigo: " + getCodigo() + ",nombre: " + getNombre() + ",descripcion: " + getDescripcion() + ",horas: "
            + getHoras() + ",sesiones: " + getSesiones() + ",ciclo: " + ciclo.getNombre();
   }

}
