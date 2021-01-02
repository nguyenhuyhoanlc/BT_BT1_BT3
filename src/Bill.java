public class Bill {
    private Customer customer;
    private int oldIndex;
    private int newIndex;

    public Bill(Customer customer, int oldIndex, int newIndex) {
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public int getTotalMoney(){
        return (newIndex - oldIndex)* 750;
    }

    public int getClineID(){
        return this.customer.getNumberId();
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer=" + customer +
                ", oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                '}';
    }
}
