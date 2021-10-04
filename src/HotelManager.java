import java.util.ArrayList;

public class HotelManager {
    ArrayList<Customer> customerArrayList = new ArrayList<>();

    public void displayCustomerArrayList(){
        for (Customer c: customerArrayList) {
            System.out.println(c);
        }
    }

    public ArrayList<Customer> addNewCustomer(Customer newCustomer){
        customerArrayList.add(newCustomer);
        return customerArrayList;
    }

    public ArrayList<Customer> removeCustomer(int index){
        customerArrayList.remove(index);
        return customerArrayList;
    }




}
