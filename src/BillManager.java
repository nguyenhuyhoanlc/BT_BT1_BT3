import java.util.Map;
import java.util.TreeMap;

public class BillManager {
    Map<Integer, Bill> billList = new TreeMap<>();

    public void addBill(Bill bill){
        int id = bill.getClineID();
        billList.put(id, bill);
    }

    public int getTotalMoneyById(int numberID){
        Bill bill = billList.get(numberID);
        if (bill == null) return 0;
        else return bill.getClineID();
    }

    public void displayAllBill(){
        System.out.println(billList);
    }
}
