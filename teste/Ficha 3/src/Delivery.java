public class Delivery extends Pedido {
    private String endereço;

    private static double taxaEntrega = 0.05;

    public Delivery() {
        this.endereço = STRINGOMISSA;
    }

    public Delivery(String Data, String Hora, String endereço, double preço){
        super(Data, Hora, preço);
        this.endereço= endereço;
    }

    public Delivery(Delivery outroPedido) {
        super(outroPedido);
        this.endereço = outroPedido.getEndereço();
    }

    public String getEndereço(){
        return this.endereço;
    }

    public void setEndereço(String endereço){
        this.endereço = endereço;
    }

    public String toString() {
        return String.format("%s\nEndereço para entrega: %s",super.toString(), this.endereço);
    }

    public double calcularCustoPedido(){
        return super.getCustoBase() * (1-this.taxaEntrega);
    }
}
