package com.ejemplo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class PedidoServiceMockTest {

    @Mock
    IDescuentoRepository repository;

    @InjectMocks
    PedidoService service;

    @Test
    void testConMockDeDescuento() {
        when(repository.obtenerPorcentaje("PROMO10")).thenReturn(0.10);

        double total = service.calcularTotal(100, "PROMO10", true);

        assertEquals(110.0, total); // 100 - 10% + 20
    }
}
