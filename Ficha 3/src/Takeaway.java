public class Takeaway extends Pedido {
    private String horaPrevista;

    private static double descontoLevantamento = -0.05;

    public Takeaway() {
        this.horaPrevista = STRINGOMISSA;
    }

    public Takeaway(String Data, String Hora, String horaPrevista, double preço) {
        super(Data, Hora, preço);
        this.horaPrevista = horaPrevista;
    }

    public Takeaway(Takeaway outroPedido) {
        super(outroPedido);
        this.horaPrevista = outroPedido.getHoraPrevista();
    }

    public String getHoraPrevista() {
        return this.horaPrevista;
    }

    public void setHoraPrevista(String horaPrevista) {
        this.horaPrevista = horaPrevista;
    }

    public String toString() {
        return String.format("%s\nHora prevista para entrega: %s", super.toString(), this.horaPrevista);
    }

    public double calcularCustoPedido(){
        return super.getCustoBase() * (1-this.descontoLevantamento);
    }
}
