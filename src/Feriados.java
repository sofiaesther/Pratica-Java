public class Feriados {
    private Feriado[] feriados;

    public Feriados(Feriado... feriados) {
        this.feriados = feriados;
    }

    public void temFeriado(String data) {
        for (Feriado feriado : feriados) {
            if (feriado.getData().equals(data)) {
                System.out.println(feriado.getNome());
                return;
            }
        }
        System.out.println("Não existe feriado nessa data!");
    }

    public void todosOsFeriados() {
        for (Feriado feriado : feriados) {
            System.out.println(feriado.getData() + " - " + feriado.getNome());
        }
    }
}
