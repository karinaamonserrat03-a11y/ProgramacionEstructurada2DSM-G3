import javax.swing.JOptionPane;

public class Expresiones {
    public static void main (String[] args){

        //declaración de variables
        /*
         * En esta parte del código se van a
         * declarar varios tipos de variables
         */
        int suma;
        int resta;
        int multi, div, mod, area;
        double resultado = 0.0, potencia;
        boolean valor = true, valor2 = false;
        float f1 = (float)8.9, f2 = 10.3f;
        double d1 =12;

        //definir una cosntante
        // mayusculas en java, nunca cambia

        final double PI = 3.1416;
        String salida = "";

        //expresiones artimeticas

        suma = 3+5;
        resta = 10 -12;
        multi = 34 * 23;
        div= 10 / 2;
        mod = 10 % 2;
        potencia = Math.pow(4,2);

        salida = "===== Expresiones Aritméticos =====" +
                "\nLa suma es: " + suma  +
                "\nLa resta es: " + resta +
                "\nLa multiplicación es: " + multi +
                "\nLa división es: " + div +
                "\nEl módulo es: " + mod +
                "\nLa potencia es: " + potencia;

        JOptionPane.showMessageDialog(null, salida);
    }
}