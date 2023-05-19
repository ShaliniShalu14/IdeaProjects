// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        int[] array={5,9,1,4,2,3};
        int si=0;
        int n= array.length;
        divide(array,0,n-1);
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
       for(int i=0;i<array.length;i++)
         { System.out.print(array[i]+",");
         }
        System.out.println();
}
    public static void divide(int[] array, int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid= si+(ei-si)/2;
        divide(array,si,mid);
        divide(array,mid+1,ei);
        conquer(array,si,ei,mid);

    }
    public static void  conquer(int[] array, int si, int ei, int mid)
    {
        int[] merged= new int[ei-si+1];
        int index1=si;
        int index2=mid+1;
        int i=0;
        while(index1<=mid && index2 <= ei)
        {
            if(array[index1]< array[index2])
            {
                merged[i++]=array[index1++];
            }
            else {
                merged[i++]=array[index2++];
            }


        }
        while (index1<=mid){
            merged[i++]=array[index1++];
        }
        while (index2<=ei){
            merged[i++]=array[index2++];
        }

         for(int k=0,j=si;k<merged.length;k++,j++)
         {
             array[j]= merged[k];

         }
    }
}