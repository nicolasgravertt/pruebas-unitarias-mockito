package com.ejemplo;

public class DescuentoRepository implements IDescuentoRepository {
    public double obtenerPorcentaje(String codigo) {
        if (codigo.equals("PROMO10")) return 0.10;
        return 0.0;
    }
}
