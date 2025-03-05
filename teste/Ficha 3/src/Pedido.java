public abstract class Pedido {
    private int idPedido;
    private String Data;
    private String Hora;
    private double custoBase;
    protected static final String STRINGOMISSA = "sem valor";
    private static final double NUMEROOMISSO = 0;
    private static int contador = 0;

    public Pedido() {
        this.idPedido = ++contador;
        this.Data = STRINGOMISSA;
        this.Hora = STRINGOMISSA;
        this.custoBase = NUMEROOMISSO;
    }

    public Pedido(String Data, String Hora, double preço) {
        this.idPedido = ++contador;
        this.Data = Data;
        this.Hora = Hora;
        this.custoBase = preço;
    }

    public Pedido(Pedido outroPedido){
        this.idPedido = outroPedido.getIdPedido();
        this.Data = outroPedido.getData();
        this.Hora = outroPedido.getHora();
        this.custoBase = outroPedido.getCustoBase();
    }

    public int getIdPedido() {
        return this.idPedido;
    }

    public String getData() {
        return this.Data;
    }

    public String getHora() {
        return this.Hora;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public void setCustoBase(double preço) {
        this.custoBase = preço;
    }

    public String toString() {
        return String.format("ID: %d \nData: %s \nHora: %s\nCusto base: %.2f", this.idPedido, this.Data, this.Hora, this.custoBase);
    }

    protected double getCustoBase() {
        return this.custoBase;
    }
}
