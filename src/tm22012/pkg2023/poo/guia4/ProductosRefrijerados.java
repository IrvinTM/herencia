
package tm22012.pkg2023.poo.guia4;

import java.time.LocalDate;

public class ProductosRefrijerados extends Producto {

    private int codigoOrganismoSupAl;
    private float tempRecomendada;

    public ProductosRefrijerados(LocalDate fechaDeCaducidad, int numLote, LocalDate fechaDeEnvasado, String paisDeOrigen,
            int codigoOrganismoSupAl, float tempRecomendada) {
        super(fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen);
        this.codigoOrganismoSupAl = codigoOrganismoSupAl;
        this.tempRecomendada = tempRecomendada;
    }

    public int getCodigoOrganismoSupAl() {
        return codigoOrganismoSupAl;
    }

    public void setCodigoOrganismoSupAl(int codigoOrganismoSupAl) {
        this.codigoOrganismoSupAl = codigoOrganismoSupAl;
    }

    public float getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(float tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }

    public void mostrarDatos() {
        System.out.println();
    System.out.println("----------Producto Refrijerado----------");
        System.out.println("Fecha de caducidad: " + getFechaDeCaducidad());
        System.out.println("Numero de lote: " + getNumLote());
        System.out.println("Fecha de envasado: " + getFechaDeEnvasado());
        System.out.println("Pais de origen: " + getPaisDeOrigen());
        System.out.println("Codigo de organismo supervisor de alimentos: " + getCodigoOrganismoSupAl());
        System.out.println("Temperatura recomendada: " + getTempRecomendada());

            


    }
}
