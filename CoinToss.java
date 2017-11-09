import javax.swing.*;
public class CoinToss{
  public static void main(String[] args) {
    int heads = 0, tails = 0, coins, amount = 0;
    double pheads, ptails, pamount;
    String temp;

  temp = JOptionPane.showInputDialog(null, "Please input the number of coins you would like to flip.");
    amount = Integer.parseInt(temp);


    for(int i = 1;i <= amount;i++){
      coins = (Math.random() <= 0.5) ? 1: 2;
      if(coins == 1)
        tails = tails + 1;
        else
        heads = heads + 1;
    }
  JOptionPane.showMessageDialog(null, "You fliped " +amount+ " There was " +tails+" tails and " +heads+ " heads.");
    pamount = amount;
    ptails = 100.0* tails / amount;
    pheads = 100.0* heads / amount;
  JOptionPane.showMessageDialog(null,"Tails won "+ptails+"% of the time. \nHeads won " +pheads+"% of the time.");
  }
}
