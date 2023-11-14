package ruleta;

public class Revolver {
    //esta clase posee los siguientes atributos:
    // posición actual (posición del tambor donde se dispara, puede que esté la bala o no) y
    // posición bala (la posición del tambor donde se encuentra la bala).
    private int posicionActual;
    private int posicionBala;

    //Estas dos posiciones, se generarán aleatoriamente.
    public Revolver() {
        posicionActual = Metodos.aleatorio(1,6);
        posicionBala = Metodos.aleatorio(1,6);
    }

    public int getPosicionActual() { return posicionActual; }
    public void setPosicionActual(int posicionActual) { this.posicionActual = posicionActual; }
    public int getPosicionBala() { return posicionBala; }
    public void setPosicionBala(int posicionBala) { this.posicionBala = posicionBala; }

    //Métodos:
    // disparar(): devuelve true si la bala coincide con la posición actual
    public boolean disparar(){
        return posicionActual == posicionBala;
    }
    // siguienteBala(): cambia a la siguiente posición del tambor
    public void siguienteBala(){
        if(posicionActual >= 6) posicionActual = 1;
        else posicionActual++;
    }

    // toString(): muestra información del revolver (posición actual y donde está la bala)
    @Override
    public String toString() {
        return "\n\t Posicion Actual=" + posicionActual
                +"\n\t Posicion Bala=" + posicionBala;
    }
}
