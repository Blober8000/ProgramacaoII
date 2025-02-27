public abstract class Consulta {
    private int codigo; // gerado automaticamente e sequencial
    private String data; // Data da consulta  aa/mm/dd
    private String hora; // Horário da consulta hh:mm
    private String nomePaciente; // nome do paciente
    private String nomeMedico; // nome do médico
    private String laudo; // relatório médico

    private static double valorBase = 30.0; // euros
    private static int contador = 0;

    protected static final String STRING_POR_OMISSAO ="-----";

    public Consulta() {
        this.codigo = ++contador;
        this.data = STRING_POR_OMISSAO;
        this.hora = STRING_POR_OMISSAO;
        this.nomePaciente = STRING_POR_OMISSAO;
        this.nomeMedico = STRING_POR_OMISSAO;
        this.laudo = STRING_POR_OMISSAO;
    }
    public Consulta(String data, String hora, String nomePaciente, String nomeMedico) {
        this.codigo = ++contador;
        this.data = data;
        this.hora = hora;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.laudo = STRING_POR_OMISSAO;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public String getLaudo() {
        return laudo;
    }

    public static double getValorBase() {
        return valorBase;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public static void setValorBase(double valorBase) {
        Consulta.valorBase = valorBase;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("\nCódigo: "); s.append(codigo);
        s.append("\nData: "); s.append(data);
        s.append("\nHora: "); s.append(hora);
        s.append("\nNome: "); s.append(nomePaciente);
        s.append("\nNomeMedico: "); s.append(nomeMedico);
        s.append("\nLaudo: "); s.append(laudo);
        return s.toString();
    }
    public int obterHora() {
        String h = hora.substring(0, 2);
        int h1 = Integer.parseInt(h);
        return h1;
    }
    public abstract double calcularCustoConsulta();
}
