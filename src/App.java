import java.util.Scanner;

public class App {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // ---------------------Entrada de Dados---------------------------//
        // Dados do Profissional
        Profissional profissional = new Profissional();
        System.out.print("Insira o nome do profissional: ");
        profissional.Nome = sc.next();
        System.out.print("Digite a quantidade de horas disponível durante o dia: ");
        Profissional.FHD = sc.nextInt();
        System.out.print("Informe o salário desejado no mês: ");
        Profissional.SalarioMensalDesejado = sc.nextDouble();
        System.out.println("-------------------------------------------------------------------");

        // Dados do Sistema
        int continua;
        ItemSistema itemSistema = new ItemSistema();
        do {
            System.out.println("Digite a opção do trabalho a ser realizado:");
            System.out.println("Opção [1] - Tela com entradas e saídas de dados.");
            System.out.println("Opção [2] - Tela de consultas com informações de dados.");
            System.out.println("Opção [3] - Gravação de dados.");
            System.out.println("Opção [4] - Algoritmo com processamento.");
            int item = sc.nextInt();

            System.out.println("Digite a complexidade de [1 a 3].");
            int complexidade = sc.nextInt();

            itemSistema.NomeDoServico(item, complexidade);
            System.out.println("Deseja adcionar mais serviços? ");
            System.out.println("Se sim, digite [1]. ");
            System.out.println("Se não, digite [2]. ");
            continua = sc.nextInt();
        } while (continua == 1);
        sc.close();

        // --------------------------Saída de Dados-----------------------------------//
        System.out.println("<<--------------------INFORMAÇÕES-------------------->> ");
        System.out.println("");
        System.out.println("Nome do Profissional: " + profissional.Nome);
        System.out.printf("Salário Desejado: R$ %.2f", Profissional.SalarioMensalDesejado);
        System.out.println("");
        System.out.println("Quantidade de Horas Mês: " + Profissional.CalcalaHorasMensais() + "h");
        System.out.printf("Valor Hora: R$ %.2f", Profissional.CalculaValorHora());
        System.out.println("");
        System.out.println("");
        int index = 1;

        for (String arraySaida : itemSistema.SaidaDados) {
            System.out.println("----------" + " Item " + index + " ----------");
            System.out.println(arraySaida);
            System.out.println("");
            index++;
        }

        System.out.println("Total de horas para o desenvolvimento do sistema: " + Orcamento.RetornoHoras() + "h");
        System.out.printf("Valor do desenvolvimento do sistema: R$ %.2f", Orcamento.ValorFinalDoSistema());
        System.out.println(" ");
        System.out.println(" ");

        // Insert no banco de dados
        ConexaoMySql db1 = new ConexaoMySql();

        // Query para criar DataTable
        /*String sqlCreate = " create table Orcamento "
                + " (cd_Orcamento int primary key auto_increment,"
                + " NomeProfissional varchar(200),"
                + " ValorOrcamento decimal(18,5))";
        db1.OpenDataBase();
        db1.ExecutaQuery(sqlCreate);*/
        
        db1.OpenDataBase();
        String sql = " insert into orcamento " +
                " ( NomeProfissional, ValorOrcamento) values ('" + profissional.Nome + "', '" + Orcamento.ValorFinalDoSistema() + "')";
        db1.ExecutaQuery(sql);
        db1.CloseDataBase();
    }
}