import javax.swing.*;
import java.time.LocalDate;

public class Proyecto {
    //Atributos
    private String nombre;
    private String ubicacion;
    private String cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String etapas;

    //constructor

    public Proyecto(String nombre,String ubicacion,String cliente,LocalDate fechaInicio, LocalDate fechaFin,String etapas){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.cliente=cliente;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
        this.etapas=etapas;
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

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public int getEtapas() {
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

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
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

    }
    public void evaluarEtapas(){

    }
}
