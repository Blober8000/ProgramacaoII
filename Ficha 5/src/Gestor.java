public class Gestor extends Utilizador implements Password, Biometricos {
    private String User;
    private String Password;
    private String BiometricCode;

    public Gestor() {
        User = STRING_OMISSA;
        Password = STRING_OMISSA;
        BiometricCode = STRING_OMISSA;
    }

    public Gestor(String User, String Password, String BiometricCode) {
        this.User = User;
        this.Password = Password;
        this.BiometricCode = BiometricCode;
    }

    public void setUser(String user) {
        User = user;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setBiometricCode(String biometricCode) {
        BiometricCode = biometricCode;
    }

    public boolean AuthPass(String user, String pass) {
        if (user.equals(User) && Password.equals(pass)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean AuthBio(String User, String BiometricCode) {
        if (User.equals(User) && this.BiometricCode.equals(BiometricCode)) {
            return true;
        } else {
            return false;
        }
    }

    public void LogIn(String User, String Pass, String BioCode) {
        if (AuthPass(User, Pass) & AuthBio(User, BioCode)) {
            System.out.println("Login Sucessful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
