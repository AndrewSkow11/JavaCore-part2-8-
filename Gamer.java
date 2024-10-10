public class Gamer extends Person03{
    String platform;

    public Gamer(String name, int age, long phoneNumber, String platform) {
        super(name, age, phoneNumber);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "platform='" + platform + '\'' +
                '}';
    }
}
