import javax.swing.*;

public class PhoneNumbers {
  public static void main(String[] args) {
    String[] names = new String[30];
    String[] numbers = new String[30];
    String entryName, entryNumber;

    int count = 10; // initial 10 people
    boolean isFound = false;

    names[0] = "apple"; numbers[0] = "(706)-555-0001";
    names[1] = "brave"; numbers[1] = "(706)-555-0002";
    names[2] = "goolag"; numbers[2] = "(706)-555-0002";
    names[3] = "samsung"; numbers[3] = "(706)-555-0003";
    names[3] = "kappa"; numbers[3] = "(706)-555-0004";
    names[4] = "pogchamp"; numbers[4] = "(706)-555-0005";
    names[5] = "residentsleeper"; numbers[5] = "(706)-555-0006";

         entryName = JOptionPane.showInputDialog(null,"Enter name to look up. \nType 'quit' to quit ");

    while ( count < names.length && !entryName.equals("quit")) {
      for(int i = 0; i <count; i++)
      if(entryName.equals(names[i])) {
        isFound = true;
        JOptionPane.showMessageDialog(null,names[i]+ "'s phone number is " + numbers[i]);
      }
      if(!isFound){
      entryNumber = JOptionPane.showInputDialog(null,"Enter phone number to look up. \nType 'quit' to quit ");
      names[count] = entryName;
      numbers[count] = entryNumber;
      count++;
    }
    }
    isFound = false;
         entryName = JOptionPane.showInputDialog(null,"Enter name to look up. \nType 'quit' to quit ");

  }


}
