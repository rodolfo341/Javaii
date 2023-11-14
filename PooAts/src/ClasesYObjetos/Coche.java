package ClasesYObjetos;

public class Coche {
    String color;
    String marca;
    int km;

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.color = "blanco";
        coche1.marca = "audi";
        coche1.km = 0;
        System.out.println("color: " + coche1.color);
        System.out.println("marca: " + coche1.marca);
        System.out.println("km: " + coche1.km);

        Coche coche2 = new Coche();
        coche2.color = "rojo";
        coche2.marca = "ferrari";
        coche2.km = 100;
        System.out.println("\ncolor: " + coche2.color);
        System.out.println("marca: " + coche2.marca);
        System.out.println("km: " + coche2.km);
    }
}

