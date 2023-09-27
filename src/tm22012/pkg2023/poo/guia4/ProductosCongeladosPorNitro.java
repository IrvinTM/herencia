
package tm22012.pkg2023.poo.guia4;

import java.time.LocalDate;

public class ProductosCongeladosPorNitro extends ProductosCongelados {

    private String metodoDeCongelacion;
    private int tiempoExpoNitrogeno;
    public ProductosCongeladosPorNitro(LocalDate fechaDeCaducidad, int numLote, LocalDate fechaDeEnvasado,
            String paisDeOrigen, float tempRecomendada, String metodoDeCongelacion, int tiempoExpoNitrogeno) {
        super(fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen, tempRecomendada);
        this.metodoDeCongelacion = metodoDeCongelacion;
        this.tiempoExpoNitrogeno = tiempoExpoNitrogeno;
    }
    public String getMetodoDeCongelacion() {
        return metodoDeCongelacion;
    }
    public void setMetodoDeCongelacion(String metodoDeCongelacion) {
        this.metodoDeCongelacion = metodoDeCongelacion;
    }
    public int getTiempoExpoNitrogeno() {
        return tiempoExpoNitrogeno;
    }
    public void setTiempoExpoNitrogeno(int tiempoExpoNitrogeno) {
        this.tiempoExpoNitrogeno = tiempoExpoNitrogeno;
    }

    public void mostrarDatos(){
        System.out.println();
    System.out.println("----------Producto Congelado por nitrogeno----------");
        System.out.println("Fecha de caducidad: " + getFechaDeCaducidad());
        System.out.println("Numero de lote: " + getNumLote());
        System.out.println("Fecha de envasado: " + getFechaDeEnvasado());
        System.out.println("Pais de origen: " + getPaisDeOrigen());
        System.out.println("Temperatura recomendada: " + getTempRecomendada());
        System.out.println("Metodo de congelacion: " + getMetodoDeCongelacion());
        System.out.println("Tiempo de exposicion al nitrogeno: " + getTiempoExpoNitrogeno());
    }
    
}
