
package tm22012.pkg2023.poo.guia4;

import java.time.LocalDate;

public class ProductosFrescos extends Producto {

    public ProductosFrescos(LocalDate fechaDeCaducidad, int numLote, LocalDate fechaDeEnvasado, String paisDeOrigen) {
        super(fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen);
    }

public void mostrarDatos(){
    System.out.println();
    System.out.println("----------Producto fresco----------");
    System.out.println("Fecha de caducidad: "+getFechaDeCaducidad());
    System.out.println("Numero de lote: "+getNumLote());
    System.out.println("Fecha de envasado: "+getFechaDeEnvasado());
    System.out.println("Pais de origen: "+getPaisDeOrigen());


}
}
