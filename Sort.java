import java.util.*;
public class Sort {
  public static void main(String[] args) {
    int [] numbers = {5,9,8,1,2,3,6,7,4};
    Arrays.sort(numbers);
    for(int i = 0; i < numbers.length; i++)
      System.out.print(numbers[i] + " ");
}
}
