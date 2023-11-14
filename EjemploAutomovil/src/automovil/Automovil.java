package automovil;

import java.util.Scanner;

public class Automovil {
   private String fabricante;
   private String modelo;
   private String color = "rojo";
   private double cilindrada;
   private int capacidadEstanque = 40;

   private static String colorPatente = "naranja";

   private static int capacidadEstanqueStatico = 30;

   public Automovil() {}
   public Automovil(String fabricante, String modelo) {
      this.fabricante = fabricante;
      this.modelo = modelo;
   }
   public Automovil(String fabricante, String modelo, String color) {
      this(fabricante,modelo);
      this.color = color;
   }
   public Automovil(String fabricante, String modelo, String color, double cilindrada) {
      this(fabricante,modelo,color);
      this.cilindrada = cilindrada;
   }
   public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
      this(fabricante,modelo,color,cilindrada);
      this.capacidadEstanque = capacidadEstanque;
   }

   public String getFabricante() { return fabricante; }
   public void setFabricante(String fabricante) { this.fabricante = fabricante; }
   public String getModelo() { return modelo; }
   public void setModelo(String modelo) { this.modelo = modelo; }
   public String getColor() { return color; }
   public double getCilindrada() { return cilindrada; }
   public void setColor(String color) { this.color = color; }
   public void setCilindrada(double cilindrada) { this.cilindrada = cilindrada; }
   public int getCapacidadEstanque() { return capacidadEstanque; }
   public void setCapacidadEstanque(int capacidadEstanque) { this.capacidadEstanque = capacidadEstanque; }
   public static String getColorPatente() { return colorPatente; }
   public static void setColorPatente(String colorPatente) { Automovil.colorPatente = colorPatente; }

   public String verDetalle(){
      return "\nauto.fabricante = " + this.getFabricante()
              + "\n\t" + "auto.modelo = " + this.getModelo()
              + "\n\t" + "auto.color = " + this.getColor()
              + "\n\t" + "auto.colorPatente = " + Automovil.colorPatente
              + "\n\t" + "\nauto.cilindrada = " + this.getCilindrada();
   }
   public String acelerar(int rpm){
      return "El auto " + this.fabricante + " acelerado a " + rpm + " rpm. ";
   }
   public String frenar(){
     return "El auto " + this.fabricante + " " + this.modelo + " frenando. ";
   }
   public String acelerarFrenar(int rpm){
      String acelerar = this.acelerar(rpm);
      String frenar = this.frenar();
      return this.acelerar(rpm) + this.frenar();
   }
   public double calcularConsumo(int kilometraje, double porcentajeBencina){
      return kilometraje / (capacidadEstanque * porcentajeBencina);
   }
   public double calcularConsumo(int kilometraje, int porcentajeBencina){
      return kilometraje / (capacidadEstanque * porcentajeBencina / 100F);
   }
   public static double calcularConsumoStatico(int kilometraje, int porcentajeBencina){
      return kilometraje / (Automovil.capacidadEstanqueStatico * porcentajeBencina / 100F);
   }
   static public void pressAnyKeyToContinue(){
       String seguir;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Press Enter key to continue...");
       try { seguir = teclado.nextLine(); }
       catch(Exception e){}
   }

   @Override
   public boolean equals(Object obj) {
      if(this == obj) return true;
      if(!(obj instanceof Automovil)) return false;
      Automovil auto = (Automovil) obj;   //hacemos un cast para comparar obj del mismo tipo (Automovil)
      return (this.modelo != null &&
              this.fabricante != null &&
              this.getFabricante().equals(auto.getFabricante()) &&
              this.getModelo().equals(auto.getModelo())
      );
   }

   @Override
   public String toString() {
       return "\tFabricante = " + fabricante
                + "\n\t" + "\tModelo = " + modelo
                + "\n\t" + "\tColor = " + color
                + "\n\t" + "\tCilindrada = " + cilindrada
                + "\n\t" + "\tCapacidad Estanque = " + capacidadEstanque;
   }
}
