public class Fib {
   public static void main(String[] args) {
     int [] fibSeq = new int [30];
     fibSeq[0] = 1;
     fibSeq[1] = 1;
     for(int i = 2 ; i < fibSeq.length; i++)
      fibSeq[i] = fibSeq[i-1] + fibSeq[i-2];

     for(int i = 0 ; i < fibSeq.length; i++)
     System.out.println(fibSeq[i] + " ");
   }
}
