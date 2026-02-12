import javax.swing.JOptionPane;

//Ejercicio 1. Solicita números enteros hasta que el usuario ingrese un número negativo. Muestra la
//suma total y cuántos números válidos se ingresaron.

public class Ejercicio1 {
    public static void main (String[] args) {

        //Definir variables
        int num = 0, numValidos=0, sumaTotal=0, cont=0;
        boolean sentinal = true;

        do{
            // Solicita el numero
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"));

                // Condición
                if (num>=0){
                    sumaTotal = sumaTotal + num ;
                    cont++;
                } else {
                    sentinal = false;
                }
        } while(sentinal);

        JOptionPane.showMessageDialog(null, "Suma Total: " + sumaTotal +
                                                                   "\nNúmeros Validos: " + cont);
    }
}
