import javax.swing.JOptionPane;

// Muestra un menú con opciones para sumar, restar y multiplicar dos números. El menú
// se repite hasta que el usuario decida salir.

public class Ejercicio2 {
    public static void main (String[] args){

        //definir variables
        double num1=0.0, num2=0.0, resultado=0.0;

        String menu = "", opcion= "";
        boolean sentinal = true;

            menu = "========= MENÚ =========" +
                    "\n1)Suma" +
                    "\n2)Resta" +
                    "\n3)Multiplicación" +
                    "\n4)Salir" +
                    "\nElegir opción:";
            do {
                opcion = JOptionPane.showInputDialog(menu);
                switch (opcion.toUpperCase()) {
                    //Opción de la suma
                    case "1":
                    case "Suma": {
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor 1"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor 2"));
                        resultado = num1 + num2;

                        JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
                        break;
                    }
                    //Opcion de la resta
                    case "2":
                    case "Resta": {
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor 1"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor 2"));
                        resultado = num1 - num2;
                        JOptionPane.showMessageDialog(null, "La resta es: " + resultado);
                        break;
                    }

                    //Opcion de la Multiplicación
                    case "3":
                    case "Multiplicación":
                    case "Multiplicacion": {
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor 1"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor 2"));
                        resultado = num1 * num2;
                        JOptionPane.showMessageDialog(null, "La Multiplicación es: " + resultado);
                        break;
                    }
                    //Opción de salir
                    case "4":
                    case "Salir": {
                        sentinal = false;
                        break;
                    }
                    //En caso de que ingresen un valor diferente les muestra el mensaje y regresa desde el inicio
                    default:
                        JOptionPane.showMessageDialog(null, "Ingresa valores correctos");
                }
            } while (sentinal);

    }
}
