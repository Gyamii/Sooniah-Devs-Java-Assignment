import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
      int[] num ={1,2,3,4,5};

       int sum= Arrays.stream(num)
                .filter(n ->n % 2==0)
                .map(n -> n * 2)
                .reduce(0,(a,b) -> a + b);
        System.out.println("This is the sum :" + sum);

        System.out.println();
    }



}


