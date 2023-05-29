public class PagamentoPix implements Pagamento{
    @Override
    public float calcularPagamento(float valor, int parcela) {
        return parcela*(valor * 0.88f);
    }
}
