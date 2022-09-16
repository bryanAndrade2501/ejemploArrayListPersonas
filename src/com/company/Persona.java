package com.company;

public class Persona {
    private int cedula, telefono;
    private String nombre, apellido, direccion;
    public Persona(int cedula, String nombre, String apellido, int telefono, String direccion) {
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.direccion=direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean equals (Persona persona){
        if(persona.getNombre().equals(nombre) && persona.getApellido().equals(apellido)){
            return true;
        } else {
            return false;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Los datos son: {" +
                "cedula=" + cedula +
                ", telefono=" + telefono +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
