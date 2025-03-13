public class Retangulo extends Forma {
    private float largura;
    private float comprimento;
    private float area;

    private final float LARGURA_OMISSA = 1F, COMPRIMENTO_OMISSO = 2f;

    public Retangulo(float largura, float comprimento, String cor) {
        super(cor);
        this.largura = largura;
        this.comprimento = comprimento;
        this.area = this.largura * this.comprimento;
    }

    public Retangulo() {
        super();
        largura = LARGURA_OMISSA;
        comprimento =COMPRIMENTO_OMISSO;
        area = LARGURA_OMISSA * COMPRIMENTO_OMISSO;
    }

    public Retangulo(float largura, float comprimento) {
        super();
        this.largura = largura;
        this.comprimento = comprimento;
        this.area = this.largura * this.comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public String toString() {
        return super.toString(String.format("Este Retângulo tem %.2f de comprimento, %.2f de largura", comprimento, largura));
    }

    @Override
    public float getArea() {
        return area;
    }
}
