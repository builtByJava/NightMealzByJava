import java.util.ArrayList;
import java.util.Scanner;

public class OrderItem {
    // in this class we need to track what order items are selected
    //instance variables
    Scanner scan = new Scanner(System.in);
    ArrayList<String> orderItemList = new ArrayList<String>();



    public void addItem(String food){
        orderItemList.add(String.valueOf(food));
        System.out.println("Just added: " + food + " to your order");

        System.out.println("Your order sheet:");
        System.out.println("========================");
        //looping throught the contents of the orderItemsList - ArrayList DS
            for (String s : orderItemList) {
                System.out.println(s);
            }
            System.out.println("total order items: " + orderItemList.size());

    }

}
