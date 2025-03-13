public class ex_2 {
    public static void main(String[] args) {
        Gestor gestor = new Gestor("Blober", "Bons Dias", "Vmpz23q3tyKsniWZ");
        Administrativo administrativo = new Administrativo("Blobi", "Bom Dia");
        Visitante visitante = new Visitante("batatas@gmail.com");

        visitante.LogIn();
        administrativo.LogIn("Blobi", "Bom Dia");
        gestor.LogIn("Blober", "Bons Dias", "Vmpz23q3tyKsniWZ");
    }
}
