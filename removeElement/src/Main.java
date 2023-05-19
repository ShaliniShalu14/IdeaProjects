// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int[] nums = {0,5,1,2,23,7,2,2,2};
        int val = 2;
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        System.out.println("Hello and welcome!");
        System.out.println( removeElemnt(nums,val));

            }

    public static int removeElemnt(int[] nums, int val)
    {int k =0;
        for(int i =0; i< nums.length; i++)
        {
            if(nums[i]!=val)
            {  nums[k]=nums[i];
                k++;
            }
        }

        return k;
    }
}