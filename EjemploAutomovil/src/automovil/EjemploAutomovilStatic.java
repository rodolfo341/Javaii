
package automovil;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.5);
        subaru.setColor("azul");

        Automovil mazda = new Automovil("Mazda", "Deportivo","cafe",6.1);
        System.out.println("mazda.getFabricante = " + mazda.getFabricante());

        Automovil nissan1 = new Automovil("Nissan1","Navara","Gris oscuro",3.2,40);
        Automovil nissan2 = new Automovil("Nissan2","Navara","Gris oscuro",3.2,40);

        Automovil.setColorPatente("***************amarillo");
        Automovil auto = new Automovil();

        Automovil.pressAnyKeyToContinue();
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan1.verDetalle());

        Automovil.pressAnyKeyToContinue();
        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente()" + Automovil.getColorPatente());
        System.out.println("kilometros por litro" + Automovil.calcularConsumoStatico(300,60));
    }
}
