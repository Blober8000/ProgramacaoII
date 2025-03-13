import java.time.LocalDateTime;

public abstract class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private float preco;
    private int quantidadeStock;

    protected final String STRING_OMISSA = "_____";
    protected final int INT_OMISSO = 0;

    public Livro() {
        titulo = STRING_OMISSA;
        autor = STRING_OMISSA;
        anoPublicacao = INT_OMISSO;
        preco = (float) INT_OMISSO;
        quantidadeStock = INT_OMISSO;
    }

    public Livro(String titulo, String autor, int anoPublicacao, float preco, int quantidadeStock) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.quantidadeStock = quantidadeStock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidadeStock() {
        return quantidadeStock;
    }

    public void setQuantidadeStock(int quantidadeStock) {
        this.quantidadeStock = quantidadeStock;
    }

    public int calcularIdade(){
        return LocalDateTime.now().getYear()-anoPublicacao;
    }

    public float calcularValorTotalStock(){
        return preco*quantidadeStock;
    }

    public String toString(String string){
        return String.format("Título: %s\nAutor: %s\nAno de Publicação: %d\nPreço: %.2f€\nQuantidade em stock: %d\n%s",titulo,autor,anoPublicacao,preco,quantidadeStock,string);
    }

}

