package ATS001;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    public static void main(String[] args) {
        llenarPoligono();
        mostrarPoligonos();
    }

    public static void llenarPoligono(){
        char respuesta;
        int opcion;
        do {
            do {
                System.out.println("ingrese poligono: ");
                System.out.println("1) Triangulo.");
                System.out.println("2) Rectangulo.");
                System.out.println("Ingrese opcion: ");
                opcion = leer.nextInt();
            }while(opcion <1 || opcion >2);
            switch (opcion){
                case 1: llenarTriangulo();
                    break;
                case 2: llenarRectangulo();
                    break;
            }
            System.out.println("introducir otro poligono? s/n ");respuesta = leer.next().charAt(0);
            System.out.println("");
        }while(respuesta == 's' || respuesta == 'S');
    }

    public static void llenarTriangulo(){
        double lado1;
        double lado2;
        double lado3;
        System.out.println("ingrese lado1");lado1 = leer.nextInt();
        System.out.println("ingrese lado2");lado2 = leer.nextInt();
        System.out.println("ingrese lado3");lado3 = leer.nextInt();

        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        poligono.add(triangulo);
    }

    public static void llenarRectangulo(){
        double lado1;
        double lado2;
        System.out.println("ingrese lado1");lado1 = leer.nextDouble();
        System.out.println("ingrese lado2");lado2 = leer.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        poligono.add(rectangulo);
    }

    public static void mostrarPoligonos(){
        for (Poligono p:
             poligono) {
            System.out.println(p.toString());
            System.out.println("Area : " + p.area());
        }
    }
}
