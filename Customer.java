public class Customer extends Person03{
    private int cardNumber;

    public Customer(String name, int age, long phoneNumber, int cardNumber) {
        super(name, age, phoneNumber);
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
