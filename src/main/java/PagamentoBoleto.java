public class PagamentoBoleto implements Pagamento {
    @Override
    public float calcularPagamento(float valor, int parcela) {
        return parcela*(valor * 0.9f);
    }
}
