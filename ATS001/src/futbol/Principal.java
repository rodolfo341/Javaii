package futbol;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Persona> persona = new ArrayList<Persona>();

    public static void main(String[] args) {
        llenar();
        mostrar();
        menu();
    }
    public static void mostrar(){
        for (Persona p: persona) {
            System.out.println(p.toString());
        }
    }
    public static void llenar(){
        Futbolista futbolista1 = new Futbolista("Alexis","Sanchez",30,9,"delantero");
        Futbolista futbolista2 = new Futbolista("Arturo","Vidal",32,8,"medio Campo");
        Futbolista futbolista3 = new Futbolista("Gary","Medel",33,5,"defensa");
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(futbolista3);

        Entrenador entrenador1 = new Entrenador("Claudio","Borghi",55,"Improvizacion");
        Entrenador entrenador2 = new Entrenador("Luis","Santibañez",70,"defensiva");
        persona.add(entrenador1);
        persona.add(entrenador2);

        Doctor doctor1 = new Doctor("Parche","Adams",64,"psiquiatra",35);
        Doctor doctor2 = new Doctor("Gregory","House",61,"Diagnostico",22);
        persona.add(doctor1);
        persona.add(doctor2);
    }
    public static void menu(){
        char res;
        int opcion;
        do {
            do {
                System.out.println("ingrese opcion: ");
                System.out.println("1) Viaje de equipo: ");
                System.out.println("2) Entrenamiento: ");
                System.out.println("3) Partido: ");
                System.out.println("4) Planificar entrenamiento: ");
                System.out.println("5) Entrevista: ");
                System.out.println("6) Curar lesion: ");
                opcion = sc.nextInt();
            }while(opcion < 1 || opcion > 6);
            switch (opcion){
                case 1: //viaje de equipo
                    break;
                case 2: //Entrenamiento
                    break;
                case 3: //Partido
                    break;
                case 4: //planificar entrenamiento
                    break;
                case 5: //entrevista
                    break;
                case 6: //curar lesion
                    break;
            }
            System.out.println("Continur? s/n.");res = sc.next().charAt(0);
            System.out.println("");
        }while(res == 's' || res == 'S');
    }


}
