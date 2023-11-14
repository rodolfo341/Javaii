package org.raravena.pooherencia;

public class ejemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        //Persona alumno = new Alumno();
        alumno.setNombre("Rodolfo");
        alumno.setApellido("Aravena");
        alumno.setInstitucion("UC");
        alumno.setEmail("jlkjlkj@kljl.com");
        alumno.setNotaHistoria(5.5);
        alumno.setNotaLenguaje(6.5);
        alumno.setNotaMatematicas(7.0);

        AlumnoInternacional alumnoInternacinal = new AlumnoInternacional();
        alumnoInternacinal.setNombre("Pablo");
        alumnoInternacinal.setApellido("Escobar");
        alumnoInternacinal.setEdad(18);
        alumnoInternacinal.setEmail("ñlkñlkñlkñ@lkl.com");
        alumnoInternacinal.setInstitucion("Instituto Nacional");
        alumnoInternacinal.setPais("Australia");
        alumnoInternacinal.setNotaHistoria(4.2);
        alumnoInternacinal.setNotaIdiomas(7.0);
        alumnoInternacinal.setNotaLenguaje(5.6);
        alumnoInternacinal.setNotaMatematicas(7.0);

        Profesor profesor = new Profesor();
        profesor.setNombre("profe");
        profesor.setApellido("Loquini");
        profesor.setAsignatura("Matematicas");

        System.out.println("Alumno " + alumno.getNombre()
                                    + " " + alumno.getApellido()
                                    + " " + alumno.getInstitucion());
        System.out.println("Alumno internacional " + alumnoInternacinal.getNombre()
                                    + " " + alumnoInternacinal.getApellido()
                                    + " " + alumnoInternacinal.getInstitucion());
        System.out.println("Profesor de " + profesor.getAsignatura()
                                    + " " + profesor.getNombre()
                                    + " " + profesor.getApellido());

        Class clase = alumnoInternacinal.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de " + padre);
            clase = clase.getSuperclass();
        }
    }
}
