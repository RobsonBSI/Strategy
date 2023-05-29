public class MetodoPagamento {
    private float valorcompra;
    private int numeroParcelas;

    public MetodoPagamento(float valorcompra, int numeroParcelas) {
        this.valorcompra = valorcompra;
        this.numeroParcelas = numeroParcelas;
    }
    public float calcularPagamento(Pagamento pagamento) {

        return pagamento.calcularPagamento(valorcompra,numeroParcelas);
    }
}
