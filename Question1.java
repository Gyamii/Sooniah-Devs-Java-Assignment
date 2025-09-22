import java.util.Locale;

public class Main{
    public static void main(String[] args) {
       String text= "hello world from java";
       String[] words = text.split(" ");

       for( String word : words){
           String result = word.substring(0,1).toUpperCase()+ word.substring(1);
           System.out.print(result + " ");
       }

    }

}

