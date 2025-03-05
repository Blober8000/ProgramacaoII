public class ConsultaOnline extends Consulta{
    private String nomePlataforma;
    private String linkAcesso;

    private static double penalizacao = 0.2; // 20% de penalização depois das 20H00
    private static int hora = 20;

    public ConsultaOnline() {
        this.nomePlataforma = STRING_POR_OMISSAO;
        this.linkAcesso = STRING_POR_OMISSAO;
    }

    public ConsultaOnline(String data, String hora, String nomePaciente, String nomeMedico, String nomePlataforma, String linkAcesso) {
        super(data, hora, nomePaciente, nomeMedico);
        this.nomePlataforma = nomePlataforma;
        this.linkAcesso = linkAcesso;
    }

    public String getNomePlataforma() {
        return nomePlataforma;
    }

    public String getLinkAcesso() {
        return linkAcesso;
    }

    public void setNomePlataforma(String nomePlataforma) {
        this.nomePlataforma = nomePlataforma;
    }

    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }
    public double calcularCustoConsulta() {
        int h = obterHora();
        if (h >= hora)
            return getValorBase() * (1-penalizacao);
        else
            return getValorBase();
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("\n = Dados da Consulta Online =\n");
        s.append(super.toString());
        s.append("\nPlataforma: "); s.append(nomePlataforma);
        s.append("\nLink: "); s.append(linkAcesso);
        return s.toString();
    }
}