package simulador;

public class Alumno {
    private String nombre;
    private String apellido;
    private long dni;
    private int cantidadDeVotos;

    public Alumno() {
    }
    public Alumno(String nombre, String apellido, long dni, int cantidadDeVotos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public long getDni() { return dni; }
    public void setDni(long dni) { this.dni = dni; }
    public int getCantidadDeVotos() { return cantidadDeVotos; }
    public void setCantidadDeVotos(int cantidadDeVotos) { this.cantidadDeVotos = cantidadDeVotos; }

    @Override
    public String toString() {
        return  "Nombre='" + nombre
                + "\n\t" + "Apellido='" + apellido
                + "\n\t" + "DNI=" + dni
                + "\n\t" + "Cantidad de votos=" + cantidadDeVotos;
    }
}
