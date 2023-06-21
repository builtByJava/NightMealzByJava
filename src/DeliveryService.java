import java.util.Scanner;

public class DeliveryService extends OrderService {

    Scanner scan = new Scanner(System.in);
    //instance variables

  @Override
  public void startOrder() {

      System.out.println("Welcome to the delivery service. What can we grab for you tonight?");
      String customerOrderItem = scan.nextLine();
      OrderItem orderItems = new OrderItem();
      orderItems.addItem(customerOrderItem);

      while (true) {
          System.out.println("Another item? Y/N");
          String addMore = scan.nextLine();
          if(addMore.equals("Y")){
              System.out.println("What can we get for you?");
              String additionalItem = scan.nextLine();
              orderItems.addItem(additionalItem);
          }else{
              System.out.println("Returning to main menu....");
              break;
          }
      }
  }



  @Override
    public void finishOrder(){
      System.out.println("Knock, knock at your door. Food is here....");
  }
}
