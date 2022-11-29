package cl.duoc.pruebazoo.DTO;

import cl.duoc.pruebazoo.Util.Validaciones;
import java.time.LocalDate;

public class Cuidador {
    
    private int id;
    private String Nombre;
    private String Apellido;
    private LocalDate fechaNacimiento;
    private String rut;
    private int telefono;
    private boolean estadoCivil;

    public Cuidador(int id, String Nombre, String Apellido, LocalDate fechaNacimiento, String rut, int telefono, boolean estadoCivil) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
    }
    
    public Cuidador() {
        this.id = 0;
        this.Nombre = "";
        this.Apellido = "";
        this.fechaNacimiento = LocalDate.now();
        this.rut = "";
        this.telefono = 0;
        this.estadoCivil = false;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;

    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    @Override
    public String toString(){
       return "";
    }
    
}
