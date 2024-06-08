public class findSmallest {

    public static void main(String[] args) {

        int [] numbers=new int[] {23,21,23,12,24,21,1};
        int minVal=numbers[0];

        for(int i=1;i<numbers.length;i++){
            if(minVal>numbers[i]){
                minVal=numbers[i];
            }
        }

        System.out.println("The smallest value in this array is: "+minVal);



    }

}

