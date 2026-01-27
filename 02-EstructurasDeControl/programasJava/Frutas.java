import javax.swing.JOptionPane;

public class Fruteria {
    public static void main (String[] args){
        //Declaración de variables
        double numkilos, precio, subtotal,descuento, total;
        String porcentaje, salida;

        //Entrada
        numkilos = Double.parseDouble((JOptionPane.showInputDialog("Introduce el numero de kilos")));
        precio = Double.parseDouble((JOptionPane.showInputDialog("Introduce el precio")));

        //Operación
        if (numkilos >0.0){
           subtotal = numkilos * precio;
           if (numkilos <= 0.0 && numkilos <= 2.0){
               total = subtotal;
               porcentaje = "0%";
               descuento = 0.0;
               JOptionPane.showMessageDialog(null, "Subtotal: " +
                       subtotal + "\nDescuento: "+ descuento + "\nPorcentaje: "+ porcentaje +"\nTotal: " + total);
           } else if (numkilos>=2.01 && numkilos<= 5.0) {
               descuento = subtotal * 0.10;
               total = subtotal - descuento;
               porcentaje = "10%";
               JOptionPane.showMessageDialog(null, "Subtotal: " + subtotal +
                       "\nDescuento: "+ descuento + "\nPorcentaje: "+ porcentaje +"\nTotal: " + total);
           } else if (numkilos>=5.01 && numkilos<=10.0) {
               descuento = subtotal * 0.15;
               total = subtotal - descuento;
               porcentaje = "15%";
               JOptionPane.showMessageDialog(null, "Subtotal: " + subtotal +
                       "\nDescuento: "+ descuento + "\nPorcentaje: "+ porcentaje +"\nTotal: " + total);
           } else {
               descuento = subtotal * 0.20;
               total = subtotal - descuento;
               porcentaje = "20%";
               JOptionPane.showMessageDialog(null, "Subtotal: " + subtotal +
                       "\nDescuento: "+ descuento + "\nPorcentaje: "+ porcentaje +"\nTotal: " + total);
           }
        } else {
            JOptionPane.showMessageDialog(null, "Los kilos"+ "no pueden ser negativos");
        }


    }
}
