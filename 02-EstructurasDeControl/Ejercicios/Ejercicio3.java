import javax.swing.JOptionPane;

//Muestra un menú para convertir temperaturas de Celsius a Fahrenheit y de Fahrenheit a Celsius.

public class Ejercicio3 {
    public static void main (String[] args){

        //definir variables
        double temperatura = 0.0, convercion=0.0;
        String menu = "", opcion = "";
        boolean sentinel = true;

        menu = "======= CONVERSIONES =======" +
                "\n 1) Celsius a Fahrenheit" +
                "\n 2) Fahrenheit a Celsius" +
                "\n Elegir opción: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion){
                //Opcion de Celsius a Fahrenheit
                case "1": {
                    temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de Celsius"));

                    //Si es mayor a dicho valor realiza la operación y muestra mensaje
                    if(temperatura>-273.15){
                        convercion = (temperatura * 1.8)+32;
                        JOptionPane.showMessageDialog(null, "Celsius a Fahrenheit \n" +
                                "Valor: " + convercion + "°F");

                    } else {
                        //Si no muestra este mensaje
                        JOptionPane.showMessageDialog(null, "Temperatura cerca del Cero Absoluto");
                    }
                }
                break;
                case "2":{
                    //Opcion de Fahrenheit a Celsius
                    temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de Fahrenheit"));

                    //Si es mayor dicho valor se realiza la operación y muestra mensaje
                    if(temperatura >-459.67){
                        convercion = (temperatura - 32)/1.8;
                        JOptionPane.showMessageDialog(null, " Fahrenheit a Celsius \n" +
                                "valor: " + convercion + "°C") ;

                    } else {
                        JOptionPane.showMessageDialog(null, "Temperatura cerca del Cero Absoluto");
                    }
                }
                break;
                default:
                    //En caso de que ingresen un valor diferente les muestra el mensaje y regresa desde el inicio
                    JOptionPane.showMessageDialog(null, "Ingresa valores correctos");
                    break;
            }
        }while (sentinel);
    }
}
