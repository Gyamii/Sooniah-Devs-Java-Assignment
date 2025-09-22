import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers are you inputing");
        int size = scanner.nextInt();
        int[] Arr1 = new int[size];

        for(int i=0; i< size; i++){
            System.out.println("Enter number " + (i+1) + " :");
            Arr1[i]=scanner.nextInt();
        }


        Scanner element = new Scanner(System.in);
        System.out.println("How many numbers are you inputing");
        int size2 = element.nextInt();
        int[] Arr2 = new int[size2];

        for(int i=0; i< size; i++){
            System.out.println("Enter number " + (i+1) + " :");
            Arr2[i]= element.nextInt();
        }

        int[] merged = Arrays.stream(new int[][]{Arr1,Arr2})
                             .flapMapToInt(Arrays :: stream)
                             .toArray();
        System.out.println(Arrays.toString(merged));



    }



}
