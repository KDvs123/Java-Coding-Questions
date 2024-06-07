public class palindrome{
    public static void main(String[] args){
        String word="Mom";
        String newWord="";
        for(int i=word.length()-1;i>=0;i--){
            newWord+=word.charAt(i);

        }

        System.out.println(word.equals(newWord)? "Palindrome":"Not Palindrome");
    }
}