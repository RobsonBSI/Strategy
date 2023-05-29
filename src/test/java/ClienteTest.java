import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveGeraPagamentoCartao() {
        Cliente usuario = new Cliente();
        usuario.CalcularValorCartao(100.0f,1);
        assertEquals(100.0f, usuario.getValorCompra());
    }

    @Test
    void deveGeraPagamentoCartaoParcelado() {
        Cliente usuario = new Cliente();
        usuario.CalcularValorCartao(100.0f,2);
        assertEquals(51.0f, usuario.getValorCompra());
    }
    @Test
    void deveGeraPagamentoCartaoParceladoIncorreto() {

        try {
            Cliente usuario = new Cliente();
            usuario.CalcularValorCartao(100.0f,0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Parcela tem que ser superir a zero", e.getMessage());
        }

    }
    @Test
    void deveGeraPagamentoBoleto() {
        Cliente usuario = new Cliente();
        usuario.CalcularValorBoleto(100.0f,1);
        assertEquals(90.0f, usuario.getValorCompra());
    }

    @Test
    void deveGeraPagamentoPix() {
        Cliente usuario = new Cliente();
        usuario.CalcularValorPix(100.0f,1);
        assertEquals(88.0f, usuario.getValorCompra());
    }

}