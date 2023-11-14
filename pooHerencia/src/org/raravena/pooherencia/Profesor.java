package org.raravena.pooherencia;

public class Profesor extends Persona{
    String asignatura;

    public Profesor() {
        System.out.println("Profesor: Inicializando constructor...");
    }

    public Profesor(String asignatura) {
        this.asignatura = asignatura;
    }

    public Profesor(String nombre, String apellido, int edad, String email, String asignatura) {
        super(nombre, apellido, edad, email);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }



}
