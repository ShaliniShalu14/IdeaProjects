// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int[] nums={1,2,2,3,4,4,4,5,6,6,7,7};
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        int j =1;
        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i]!= nums[i+1])
            {
              nums[j]= nums[i+1];
              j++;
            }


        }
        System.out.println(j);
    }
}