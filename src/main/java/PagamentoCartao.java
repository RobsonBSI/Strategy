public class PagamentoCartao implements Pagamento{
    @Override
    public float calcularPagamento(float valor, int parcela) {
        if (parcela == 0 ) {
            throw new IllegalArgumentException("Parcela tem que ser superir a zero");
        }
        else {
            if (parcela == 1){
                return (valor)/parcela;
            }else {
            }
            return (valor * 1.02f)/parcela;
        }

    }
}
