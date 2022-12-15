import java.util.ArrayList;

public class ItemSistema {
    public int horasDesenvolvimento;
    public static ArrayList<Integer> TotalHoras = new ArrayList<>();
    public ArrayList<String> SaidaDados = new ArrayList<>();
    
    /**
     * @param item
     * @param complexidade
     */
    public void NomeDoServico(int item, int complexidade) {

        // Tela com entradas e saídas de dados
        if (item == 1 && complexidade == 1) {
            horasDesenvolvimento = 8;
            TotalHoras.add(horasDesenvolvimento);
            SaidaDados.add("Tela com entradas e saídas de dados. \nTempo do Desenvolvimento: " +horasDesenvolvimento + "h");
        }
        if (item == 1 && complexidade == 2) {
            horasDesenvolvimento = 12;
            TotalHoras.add(horasDesenvolvimento);
            SaidaDados.add("Tela com entradas e saídas de dados. \nTempo do Desenvolvimento: " +horasDesenvolvimento + "h");

        }
        if (item == 1 && complexidade == 3) {
            horasDesenvolvimento = 16;
            TotalHoras.add(horasDesenvolvimento);
            SaidaDados.add("Tela com entradas e saídas de dados. \nTempo do Desenvolvimento: " +horasDesenvolvimento + "h");
        }
        // Tela de consulta com informação de dados
        if (item == 2 && complexidade == 1) {
            horasDesenvolvimento = 4;
            TotalHoras.add(horasDesenvolvimento);
            SaidaDados.add("Tela de consulta com informação de dados. \nTempo do Desenvolvimento: " + horasDesenvolvimento + "h");
        }
        if (item == 2 && complexidade == 2) {
            horasDesenvolvimento = 6;
            TotalHoras.add(horasDesenvolvimento);
            SaidaDados.add("Tela de consulta com informação de dados. \nTempo do Desenvolvimento: " + horasDesenvolvimento + "h");

        }
        if (item == 2 && complexidade == 3) {
            horasDesenvolvimento = 8;
            TotalHoras.add(horasDesenvolvimento);
            SaidaDados.add("Tela de consulta com informação de dados. \nTempo do Desenvolvimento: " + horasDesenvolvimento + "h");
        }
        // Gravação de dados
        if (item == 3 && complexidade == 1) {
            horasDesenvolvimento = 16;
            TotalHoras.add(horasDesenvolvimento);
            SaidaDados.add("Gravação de dados. \nTempo do Desenvolvimento: " + horasDesenvolvimento + "h");
        }
        if (item == 3 && complexidade == 2) {
            horasDesenvolvimento = 24;
            TotalHoras.add(horasDesenvolvimento);
            SaidaDados.add("Gravação de dados. \nTempo do Desenvolvimento: " + horasDesenvolvimento + "h");

        }
        if (item == 3 && complexidade == 3) {
            horasDesenvolvimento = 26;
            TotalHoras.add(horasDesenvolvimento);
            SaidaDados.add("Gravação de dados. \nTempo do Desenvolvimento: " + horasDesenvolvimento + "h");
        }
         // Algoritmo com processamento
         if (item == 4 && complexidade == 1) {
            horasDesenvolvimento = 16;
            TotalHoras.add(horasDesenvolvimento);
            SaidaDados.add("Algoritmo com processamento. \nTempo do Desenvolvimento: " + horasDesenvolvimento + "h");
        }
        if (item == 4 && complexidade == 2) {
            horasDesenvolvimento = 24;
            TotalHoras.add(horasDesenvolvimento);
            SaidaDados.add("Algoritmo com processamento. \nTempo do Desenvolvimento: " + horasDesenvolvimento + "h");
        }
        if (item == 4 && complexidade == 3) {
            horasDesenvolvimento = 26;
            TotalHoras.add(horasDesenvolvimento);
            SaidaDados.add("Algoritmo com processamento. \nTempo do Desenvolvimento: " + horasDesenvolvimento + "h");
        }
    }
}
