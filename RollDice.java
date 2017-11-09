class RollDice {
  public static void main(String[] args) {
    int dice1, dice2, sum;
    String message;


    dice1 = (int)(Math.random() * 6) + 1;
    dice2 = (int)(Math.random() * 6) + 1;
    sum = dice2 + dice1;
/*
    if (sum == 2 || sum ==3 ||sum ==12)
      message = "You lose!";
    else if (sum == 7 || sum ==11)
      message = "You win!";
    else
      message = "Roll again!";
*/


    switch (sum) {
      case 2:
      case 3:
      case 12: message = "You have lost to the great Rocket Man";
        break;

      case 7:
      case 11: message = "You have beaten the great Rocket Man";
        break;

      default : message = "roll again";

    }
    
    System.out.println(" You rolled: "+dice1+" and "+dice2);
    System.out.println("For a sum of: " +sum);
    System.out.println(message);



  }
}
