public class LivroFiccaoCientifica extends Livro {
    private String tema;

    public LivroFiccaoCientifica() {
        super();
        tema = STRING_OMISSA;
    }

    public LivroFiccaoCientifica(String titulo, String autor, int anoPublicacao, float preco, int quantidadeStock, String tema) {
        super(titulo, autor, anoPublicacao, preco, quantidadeStock);
        this.tema = tema;
    }

    public String toString() {
        return super.toString(String.format("Tema: %s", tema));
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
