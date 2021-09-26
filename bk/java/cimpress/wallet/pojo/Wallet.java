package pojo;

public class Wallet {
    private double balance;
    private String email;

    public Wallet(double balance, String email) {
        this.balance = balance;
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
