
package tm22012.pkg2023.poo.guia4;

import java.time.LocalDate;

public class Tm220122023POOGuia4 {

  
    public static void main(String[] args) {


        LocalDate fechaExpiracion = LocalDate.of(2021, 12, 12);
        LocalDate EjemploFecha = LocalDate.of(2021, 12, 12);

        ProductosFrescos tomate = new ProductosFrescos(fechaExpiracion, 123,
         fechaExpiracion, "Costa Rica");
        tomate.mostrarDatos();

        ProductosFrescos lechuga = new ProductosFrescos(fechaExpiracion, 123,
         fechaExpiracion, "Costa Rica");
        lechuga.mostrarDatos();

        ProductosRefrijerados carne = new ProductosRefrijerados(fechaExpiracion, 123,
         fechaExpiracion, "Costa Rica", 123, 0);
        carne.mostrarDatos();

        ProductosRefrijerados pollo = new ProductosRefrijerados(fechaExpiracion, 123,
         fechaExpiracion, "Costa Rica", 123, 0);
        pollo.mostrarDatos();

        ProductosRefrijerados pescado = new ProductosRefrijerados(fechaExpiracion, 123,
         fechaExpiracion, "Costa Rica", 123, 0);
        pescado.mostrarDatos();

         ProductosCongeladosPorAgua jamon = new ProductosCongeladosPorAgua(fechaExpiracion,
         0, EjemploFecha, "El Salvador",200,"Alta");
        jamon.mostrarDatos();

        ProductosCongeladosPorAgua salami = new ProductosCongeladosPorAgua(fechaExpiracion,
         0, EjemploFecha, "El Salvador",200,"Alta");
        salami.mostrarDatos();

        ProductosCongeladosPorAire papasFritas = new ProductosCongeladosPorAire(fechaExpiracion,
         0, EjemploFecha, "El Salvador",-30,
          5, 85, 5, 5);
        papasFritas.mostrarDatos();

        ProductosCongeladosPorAire frutaPicada = new ProductosCongeladosPorAire(fechaExpiracion,
         0, EjemploFecha, "El Salvador",-40,
          5, 85, 5, 5);
        frutaPicada.mostrarDatos();

        ProductosCongeladosPorNitro helado = new ProductosCongeladosPorNitro(fechaExpiracion,
         0, EjemploFecha, "El Salvador", 5,
          "Al vacio", 0);
        helado.mostrarDatos();

        

        

    }
    
}
