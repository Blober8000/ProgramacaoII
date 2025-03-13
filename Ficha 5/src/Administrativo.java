public class Administrativo extends Utilizador implements Password {
    private String User;
    private String Password;

    public Administrativo() {
        User = STRING_OMISSA;
        Password = STRING_OMISSA;
    }

    public Administrativo(String User, String Password) {
        this.User = User;
        this.Password = Password;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean AuthPass(String user, String pass) {
        if (user.equals(User) && Password.equals(pass)) {
            return true;
        } else {
            return false;
        }
    }

    public void LogIn(String User, String Pass) {
        if (AuthPass(User, Pass)) {
            System.out.println("Login Sucessful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
