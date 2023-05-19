// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int[] sortArray={8,1,7,4,3,9,5,2};
        int [] sortArray1={9,8,4,77,1};
        //bubble sort
        for (int i=0; i<sortArray.length;i++)
        {
            for(int j=0;j<sortArray.length-1-i;j++)
            {
                if(sortArray[j]>sortArray[j+1])
                {
                    int temp=sortArray[j];
                    sortArray[j]=sortArray[j+1];
                    sortArray[j+1]=temp;
                }

            }
        }
// selection sort
        for(int k=0;k<sortArray1.length;k++)
        {
            int smallest=k;
            for (int l=k+1;l< sortArray1.length;l++)
            {
                if(sortArray1[smallest]>sortArray1[l])
                {
                    smallest=l;
                }
            }
            int temp1=sortArray1[k];
            sortArray1[k]=sortArray1[smallest];
            sortArray1[smallest]= temp1;
        }
        printArray(sortArray1);

    }
    public static void printArray(int[] array1)
    {
        for (int k=0;k<array1.length; k++)
        {
            System.out.print(array1[k] +" ");
        }
        //System.out.println();
    }
}