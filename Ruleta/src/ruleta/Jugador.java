package ruleta;

public class Jugador {
    //esta clase posee los siguientes atributos:
    // id (representa el número del jugador, empieza en 1)
    // nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo)
    // vivo (indica si está vivo o no el jugador)
    private int id;
    private String nombre;
    private boolean vivo;

    public Jugador() {
    }
    // nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo)
    public Jugador(String nombre) {
        this.nombre = nombre + this.id;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    //Métodos:
    //disparar(Revolver r): el jugador se apunta y se dispara, si la bala se dispara, el jugador muere.
    public void disparar(Revolver r){
        this.nombre = nombre;
        if(r.disparar()) {
            System.out.println("El jugador " + this.nombre + " esta muerto.");
            this.vivo = true;
        }
        else {
            System.out.println("El jugador "+ this.nombre + " sigue vivo.");
            this.vivo = false;
        }
    }
}
