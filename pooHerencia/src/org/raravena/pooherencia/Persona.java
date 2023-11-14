package org.raravena.pooherencia;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String Email;

    public Persona() {
        System.out.println("Perosona: Inicializando constructor...");
    }

    public Persona(String nombre, String apellido, int edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        Email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
