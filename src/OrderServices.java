import java.util.ArrayList;

public class OrderServices {

    //in this class we need:
    //a menu of foods - ArrayList
    //an individual cost per food item - double
    //total qty of order items with total cost
    //instance variables
    private ArrayList<String> menuItems = new ArrayList<String>();
    private ArrayList<String> orderItems = new ArrayList<String>();
    private double totalCost = 0.00;

    //methods for the order service
    public void startOrder(){
        OrderItem oi  = new OrderItem();

    }

    public void addToOrder(OrderItem item){
        orderItems.add(String.valueOf(item));
        System.out.println("You have added: " + item + " to your current order");
    }

    public void addTip(){
        System.out.println("You've added a tip of :" );
    }

    public void removeFromOrder(OrderItem item){
        orderItems.remove(String.valueOf(item));

    }

//    public double calculateOrderTotal(){
//        //calculate quantity and cost of individual items
//        totalCost += quantity * individualCost;
//        System.out.println("Your total today comes out to: " + totalCost);
//        // add in tip
//        System.out.println("Would you like to leave a tip?");
//        if(addTip.equals("Yes") || addTip.equals("Y")){
//            totalCost += tipAmount;
//        }else{
//            System.exit(0);
//        }
//
//        return totalCost;
//
//    }

    public void finishOrder(){
        System.out.println("Your order is now complete. Thank you and please do come again...");
    }


}


