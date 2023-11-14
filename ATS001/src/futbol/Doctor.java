package futbol;

public class Doctor extends Persona{
    private String titulacion;
    private int anyosExperiencia;

    public Doctor(String nombre, String apellido, int edad, String titulacion, int anyosExperiencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anyosExperiencia = anyosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                super.toString() +
                "titulacion='" + titulacion + '\'' +
                ", anyosExperiencia=" + anyosExperiencia +
                '}';
    }
}
