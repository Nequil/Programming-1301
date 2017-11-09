import javax.swing.*;
public class StringCount {
  public static void main(String [] args) {

    int wordCount = 0;
    int vowels = 0;
    String input;

    input = JOptionPane.showInputDialog(null,"Please input a sentence, paragraph, or word.");

    for(int i = 0; i < input.length(); i++){
      char ch = input.charAt(i);
      if (ch == 'a'|| ch == 'i'|| ch == 'o'|| ch == 'e'|| ch == 'u')
      
      vowels++;
    }
    for(int i = 0; i < input.length(); i++){
      char ch = input.charAt(i);
      if (ch == ' '|| ch == '.'|| ch == '?'|| ch == '!'|| ch == '-')
       
      wordCount++;
    }
    JOptionPane.showMessageDialog(null,"You inputed " + input + "\nThere was " + wordCount +" words. \nThere was " +vowels+ " vowels.");
  }
}
