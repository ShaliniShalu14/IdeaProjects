// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int[] array1={1,2,5,6,7,8,9};
        int searchelement=7;

        System.out.println(binarySearch(array1,searchelement));
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
         }
    //binary search

    public static int binarySearch(int[] array1, int searchelement)
    {
        int high= array1.length-1;
        int low=0;

        while(low<=high){
            int middlePosition=(low+high)/2;
            if (array1[middlePosition]== searchelement)
            {
                return middlePosition;
            }
            if (array1[middlePosition]> searchelement)
            { high= middlePosition-1;

            }
            else{
                low= middlePosition+1;
            }
        }
        return -1;
    }
}