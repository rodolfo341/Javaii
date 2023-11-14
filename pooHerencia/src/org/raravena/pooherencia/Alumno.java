package org.raravena.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematicas;
    private double notaLenguaje;
    private double notaHistoria;

    public Alumno() {
        System.out.println("Alummno: Inicializando constructor...");
    }

    public Alumno(String institucion, double notaMatematicas, double notaLenguaje, double notaHistoria) {
        this.institucion = institucion;
        this.notaMatematicas = notaMatematicas;
        this.notaLenguaje = notaLenguaje;
        this.notaHistoria = notaHistoria;
    }

    public Alumno(String nombre, String apellido, int edad, String email, String institucion, double notaMatematicas, double notaLenguaje, double notaHistoria) {
        super(nombre, apellido, edad, email);
        this.institucion = institucion;
        this.notaMatematicas = notaMatematicas;
        this.notaLenguaje = notaLenguaje;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
