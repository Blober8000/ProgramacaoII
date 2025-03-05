public class ex_2 {
    public static void main(String[] args) {
        Takeaway p1 = new Takeaway();
        Delivery p2 = new Delivery();

        System.out.println(p1);
        System.out.println(p2);

        p2.setCustoBase(20);

        System.out.println(p2);

        Delivery p3 = new Delivery(p2);
        System.out.println(p2);
        System.out.println(p3);

        p2.setEndereço("Øster Uttrup Vej 5, 9000 Aalborg, Dinamarca");
        System.out.println(p2);
        System.out.println(p3);
    }
}
