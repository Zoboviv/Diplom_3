package client;

public class Credentials {
    private final String email;
    private final String password;

    public static Credentials authorization (String email, String password){
        return new Credentials(email, password);
    }

    public Credentials(String email, String password) {
        this.email=email;
        this.password=password;
    }

}