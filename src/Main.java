import java.util.Scanner;

public class Main {
    public static final int MIN_INDEX = 0;
    private static BillManager billManager = new BillManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println(".1.Add new bill");
            System.out.println("2.Get total money by ID");
            System.out.println("3.Display all Bill");
            System.out.println("4.Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập n bill :");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        addNewBill();
                    }
                    break;
                case 2:
                    System.out.println("Nhập số ID : ");
                    int  numberID = Integer.parseInt(scanner.nextLine());
                    int result = billManager.getTotalMoneyById(numberID);
                    System.out.println(result);
                    break;
                case 3:
                    billManager.displayAllBill();
                    break;
                case 4:
                    System.exit(0);
            }

        }while (choice!=0);
    }

    public static void addNewBill() {
        System.out.println("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.println("Nhập số nhà :");
        int numberID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập số công tơ điện : ");
        int numberIndex = scanner.nextInt();
        scanner.nextLine();
        int oldIndex;
        do {
            System.out.println("Nhập số điện cũ");
            oldIndex = Integer.parseInt(scanner.nextLine());
        }while (oldIndex < MIN_INDEX) ;
        int newIndex;
        do {
            System.out.println("nhập số điện tháng này :");
            newIndex = Integer.parseInt(scanner.nextLine());
        }while (newIndex< oldIndex);
        Customer customer = new Customer(name,numberID,numberIndex);
        Bill bill = new Bill(customer, oldIndex, newIndex);
        billManager.addBill(bill);
    }
}
