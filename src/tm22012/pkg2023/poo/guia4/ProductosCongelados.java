
package tm22012.pkg2023.poo.guia4;

import java.time.LocalDate;

public class ProductosCongelados extends Producto {
    
   private float tempRecomendada;

    public ProductosCongelados(LocalDate fechaDeCaducidad, int numLote, LocalDate fechaDeEnvasado, String paisDeOrigen,
            float tempRecomendada) {
        super(fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen);
        this.tempRecomendada = tempRecomendada;
    }

    public float getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(float tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }

    public void ProductosCongeladosPorAire() {
        
    }

    public void mostrarDatos() {
        System.out.println();
    System.out.println("----------Producto congelado----------");
        System.out.println("Fecha de caducidad: " + getFechaDeCaducidad());
        System.out.println("Numero de lote: " + getNumLote());
        System.out.println("Fecha de envasado: " + getFechaDeEnvasado());
        System.out.println("Pais de origen: " + getPaisDeOrigen());
        System.out.println("Temperatura recomendada: " + getTempRecomendada());
    }
    
}
