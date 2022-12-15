public class Profissional {
    public String Nome;
    public static double SalarioMensalDesejado;
    public static int FHD;
    public static int diasUteisMensaisPadrao = 20;

    /**
     * @return
     */
    public static int CalcalaHorasMensais() {
        return FHD * diasUteisMensaisPadrao;
    }

    public static double CalculaValorHora() {
        return SalarioMensalDesejado / CalcalaHorasMensais();
    }
}