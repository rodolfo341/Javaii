package org.raravena.pooherencia;

public class AlumnoInternacional extends Alumno {
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional() {
        System.out.println("AlummnoInternacional: Inicializando constructor...");
    }

    public AlumnoInternacional(String pais, double notaIdiomas) {
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }

    public AlumnoInternacional(String institucion, double notaMatematicas, double notaLenguaje, double notaHistoria, String pais, double notaIdiomas) {
        super(institucion, notaMatematicas, notaLenguaje, notaHistoria);
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }

    public AlumnoInternacional(String nombre, String apellido, int edad, String email, String institucion, double notaMatematicas, double notaLenguaje, double notaHistoria, String pais, double notaIdiomas) {
        super(nombre, apellido, edad, email, institucion, notaMatematicas, notaLenguaje, notaHistoria);
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }
}
