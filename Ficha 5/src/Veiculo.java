public class Veiculo implements Cores, Imposto {
    private String matricula;
    private int cilindrada;
    private String cor;

    protected final String STRING_OMISSA = "vazia";
    protected final int INT_OMISSO = 0;

    public Veiculo(String matricula, int cilindrada, String cor) {
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.cor = cor;
    }

    public Veiculo() {
        matricula = STRING_OMISSA;
        cilindrada = INT_OMISSO;
        cor = STRING_OMISSA;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getCor() {
        return cor;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("Veículo com matrícula %s e cilindrada %d tem cor %s",
                matricula, cilindrada, cor);
    }

    public float calculoImposto() {
        final float IMPOSTO_BAIXO = 15f, IMPOSTO_ALTO = 40f;
        final int CILINDRADA_LIMITE = 1500;
        if (this.cilindrada<=CILINDRADA_LIMITE) {
            return IMPOSTO_BAIXO;
        } else {
            return IMPOSTO_ALTO;
        }
    }
}