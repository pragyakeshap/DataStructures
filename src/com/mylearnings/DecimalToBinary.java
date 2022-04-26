public class DecimalToBinary {

    static Integer[] binary = new Integer[10] ;
    static int i =0;
    public static void main(String args[]){
        DTB(35);
      for(int j=(binary.length - 1); j>=0; j--){
          if(binary[j] !=null) {
              System.out.print(binary[j]);
          }
      }
    }

    private static void DTB(int quotient){
        int remainder = quotient %2;
        binary[i++] = remainder;
        int newQuotient = quotient/2;
        if(newQuotient == 0){
            return;
        }else{
            DTB(newQuotient);
        }
    }

}

