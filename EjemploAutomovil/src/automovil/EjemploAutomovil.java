package automovil;

import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.5);
        subaru.setColor("azul");

        Automovil mazda = new Automovil("Mazda", "Deportivo","cafe",6.1);

        Automovil nissan1 = new Automovil("Nissan1","Navara","Gris oscuro",3.2,40);
        Automovil nissan2 = new Automovil("Nissan2","Navara","Gris oscuro",3.2,40);

        Automovil auto = new Automovil();
        Date fecha = new Date();

        Automovil.pressAnyKeyToContinue();
        System.out.println("Son iguales (==) ? " + (nissan1 == nissan2));
        System.out.println("Son iguales (equals) ? " + (nissan1.equals(nissan2)));

        System.out.println(mazda.getFabricante());

        Automovil.pressAnyKeyToContinue();
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan1.verDetalle());
        System.out.println(auto.equals(fecha));
        System.out.println("toString implicito " + nissan1);
        System.out.println("toString implicito " + nissan1.toString());

        Automovil.pressAnyKeyToContinue();
        System.out.println(subaru.acelerarFrenar(200));
        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300,0.75));
        System.out.println("Kilometos por litro " + subaru.calcularConsumo(300,75));
        System.out.println("Kilometos por litro " + nissan1.calcularConsumo(300,75));


    }
}
