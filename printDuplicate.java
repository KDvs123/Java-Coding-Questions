public class printDuplicate {

    public static void main(String[] args) {

        int [] numbers=new int[] {23,21,23,12,24,21};
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    System.out.println(numbers[i]);
                }
            }
        }





    }

}

