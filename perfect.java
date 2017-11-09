class Perfect {
  public static void main(String[] args) {
    int value1 = 1;
    int value2 = 1000;
      
      for (value1 = 1; value1 <= value2; value1++){
        int sum = 0;
        for (int i = 1; i < value1; i++){
          if ((value1 %i) == 0){
          sum += i;
        
        
        }
      }
    if (sum == value1){
      System.out.println(sum);
     }
    }
   }  
  }