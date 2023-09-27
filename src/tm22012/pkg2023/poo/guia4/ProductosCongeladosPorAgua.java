
package tm22012.pkg2023.poo.guia4;

import java.time.LocalDate;

/**
 *
 * @author Test
 */
public class ProductosCongeladosPorAgua extends ProductosCongelados {

    private String salinidadAgua;

    public ProductosCongeladosPorAgua(LocalDate fechaDeCaducidad, int numLote, LocalDate fechaDeEnvasado,
            String paisDeOrigen, float tempRecomendada, String salinidadAgua) {
        super(fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen, tempRecomendada);
        this.salinidadAgua = salinidadAgua;
    }

    public String getSalinidadAgua() {
        return salinidadAgua;
    }

    public void setSalinidadAgua(String salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }

    public void mostrarDatos() {
        System.out.println();
    System.out.println("----------Producto congelado por agua----------");
        System.out.println("Fecha de caducidad: " + getFechaDeCaducidad());
        System.out.println("Numero de lote: " + getNumLote());
        System.out.println("Fecha de envasado: " + getFechaDeEnvasado());
        System.out.println("Pais de origen: " + getPaisDeOrigen());
        System.out.println("Temperatura recomendada: " + getTempRecomendada());
        System.out.println("Salinidad del agua: " + getSalinidadAgua());
    }
    
    

    
}
