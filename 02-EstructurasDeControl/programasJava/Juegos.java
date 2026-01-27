import javax.swing.JOptionPane;

public class Juegos {
    public static void main(String[] args) {

        //en un juego de preguntas donde se responde si o
        // no gana quien responda las 3 preguntas. Si de responde mal a cuelquierra de
        // ellas ya no se pregunta la siguiente y termina el juego"
        // colon descubrio america, la independencia de mexico fue en el año de1810,
        // the doors fue un grupo de rock amerciano

        String r1 = "", r2 = "", r3 = "";

        JOptionPane.showMessageDialog(null, "Bienvenido al juego!!");

        //Pregunta 1

        r1 = JOptionPane.showInputDialog(null, "¿El Agua de Horchata es color blanca?");
        if (r1.equalsIgnoreCase("Si")) {
        } else {
            r1.equalsIgnoreCase("no");
            JOptionPane.showMessageDialog(null, "Game Over!!");
            return;
        }

        //Pregunta 2
        r2= JOptionPane.showInputDialog(null, "¿El planeta es redondo?");
         if (r2.equalsIgnoreCase("Si")) {
         } else {
             r2.equalsIgnoreCase("no");
             JOptionPane.showMessageDialog(null, "Game Over!!");
             return;
         }
         //Pregunta 3

        r3= JOptionPane.showInputDialog(null, "¿La canción de (I Just) Died In Your " +
                "Arms,\n es del grupo Cutting Crew?");
        if (r3.equalsIgnoreCase("Si")) {
        } else {
            r3.equalsIgnoreCase("no");
            JOptionPane.showMessageDialog(null, "Game Over!!");
            return;
        }
        if (r1.equalsIgnoreCase("Si") && r2.equalsIgnoreCase("Si") && r3.equalsIgnoreCase("Si")){
            JOptionPane.showMessageDialog(null, "Ganaste");
        } else {
            return;
        }
    }
}

