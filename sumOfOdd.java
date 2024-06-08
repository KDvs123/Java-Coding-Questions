
public class sumOfOdd {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        int sumOfOdd=0;

        for(int i=0;i<5;i++){
            int randomNum=(int)(Math.random()*10)+1;
            numbers[i]=randomNum;
        }


        for(int number:numbers){
            if(number%2==1){
                sumOfOdd+=number;
            }

        }

        System.out.println(sumOfOdd);





    }

}
