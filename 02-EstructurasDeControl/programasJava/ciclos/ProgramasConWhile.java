import javax.swing.JOptionPane;

/*Una compañía de seguros tiene contratados a n vendedores. Cada uno hace tres ventas a la
semana. Su política de pagos es que un vendedor recibe un sueldo base y un 10% extra por
comisiones de sus ventas. El gerente de su compañía desea saber cuánto dinero obtendrá
en la semana cada vendedor por concepto de comisiones por las tres ventas realizadas, y
cuanto tomando en cuenta su sueldo base y sus comisiones.*/

public class ProgramasConWhile {
    public static void main (String[] args){
        //Declaración de variables

        final double PORCENTAJE = 0.10;
        double sueldoB=0.0, v1 =0.0, v2=0.0, v3 =0.0, comision = 0.0, total = 0.0, totalS = 0.0;
        int numTraba =0;
        String salida = "";

        String menu = "", opcion = "";
        boolean sentinel = true;

        //Se crea la cadena del texto para las opciones del menu
        menu ="========== MENU CICLO WHILE==========\n" +
                "1)Vendedores\n" +
                "2)Opción 2\n" +
                "3)Opción 3\n" +
                "4)Salir\n" +
                "Elegir Opción: " ;

        do {

            //Mostrar el menu
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion.toUpperCase()) {                             //string, caracteres
                case "1":
                case "A":

                    numTraba = Integer.parseInt(JOptionPane.showInputDialog("Numeros de Trabajadores"));

                    //Válida en número de trabajadores
                    if (numTraba >0){
                        sueldoB = Double.parseDouble(JOptionPane.showInputDialog("Sueldo Base"));

                        if(sueldoB >0.0){
                            int i = 1;
                            salida = "===== NOMINA =====\n";
                            while (i<=numTraba) {
                                v1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 1"));
                                v2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 2"));
                                v3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 3"));

                                if (v1 <= 0.0 || v2 <= 0.0 || v3 <= 0.0) {
                                    JOptionPane.showMessageDialog(null,
                                            "Una o más de las ventas no son validas");
                                    continue;
                                } else{
                                    //construcción
                                    comision = (v1 + v2 +v3) * PORCENTAJE;
                                    total = sueldoB + comision;
                                    salida += "\nVendedor " + i +
                                            "\nSueldo Base: $" + sueldoB +
                                            "\nComisión: $" + comision +
                                             "\n Total: $" + total;
                                    totalS += total;
                                }
                                i++;
                                // Cierra el While
                            }
                            salida +="\nTotal de Deducciones: $" + totalS;
                            JOptionPane.showMessageDialog(null, salida);

                        } else{
                            JOptionPane.showMessageDialog(null, "El sueldo Base No es válido");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "El número de trabajadores debe de ser mayor a 0");
                    }

                    break;
                case "2":
                case "B":
                    JOptionPane.showMessageDialog(null, "Opción 2");
                    break;
                case "3":
                case "C":
                    JOptionPane.showMessageDialog(null, "Opcion 3");
                    break;
                case "4":
                case "S":
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida");
            } //cierra el switch

        } while (sentinel);

    }
}

/