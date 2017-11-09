import java.util.*;
class Month {
  public static void main(String[] args) {
    int month;
    String monthName;
    Scanner input = new Scanner(System.in);
    System.out.print("Type in a number 1 to 12: ");
    month = input.nextInt();

    //Switches
    switch (month) {

      case 1: monthName = "1st quarter";
        break;

      case 2: monthName = "1st quarter";
        break;

      case 3 : monthName = "1st quarter";
        break;
      case 4 :
      case 5 :
      case 6 :
       monthName = "in 2nd quarter";
          break;
      
      case 7 :
      case 8 :
      case 9 : monthName = " in 3rd quarter";
         break;
      case 10 :
      case 11 :
      case 12 : monthName = "in 4th quarter";
         break;
      
      
      default: monthName = "4not a valid month";
    }
    System.out.println(month+ " is " +monthName);
  }
}
