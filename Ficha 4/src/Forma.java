public abstract class Forma {
    private final String COR_OMISSA = "cinzento";

    private String cor;

    public Forma() {
        cor = COR_OMISSA;
    }

    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String toString(String start) {
        return String.format("%s e a sua cor interna é %s.", start, cor);
    }

    abstract float getArea();
}
