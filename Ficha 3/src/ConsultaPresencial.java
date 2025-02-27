public class ConsultaPresencial extends Consulta{
    private int gabinete;
    private String endereco;

    private static double taxaAdicional = 0.15; // 15% de

    public ConsultaPresencial() {
        this.endereco = STRING_POR_OMISSAO;
    }
    public ConsultaPresencial(String data, String hora, String nomePaciente, String nomeMedico, int gabinete, String endereco) {
        super(data, hora, nomePaciente, nomeMedico);
        this.gabinete = gabinete;
        this.endereco = endereco;
    }

    public int getGabinete() {
        return gabinete;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setGabinete(int gabinete) {
        this.gabinete = gabinete;
    }

    public void setEndereco(String endereco) {
        this.endereco= endereco;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("\n = Dados da Consulta Presencial =\n");
        s.append(super.toString());
        s.append("\nGabinete: "); s.append(gabinete);
        s.append("\nEndereco: "); s.append(endereco);
        return s.toString();
    }
    public double calcularCustoConsulta() {
        return getValorBase() * (1-taxaAdicional);
    }
}
