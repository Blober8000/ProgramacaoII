public class Circulo extends Forma {
    private float raio;
    private float area;

    protected final float RAIO_OMISSO = 1f;

    public Circulo(float raio, String cor) {
        super(cor);
        this.raio = raio;
        this.area = (float) (Math.PI * Math.pow(raio, 2));
    }

    public Circulo() {
        super();
        raio = RAIO_OMISSO;
        area = (float) (Math.PI * Math.pow(RAIO_OMISSO, 2));
    }

    public Circulo(float raio) {
        super();
        this.raio = raio;
        this.area = (float) (Math.PI * Math.pow(raio, 2));
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public String toString() {
        return super.toString(String.format("Este Círculo tem %.2f de raio", raio));
    }

    @Override
    public float getArea() {
        return area;
    }
}
