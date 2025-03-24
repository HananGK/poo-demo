package com.hanan.EjModelizacion;

public class InmuebleTest {
    public static void main(String[] args) {
        CasaUrbanizacion casaUrbanizacion = new CasaUrbanizacion(3, "calle tulipan 15", 120, 4, 2, 3, 60, true, false);
        CasaRural casaRural = new CasaRural(6, "pueblo perdido 8", 120, 3, 2, 1, 40, 30);

        System.out.println(casaUrbanizacion);
        System.out.println(casaUrbanizacion.getValorCompra());
        System.out.println(casaRural);
    }
}
