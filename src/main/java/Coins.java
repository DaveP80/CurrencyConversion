import java.io.Serializable;

public class Coins implements Serializable {

    private int amount;

    public Coins(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
