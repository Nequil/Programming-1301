public class Craps {
  public static void main(String[] args) {
    int dice1, dice2;
    int sum1, sum2;
    boolean rollAgain = false;

    dice1 = (int) (Math.random() * 6) + 1;
    dice2 = (int) (Math.random() * 6) + 1;
    sum1 = dice1 + dice2;

    System.out.println("You rolled "+dice1+" and "+dice2);

    if (sum1 == 7 || sum1 == 11)
      System.out.println("You win");

    else if (sum1 == 2 || sum1 == 3 || sum1 == 12)
      System.out.println("Sorry, you lose ");
    else {
      System.out.println("Roll again. You need to roll a " +sum1);
      rollAgain = true;

    }
    while (rollAgain) {

      dice1 = (int) (Math.random() * 6) + 1;
      dice2 = (int) (Math.random() * 6) + 1;
      sum2 = dice1 + dice2;

      System.out.println("You rolled "+dice1+" and "+dice2);

      if (sum1 == sum2) {
        System.out.println("You have won!");
        rollAgain = false;

      }
      else if (sum2 == 7){
          System.out.println("You lose!");
          rollAgain = false;
          }
          else
            System.out.println("roll Again");

      }





  }
}
