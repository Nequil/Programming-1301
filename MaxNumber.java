import javax.swing.*;
class MaxNumber {
  public static void main(String[] args) {
    int num1, num2, maxNum;
    String input;
  input = JOptionPane.showInputDialog(null,"Enter your first number");
  num1 = Integer.parseInt(input);

  input = JOptionPane.showInputDialog(null,"Enter your second number");
  num2 = Integer.parseInt(input);

  if (num1 > num2)
    maxNum = num1;
  else
    maxNum = num2;

    JOptionPane.showMessageDialog(null,"Your numbers where: "+num1+" and "+num2+
    "\nThe maximum value is: "+maxNum);

  }
}
