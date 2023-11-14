package simulador;

import java.util.ArrayList;

public class Simulador {
    private ArrayList<Alumno> alumnos;

    public Simulador() { this.alumnos = new ArrayList<Alumno>(); }
    public Simulador(ArrayList<Alumno> alumnos) { this.alumnos = alumnos; }

    public ArrayList<Alumno> getAlumnos() { return alumnos; }
    public void setAlumnos(ArrayList<Alumno> alumnos) { this.alumnos = alumnos; }

    /*
    * La clase Simulador debe tener un método que retorna un listado de alumnos
    * generados de manera aleatoria. Las combinaciones de nombre, apellido deben
    * ser generadas de manera aleatoria. Nota: usar listas de tipo String para generar
    * los nombres y los apellidos.
     */
    private ArrayList<Alumno> listaDeAlumnos(){

        return alumnos;
    }

    /*
    * Ahora hacer un generador de combinaciones de DNI posibles, deben estar
    * dentro de un rango real de números de documentos. Y agregar a los alumnos su
    * DNI.
     */
    private void generadorDni(){
        long min = 1;
        long max = 10000000;
        for (Alumno a: alumnos) {
            a.setDni((long)Math.floor(Math.random()*(min-(max+1))+(max+1)));
        }
    }

    /*
    * El método votación de la clase Simulador que recibe el listado de alumnos y para
    * cada alumno genera tres votos de manera aleatoria. Tener en cuenta que un
    * alumno no puede votarse a sí mismo o votar más de una vez al mismo alumno.
    * Utilizar un hashset para resolver esto. Todos los alumnos deben guardarse en una
    * lista de alumnos. Nota: En este método debemos guardar en la clase Voto a el
    * alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
    * votos a cada alumno votado, que es un atributo de la clase Alumno.
     */

    //Se debe imprimir por pantalla el listado de alumnos.
     private void imprimir(){
         for (Alumno a: alumnos) {
             System.out.println(a);
         }
     }
}
