import javax.swing.JOptionPane;

//  1. Calcular el promedio de un alumno que tiene
//  n calificaciones en la materia de programción.

import javax.swing.*;

public class ProgramasConFor {
    public static void main (String[] args){

        String menu = "", opcion = "";
        boolean sentinel = true;
        int n = 0;
        double promedio = 0.0, calif = 0.0;


        //Se crea la cadena del texto para las opciones del menu
        menu ="========== MENU PROGRAMAS CON FOR ==========\n" +
                "1)Calcular promedio\n" +
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
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de Calificaciones: "));

                    if (n>0){
                        promedio = 0.0;
                        for (int i = 1; i <=n; i++) {
                            calif = Double.parseDouble
                                    (JOptionPane.showInputDialog(null, "Introduce la calificación:" + i ));
                            if (calif >= 0.0 && calif<=10.0){
                                promedio += calif;

                            } else {
                                JOptionPane.showMessageDialog(null, "La calificación no es válida");
                                i--;
                                continue;
                            }
                            //promedio = promedio + calif, acumulandor
                        }
                        promedio/=n; //promedio = promedio / n
                        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
                    } else {
                        JOptionPane.showMessageDialog
                                (null, "El número de Calificaciones no deben ser 0");
                    }
                    break;



                case "2":  //caso 1
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
