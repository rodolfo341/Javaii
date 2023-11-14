
package electrodomesticos;

public class SuperClaseElectrodomesticos {
    /*
    atributos:
    precio base,
    color,
    consumo energético (letras entre A y F) y
    peso. Por defecto, el
    color será blanco, el consumo energético sera F, el precioBase de $1000 y el peso
    de 5 kg. Los colores disponibles para los electrodomésticos son blanco, negro,
    rojo, azul y gris.
     */
    private int precioBase =1000;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private double peso = 5;

    public SuperClaseElectrodomesticos() {
        this.precioBase =1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }
    public SuperClaseElectrodomesticos(int precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }
    public SuperClaseElectrodomesticos(int precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    //Métodos getters y setters de todos los atributos.
    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /*
        Método comprobarConsumoEnergetico(char letra): comprueba que la letra
    es correcta, sino es correcta usara la letra por defecto. Este método se debe
    invocar al crear el objeto y no será visible.
     */
    private void comprobarConsumoEnergetico(char letra){
        if(letra=='a' || letra=='b' || letra=='c' || letra=='d' || letra=='e' || letra=='f' ||
           letra=='A' || letra=='B' || letra=='C' || letra=='D' || letra=='E' || letra=='F'){
            setConsumoEnergetico(letra);
        }else{
            setConsumoEnergetico('F');
        }
    }
    /*
        Método comprobarColor(String color): comprueba que el color es correcto, y
    si no lo es, usa el color por defecto. Este método se invocará al crear el objeto
    y no será visible.
    blanco, negro, rojo, azul y gris.
     */
    private void comprobarColor(String color){
        if(color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") ||
                color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") ||
                color.equalsIgnoreCase("gris") ) setColor(color);
        else setColor("blanco");
    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará
    el precio. Esta es la lista de precios:
    LETRA PRECIO
    A $1000
    B $800
    C $600
    D $500
    E $300
    F $100
    TAMAÑO PRECIO
    Entre 0 y 19 kg $100
    Entre 20 y 49 kg $500
    Entre 50 y 79 kg $800
    Mayor que 80 kg $1000*/

    public double precioFinal(char consumoEnergetico, double precioBase){
        double precio;
        this.consumoEnergetico = consumoEnergetico;
        this.precioBase = precioBase;
        comprobarConsumoEnergetico(consumoEnergetico);
        switch (consumoEnergetico){
            case 'a' || 'A': precio = 1000; break;
            case 'b' || 'B': precio = 800; break;
            case 'c' || 'C': precio = 600; break;
            case 'd' || 'D': precio = 500; break;
            case 'e' || 'E': precio = 300; break;
            case 'f' || 'F': precio = 100; break;
        }
        switch (precioBase){
            case (precioBase >= 0 && precioBase < 20) : precio += 100; break;
            case (precioBase >= 20 && precioBase < 50) : precio += 500; break;
            case (precioBase >= 50 && precioBase < 80) : precio += 800; break;
            case (precioBase >= 80) : precio += 1000; break;
        }
        return precio;
    }

}
