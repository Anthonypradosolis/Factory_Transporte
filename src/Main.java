import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     *
     *   Dos clases, Camion y Bicicleta que implementan una interface
     * @param args
     */
    public static void main(String[] args) {
         IComun salida;
         salida=FactoriaSalidas.getProducto(FactoriaSalidas.CAMION);
        System.out.println("Coste del envio: "+salida.costeTotal(36815)+"€"+ " Tipo de embalaje: "+salida.tipoEmbalaje(3,6,5,200));
        salida=FactoriaSalidas.getProducto(FactoriaSalidas.BICICLETA);
        System.out.println("Coste del envio: "+salida.costeTotal(36815)+"€"+ " Tipo de embalaje: "+salida.tipoEmbalaje(3,6,5,2));

    }
}