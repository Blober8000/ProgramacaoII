public class LivroRomance extends Livro {
    private String editora;

    public LivroRomance() {
        super();
        editora = STRING_OMISSA;
    }

    public LivroRomance(String titulo, String autor, int anoPublicacao, float preco, int quantidadeStock, String editora) {
        super(titulo, autor, anoPublicacao, preco, quantidadeStock);
        this.editora = editora;
    }

    public String toString() {
        return super.toString(String.format("Editora: %s", editora));
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
