public class LivroInfantil extends Livro {
    private int idadeMaxima;
    private int idadeMinima;

    public LivroInfantil() {
        super();
        idadeMaxima = INT_OMISSO;
        idadeMinima = INT_OMISSO;
    }

    public LivroInfantil(String titulo, String autor, int anoPublicacao, float preco, int quantidadeStock, int idadeMaxima, int idadeMinima) {
        super(titulo, autor, anoPublicacao, preco, quantidadeStock);
        this.idadeMaxima = idadeMaxima;
        this.idadeMinima = idadeMinima;
    }

    public String toString() {
        return super.toString(String.format("Idade mínima: %s\nIdade máxima: %s", idadeMinima, idadeMaxima));
    }

    public int getIdadeMaxima() {
        return idadeMaxima;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMaxima(int idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }
}
