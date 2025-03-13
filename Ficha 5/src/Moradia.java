public class Moradia implements Cores, Imposto{
    private String morada;
    private float area;
    private String cor;

    protected final String STRING_OMISSA = "vazia";
    protected final float FLOAT_OMISSO = 0f;

    public Moradia(String morada, float area, String cor) {
        this.morada = morada;
        this.area = area;
        this.cor = cor;
    }

    public Moradia(){
        morada = STRING_OMISSA;
        area = FLOAT_OMISSO;
        cor = STRING_OMISSA;
    }

    public String getMorada() {
        return morada;
    }

    public float getArea() {
        return area;
    }

    public String getCor() {
        return cor;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("Moradia situada na %s com área de %.1f tem cor %s",
                morada, area, cor);
    }

    public float  calculoImposto(){
        final int TAXA_IMPOSTO = 2;
        return this.area*TAXA_IMPOSTO;
    }

}