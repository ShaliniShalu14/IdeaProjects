import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[] numbers= {11,2,13,16,7,15};
       int target = 17;
        int[] arraynum= new int [2];
        //arraynum = twoSum_forloop(numbers, target);
        arraynum = twoSum_hashmap(numbers, target);
       System.out.println(arraynum[0] +"," +arraynum[1]);
    }
// using for loop, it passed all test cases.
    public static int[] twoSum_forloop(int[] numbers, int target){
        int[] arraynumber = new int [2];
        for(int i =0;i<numbers.length;i++ )
        { int x = numbers[i];
            for(int j=i+1; j<numbers.length;j++)
            { int sum = x+numbers[j];
                if(sum==target){
                    int num = numbers[i];
                    arraynumber[0] = i;
                    arraynumber[1] = j;
                    break;


            }
            }



        }

        return arraynumber;

    }


    //pointer solution didnot passed all test cases in Leetcode
    public static int[] twoSum_pointer(int[] number, int target){
        int a_pointer= 0;
        int b_pointer= number.length-1;
        while(a_pointer<= b_pointer) {
            int sum = number[a_pointer] + number[b_pointer];
            if (sum > target) {
                b_pointer = b_pointer-1;
            } else if (sum < target) {
                a_pointer = a_pointer+1;

            } else {
                return new int[]{a_pointer, b_pointer};
            }
        }
        return new int[]{a_pointer, b_pointer};
    }
// using hashmap

    public static int[] twoSum_hashmap(int[] numbers, int target)
    {   Map<Integer,Integer> compliments = new HashMap<>();
        for (int i=0;i<numbers.length;i++){
        Integer indexofcompliments= compliments.get(numbers[i]); // it gives back the value of the key
        // i.e. which number needs it as a compliment
        if(indexofcompliments!=null)
        {
            return new int[] {i,indexofcompliments};
        }
        compliments.put(target-numbers[i], i);

        }


        return numbers;
    }
}