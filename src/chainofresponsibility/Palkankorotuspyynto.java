package chainofresponsibility;

public class Palkankorotuspyynto {
    private double amount;
    private String purpose;

    public Palkankorotuspyynto(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String reason) {
        this.purpose = reason;
    }
}
