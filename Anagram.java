import java.util.*;
public class Anagram {
    public static void main(String[] args) {

        String a="bag";
        String b="god";
        if(a.length()!=b.length()){
            System.out.println("Not anagram");
        }else{
            char[] array1=a.toCharArray();
            char[] array2=b.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            if(Arrays.equals(array1,array2)){
                System.out.println("Anagram");
            }else{
                System.out.println("Its not");
            }




        }

    }

}
