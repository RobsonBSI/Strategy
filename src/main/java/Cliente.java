public class Cliente {
    private float valorCompra;


    public float getValorCompra() {
        return valorCompra;
    }

    public void CalcularValorBoleto(float valor, int parcela) {
        MetodoPagamento pagamento = new MetodoPagamento(valor, parcela);
        this.valorCompra = pagamento.calcularPagamento(new PagamentoBoleto());
    }

    public void CalcularValorPix(float valor, int parcela) {
        MetodoPagamento pagamento = new MetodoPagamento(valor, parcela);
        this.valorCompra = pagamento.calcularPagamento(new PagamentoPix());
    }

    public void CalcularValorCartao(float valor, int parcela) {
        MetodoPagamento pagamento = new MetodoPagamento(valor, parcela);
        this.valorCompra = pagamento.calcularPagamento(new PagamentoCartao());
    }

}
