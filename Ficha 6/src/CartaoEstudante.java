public class CartaoEstudante {
    private int codigo;
    private Data dataCartao;
    private Data dataValidade;

    public CartaoEstudante(int codigo, Data dataCartao, Data dataValidade) {
        this.codigo = codigo;
        this.dataCartao = dataCartao;
        this.dataValidade = dataValidade;
    }

    public CartaoEstudante(CartaoEstudante outroCartaoEstudante) {
        this.codigo = outroCartaoEstudante.getCodigo();
        this.dataCartao = outroCartaoEstudante.getDataCartao();
        this.dataValidade = outroCartaoEstudante.getDataValidade();
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Data getDataCartao() {
        return dataCartao;
    }
    public void setDataCartao(Data dataCartao) {
        this.dataCartao = dataCartao;
    }
    public Data getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return String.format("\n### Dados do Cartão de Estudante ###\nCódigo do cartão: %d\nData do cartão: %s\nData de Validade: %s", codigo, dataCartao.toString(), dataValidade.toString());
    }

    public boolean equals(CartaoEstudante outroCartaoEstudante) {
        boolean one, two, three;
        one = this.codigo == outroCartaoEstudante.getCodigo();
        two = this.dataCartao.equals(outroCartaoEstudante.getDataCartao());
        three = this.dataValidade.equals(outroCartaoEstudante.getDataValidade());
        return one && two && three;
    }

    public int validadeDias(){
        return dataValidade.contarDias() - dataCartao.contarDias();
    }
}
