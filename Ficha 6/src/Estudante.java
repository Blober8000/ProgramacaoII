public class Estudante {
    private int codigo;
    private String nome;
    private Data dataNascimento;
    private CartaoEstudante cartao;

    public Estudante(int codigo, String nome, Data dataNascimento, CartaoEstudante cartao) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cartao = cartao;
    }

    public Estudante(Estudante outroEstudante) {
        codigo = outroEstudante.getCodigo();
        nome = outroEstudante.getNome();
        dataNascimento = outroEstudante.getDataNascimento();
        cartao = outroEstudante.getCartao();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public CartaoEstudante getCartao() {
        return cartao;
    }

    public void setCartao(CartaoEstudante cartao) {
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        return String.format("\n### Dados do Estudante ###\nCódigo: %d\nNome: %s\nData de Nascimento: %s%s", codigo, nome, dataNascimento.toString(), cartao.toString());
    }

    public boolean equals(Estudante outroEstudante) {
        boolean one, two, three, four;
        one = this.codigo == outroEstudante.getCodigo();
        two = this.nome.equals(outroEstudante.getNome());
        three = this.dataNascimento.equals(outroEstudante.getDataNascimento());
        four = this.cartao.equals(outroEstudante.getCartao());
        return one && two && three && four;
    }

    public int validadeDias(){
        return cartao.validadeDias();
    }

    public Estudante maisNovo(Estudante outroEstudante){
        if(dataNascimento.contarDias()>outroEstudante.getDataNascimento().contarDias()){
            return this;
        } else if(dataNascimento.contarDias()<outroEstudante.getDataNascimento().contarDias()){
            return outroEstudante;
        } else {
            return null;
        }
    }
}
