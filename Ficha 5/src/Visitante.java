public class Visitante extends Utilizador implements CodigoTemporario {
    private String email;

    public Visitante() {
        email = STRING_OMISSA;
    }

    public Visitante(String email) {
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void AuthTemp() {
        System.out.println("Foi enviado um código com a validade de 24h para o email: " + this.email);
    }

    public void LogIn(){
        AuthTemp();
    }
}
