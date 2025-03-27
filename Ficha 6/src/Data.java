public class Data {
    private int dia;
    private int mes;
    private int ano;

    private static String[] nomeDiaDaSemana = {"Domingo", "Segunda-feira",
            "Terça-feira", "Quarta-feira",
            "Quinta-feira", "Sexta-feira",
            "Sábado"};

    private static int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30,
            31, 30, 31};

    private static String[] nomeMes = {"Inválido", "Janeiro", "Fevereiro",
            "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro",
            "Outubro", "Novembro", "Dezembro"};

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(Data outraData) {
        this.dia = outraData.getDia();
        this.mes = outraData.getMes();
        this.ano = outraData.getAno();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setData(Data outraData) {
        this.dia = outraData.getDia();
        this.mes = outraData.getMes();
        this.ano = outraData.getAno();
    }

    public static boolean isAnoBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }

    public int contarDias() {
        int totalDias = 0;

        for (int i = 1; i < ano; i++) {
            totalDias += isAnoBissexto(i) ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            totalDias += diasPorMes[i];
        }
        totalDias += (isAnoBissexto(ano) && mes > 2) ? 1 : 0;
        totalDias += dia;

        return totalDias;
    }

    public String determinarDiaDaSemana() {
        int totalDias = contarDias();
        totalDias = totalDias % 7;

        return nomeDiaDaSemana[totalDias];
    }

    @Override
    public String toString() {
        return String.format("%s, %dº de %s de %d", this.determinarDiaDaSemana(), dia, nomeMes[mes], ano);
    }

    public boolean equals(Data outraData) {
        boolean one, two, three;
        one = dia == outraData.getDia();
        two = mes == outraData.getMes();
        three = ano == outraData.getAno();
        return one && two && three;
    }
}
