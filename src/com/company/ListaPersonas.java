package com.company;

import java.util.ArrayList;

public class ListaPersonas {
    private ArrayList<Persona> listaDePersonas = new ArrayList<Persona>();

    public void agregarPersona(Persona persona) {
        listaDePersonas.add(persona);
    }

    //TODO: implementacion del comparador
    public void compararNombreYApellido(String nombre, String apellido) {
        boolean i = false;
        for (Persona persona1 : listaDePersonas) {
            if (persona1.getNombre().equals(nombre) && persona1.getApellido().equals(apellido)) {
                i = true;
            } else {
                i = false;
            }
        }
        if (i) {
            System.out.println("Si existe otra persona con el mismo nombre y apellido");
        } else {
            System.out.println("No existe otra persona con el mismo nombre y apellido");
        }

    }

    public void visaulizarDatos(String nombre, String apellido) {
        int x = -1;
        for (int i = 0; i < listaDePersonas.size(); i++) {
            if (listaDePersonas.get(i).getNombre().equals(nombre) &&
                    listaDePersonas.get(i).getApellido().equals(apellido)) {
                x = i;
            }
        }
        if (x == -1) {
            System.out.println("No existe esta persona en la lista");
        } else {
            System.out.println(listaDePersonas.get(x));
        }
    }

    @Override
    public String toString() {
        return " " + listaDePersonas;
    }

    public void compararDireccion() {
        boolean x = false;
        String y;
        for (int i = 0; i < listaDePersonas.size(); i++) {
            for (int j = i + 1; j < listaDePersonas.size() - i; j++) {
                if (listaDePersonas.get(i).getDireccion().equals(listaDePersonas.get(j).getDireccion())) {
                    x = true;
                    y = listaDePersonas.get(i).getDireccion();
                    System.out.println("La direccion repetida es: " + y);
                    j = listaDePersonas.size() + 1;
                    i = listaDePersonas.size() + 1;
                    break;
                }
            }

        }


    }
}


