import javax.swing.*;
import java.time.LocalDate;

public class Proyecto {
    //Atributos
    private String nombre;
    private String ubicacion;
    private String cliente;
    private LocalDate fechaInicio;
    private LocalDate progreso;
    private String etapas;

    //constructor

    public Proyecto(String nombre,String ubicacion,String cliente,LocalDate fechaInicio, LocalDate progreso,String etapas){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.cliente=cliente;
        this.fechaInicio=fechaInicio;
        this.progreso=progreso;
        this.etapas=etapas;
    }
    public Proyecto() {
        this.nombre = "No asignado";
        this.ubicacion = "No asignado";
        this.cliente = "No asignado";
        this.fechaInicio = LocalDate.now();
        this.etapas = "Etapas:";
        this.progreso = LocalDate.now();  // para poder crear el objeto vacio
    }
    //get y set


    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getProgreso() {
        return progreso;
    }

    public String getEtapas() {
        return etapas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setProgreso(LocalDate fechaFin) {
        this.progreso = fechaFin;
    }

    public void setEtapas(String etapas) {
        this.etapas = etapas;
    }
    // metodos

    public void registrarProyecto(){
        this.nombre= JOptionPane.showInputDialog(null,"Ingrese el nombre del proyecto");
        this.ubicacion =JOptionPane.showInputDialog(null,"Ingrese la ubicacion del proyecto");
        this.cliente=JOptionPane.showInputDialog(null,"Ingrese el cliente");
        this.fechaInicio= LocalDate.parse(JOptionPane.showInputDialog(null,"Ingrese la fecha de inicio del proyecto"));
        this.progreso= this.fechaInicio;

    }
    public void evaluarEtapas(){
        String etapa = JOptionPane.showInputDialog(null,"Ingrese la etapa");
        int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la califacion "));
        this.progreso = this.fechaInicio.plusDays(1);
        this.etapas = this.etapas + "Etapa: "+ etapa + "\n" + "La calificacion es: "+calificacion +"Progreso: " + this.progreso +"dias";

    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", cliente='" + cliente + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", progreso=" + progreso +
                ", etapas='" + etapas + '\'' +
                '}';
    }
}
