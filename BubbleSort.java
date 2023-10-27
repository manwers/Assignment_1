public class BubbleSort {

    public static void main(String[] args) {
        int numberList[]={ 10,5,25,1,15};
        int tempArray;
        for(int i=0;i<numberList.length;i++){
            for(int j =1;j< numberList.length-i;j++){
                if(numberList[j-1]>numberList[j]){
                    tempArray=numberList[j-1];
                    numberList[j-1]=numberList[j];
                    numberList[j]=tempArray;


                }


            }
        }
        System.out.print("number list after being sorted: ");
        for(int i=0;i<numberList.length;i++){

            System.out.print(numberList[i] + " ");

        }
    }
}
