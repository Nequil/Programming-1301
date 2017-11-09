import javax.swing.*;
class RockPaperScissors{
public static void main(String[] args) {
  int user, computer;
  String userPick, computerPick, msg;
  user = Integer.parseInt(JOptionPane.showInputDialog(null,"Type one of the following numbers"+
    "\n1 -- rock \n2 -- paper \n3 -- scissors"));
    
    computer = (int)(Math.random() *  3) + 1;

    userPick = choice(user);
    computerPick = choice(computer);

    if (user == 1)
      if (computer == 1)
        msg = "Tie!";
      else if (computer == 2)
        msg = "Computer wins!";
      else
        msg = "player";
      else if (user == 2)
        if (computer == 2)
          msg = "Tie!";
          else if (computer == 3)
          msg = "Computer wins!";
        else
          msg = "player";
        else
        if (computer == 1)
          msg = "computer!";
        else if (computer == 2)
          msg = "player!";
        else
          msg = "tie";

          JOptionPane.showMessageDialog(null, "You picked "+ userPick+
          "\nComputer picked "+computerPick+
          "\nWinner "+msg);


        }

        public  static String choice (int p){
          String pick;
          if (p == 1 )
            pick = "rock";
            else if(p == 2)
            pick = "paper";
            else
            pick = "paper";
            return pick;
}
}
