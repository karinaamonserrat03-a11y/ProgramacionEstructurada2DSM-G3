import javax.swing.JOptionPane;

//Solicita un número entero positivo y determina si es primo.

public class Ejercicio5 {
    public static void main (String[] args) {

        //Definir variables
        int num = 0;
        boolean sentinel = true;

        do {

            int cont=0;
            //El usuario ingresa el valor
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número"));

            //Sí el valor ingresado es mayor a 0 continua
            if (num >0) {

                //Inicia el ciclo
                for (int i = 1; i <=num ; i++) {
                    if (num%i==0){ //Calcula el residuo
                        cont++; //Suma 1
                    }
                }
                // Sí el contador tiene exactamente 2 divisores nos mostra dicho mensaje
                if (cont == 2){
                    JOptionPane.showMessageDialog(null, "El numero es PRIMO");
                } else{
                    //Sino nos muestra lo siguiente
                    JOptionPane.showMessageDialog(null, "El número NO es PRIMO");
                }
            } else {
                //Si ingresar un número negativo, nos indica cuales son los indicados y nos regresa al inicio del código
                JOptionPane.showMessageDialog(null, "Ingresa valores positivos");
            }
        } while (sentinel); //mientras sea true continua el ciclo
    }
}
