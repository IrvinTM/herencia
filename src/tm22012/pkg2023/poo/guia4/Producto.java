
package tm22012.pkg2023.poo.guia4;

import java.time.LocalDate;

public class Producto {
    private LocalDate fechaDeCaducidad;
    private int numLote;
    private LocalDate fechaDeEnvasado;
    private String paisDeOrigen;

    public Producto(LocalDate fechaDeCaducidad, int numLote, LocalDate fechaDeEnvasado, String paisDeOrigen) {
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.numLote = numLote;
        this.fechaDeEnvasado = fechaDeEnvasado;
        this.paisDeOrigen = paisDeOrigen;
    }

    public LocalDate getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(LocalDate fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public LocalDate getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }

    public void setFechaDeEnvasado(LocalDate fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    

    
}