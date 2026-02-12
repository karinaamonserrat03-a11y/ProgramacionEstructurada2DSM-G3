import javax.swing.JOptionPane;

// Solicita el número de alumnos de un grupo y registra si cada uno está Presente (P) o
// Ausente (A). Muestra el porcentaje de asistencia.

public class Ejercicio4 {
    public static void main (String[] args){

        //Definir variables
        int alumnos = 0, totalalum = 0;
        double porcentaje = 0.0;
        boolean sentinel = true;

        //valor de alumnos solicitados
        do {
            //Cuenta las asistencias y se reinicia
            int cont = 0;

            //El usuario ingresa el valor
            alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de alumnos"));

            //Si el usuario ingresa un valor mayor a 0 inicia el proceso
            if (alumnos > 0) {

                //ciclo para cada alumno
                for (int i = 0; i < alumnos; i++) {

                    if (alumnos > 1) {

                        //Varible se guarda la respuestas
                        String asistencia = "";

                        //Muestra el numero actual del alumno
                        totalalum = i + 1;

                        /** Validación dentro del pase de lista: Si el usuario no ingrese "A" ni "P", el
                        programa repite  la pregunta hasta que ingresen los datos correctos */

                        while (!asistencia.equalsIgnoreCase("P") && !asistencia.equalsIgnoreCase("A")) {
                            asistencia = JOptionPane.showInputDialog("Alumno " + totalalum +
                                    "\n¿El alumno está Presente (P) o Ausente (A)?");
                            if (!asistencia.equalsIgnoreCase("P") && !asistencia.equalsIgnoreCase("A")) {
                                JOptionPane.showMessageDialog(null, "Escribe solo P o A.");
                            }
                        }

                        //Si los datos son correctos continua con el proceso y aumenta el contador
                        if (asistencia.equalsIgnoreCase("P")) {
                            cont++;
                        }
                    }
                }
                //Realiza operación para sacar el porcentaje
                porcentaje = (cont * 100.0) / alumnos;
                JOptionPane.showMessageDialog(null, "Num. Alumnos: " + alumnos +
                        "\nPorcentaje de asistencia: " + porcentaje + "%");
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa valores correctos");

            }
        } while (sentinel);
    }
}

