// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int[] selectsortArray={6,5,4};
        //selection sort
        for (int i=0;i<selectsortArray.length-1;i++)
        {
            int smallestOne=i;
            for (int j=i+1;j<selectsortArray.length;j++)
            {
            if(selectsortArray[smallestOne]>selectsortArray[j]){
                smallestOne=j;
            }

        }
            int temp=selectsortArray[smallestOne];

            selectsortArray[smallestOne]=selectsortArray[i];
            selectsortArray[i]=temp;
        }
        printArray(selectsortArray);
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}