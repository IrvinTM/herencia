
package tm22012.pkg2023.poo.guia4;

import java.time.LocalDate;

/**
 *
 * @author Test
 */
public class ProductosCongeladosPorAire extends ProductosCongelados {

    private int porcentajeNitrogeno;
    private int porcentajeOxigeno;
    private int porcentajeDioxidoCarbono;
    private int porcentajeVaporAgua;

    public ProductosCongeladosPorAire(LocalDate fechaDeCaducidad, int numLote, LocalDate fechaDeEnvasado,
            String paisDeOrigen, float tempRecomendada, int porcentajeNitrogeno, int porcentajeOxigeno,
            int porcentajeDioxidoCarbono, int porcentajeVaporAgua) {
        super(fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen, tempRecomendada);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }
    
    public int getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }
    public void setPorcentajeNitrogeno(int porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }
    public int getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }
    public void setPorcentajeOxigeno(int porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }
    public int getPorcentajeDioxidoCarbono() {
        return porcentajeDioxidoCarbono;
    }
    public void setPorcentajeDioxidoCarbono(int porcentajeDioxidoCarbono) {
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
    }
    public int getPorcentajeVaporAgua() {
        return porcentajeVaporAgua;
    }
    public void setPorcentajeVaporAgua(int porcentajeVaporAgua) {
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public void mostrarDatos() {
        System.out.println();
    System.out.println("----------Producto Congelado por aire----------");
        System.out.println("Fecha de caducidad: " + getFechaDeCaducidad());
        System.out.println("Numero de lote: " + getNumLote());
        System.out.println("Fecha de envasado: " + getFechaDeEnvasado());
        System.out.println("Pais de origen: " + getPaisDeOrigen());
        System.out.println("Temperatura recomendada: " + getTempRecomendada());
        System.out.println("Porcentaje de nitrogeno: " + getPorcentajeNitrogeno());
        System.out.println("Porcentaje de oxigeno: " + getPorcentajeOxigeno());
        System.out.println("Porcentaje de dioxido de carbono: " + getPorcentajeDioxidoCarbono());
        System.out.println("Porcentaje de vapor de agua: " + getPorcentajeVaporAgua());
    }
    
}
