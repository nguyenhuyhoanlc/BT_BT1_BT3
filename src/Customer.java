public class Customer {
    private String name;
    private int numberId;
    private int numberIndex;

    public Customer(String name, int numberId, int numberIndex) {
        this.name = name;
        this.numberId = numberId;
        this.numberIndex = numberIndex;
    }

    public int getNumberId() {
        return numberId;
    }

    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    public int getNumberIndex() {
        return numberIndex;
    }

    public void setNumberIndex(int numberIndex) {
        this.numberIndex = numberIndex;
    }
}
