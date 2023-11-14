package simulador;

import java.util.ArrayList;

public class voto {
    private Alumno alumno;
    private ArrayList<Alumno> alumnosVoto;

    public voto() {
        this.alumnosVoto = new ArrayList<Alumno>();
    }

    public Alumno getAlumno() { return alumno; }
    public void setAlumno(Alumno alumno) { this.alumno = alumno; }
    public ArrayList<Alumno> getAlumnosVoto() { return alumnosVoto; }
    public void setAlumnosVoto(ArrayList<Alumno> alumnosVoto) { this.alumnosVoto = alumnosVoto; }


}
