public class Orcamento {

    public static int RetornoHoras() {

        int totalHoras = 0;
        for (int i = 0; i < ItemSistema.TotalHoras.size(); i++) {
            int info = (int) ItemSistema.TotalHoras.get(i);
            totalHoras += info;
        }
        return totalHoras;
    }

    /**
     * @return
     */
    public static double ValorFinalDoSistema() {
        final double soma = RetornoHoras() * Profissional.CalculaValorHora();
        double orcamentoFinal = soma * 0.3;
    return  soma + orcamentoFinal;
    }

}
