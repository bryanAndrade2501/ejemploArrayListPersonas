package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Persona persona1 = new Persona(1752191673, "Alexander", "Brown", 2423423, "Carcelen");
        Persona persona2 = new Persona(1752191765, "Jose", "Gomez", 34324324, "Quitumbe");
        Persona persona3 = new Persona(1756537858, "Maria", "Torres", 35346546, "Quitumbe");
        Persona persona4 = new Persona(1757987904, "Carla", "Paucar", 34328768, "San Roque");
        Persona persona5 = new Persona(1735769894, "John", "Browm", 343232556, "San Pedro");


        ListaPersonas lista = new ListaPersonas();
        lista.agregarPersona(persona1);
        lista.agregarPersona(persona2);
        lista.agregarPersona(persona3);
        lista.agregarPersona(persona4);
        lista.agregarPersona(persona5);


        //TODO: Implementar un comparador de nombre y apellido
        lista.compararNombreYApellido("Carlos", "Andrade");

        //TODO: visualizar todos los datos de una persona
        lista.visaulizarDatos("Alexander", "Brown");

        //TODO: comparar si dos personas tienen la misma direccion
        lista.compararDireccion();
    }
}
