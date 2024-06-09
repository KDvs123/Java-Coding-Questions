import java.util.*;
public class reverseString {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string value: ");
        String word=input.nextLine();
        
        String reverseWord="";

        for(int i=word.length()-1;i>=0;i--){
            reverseWord+=word.charAt(i);

        }

        System.out.println(reverseWord);


    }

    }
