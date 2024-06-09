import java.util.*;
public class removeWhiteSpace {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String sentence=input.nextLine();
        String newSentence="";
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)!=' '){
                newSentence+=sentence.charAt(i);


            }
        }
        System.out.println(newSentence);

    }

    }

    

