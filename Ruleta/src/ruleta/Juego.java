package ruleta;

public class Juego {
    // esta clase posee los siguientes atributos:
    // Jugadores (conjunto de jugadores) y
    // Revolver
    private Jugador [] jugadores;
    private Revolver revolver;

    // Métodos:
    // finJuego(): cuando un jugador muere, devuelve true
    public boolean finJuego(){
        return revolver.disparar();
    }
    // ronda(): cada jugador se apunta y se dispara, y luego se informara del estado de la partida
    // (El jugador se dispara, no ha muerto en esa ronda, etc.).
    public void ronda(){
        for (Jugador j: jugadores) {
            j.disparar(revolver);
            System.out.println(revolver);
            if(!(j.isVivo())) break;
        }
    }
}
