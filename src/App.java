public class App {
    public static void main(String[] args) throws Exception {
        Feriado feriado = new Feriado();
        feriado.setData("01/01/2023"); 
        feriado.setNome("Confraternização mundial");
        Feriado feriado2 = new Feriado();
        feriado2.setData("21/02/2023"); 
        feriado2.setNome("Carnaval");
        Feriado feriado3 = new Feriado();
        feriado3.setData("17/04/2023"); 
        feriado3.setNome("Páscoa");
        Feriado feriado4 = new Feriado();
        feriado4.setData("21/04/2023"); 
        feriado4.setNome("Tiradentes");
        Feriado feriado5 = new Feriado();
        feriado5.setData("01/05/2023"); 
        feriado5.setNome("Dia do trabalho");
        Feriado feriado6 = new Feriado();
        feriado6.setData("08/06/2023"); 
        feriado6.setNome("Corpus Christi");
        Feriado feriado7 = new Feriado();
        feriado7.setData("07/09/2023"); 
        feriado7.setNome("Independência do Brasil");
        Feriado feriado8 = new Feriado();
        feriado8.setData("12/10/2023"); 
        feriado8.setNome("Nossa Senhora Aparecida");
        Feriado feriado9 = new Feriado();
        feriado9.setData("02/11/2023"); 
        feriado9.setNome("Finados");
        Feriado feriado10 = new Feriado();
        feriado10.setData("15/11/2023"); 
        feriado10.setNome("Proclamação da República");
        Feriado feriado11 = new Feriado();
        feriado11.setData("25/12/2023"); 
        feriado11.setNome("Natal");

        Feriados feriados = new Feriados(feriado,feriado2,feriado3,feriado4,feriado5,feriado6,feriado7,feriado8,feriado9,feriado10,feriado11);

        feriados.temFeriado("20/10/2023");
        feriados.temFeriado("25/12/2023");
        feriados.todosOsFeriados();
    }
}
