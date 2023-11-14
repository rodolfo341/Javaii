package ClasesYObjetos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Operacion op = new Operacion();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        System.out.println("suma => " + op.sumar(n1,n2));
        System.out.println("Resta => " + op.restar(n1,n2));
        System.out.println("Multiplicacion => " + op.multiplicar(n1,n2));
        System.out.println("division => " + op.dividir(n1,n2));

    }
}
