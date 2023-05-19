import java.time.Clock;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] sweetness={6,3,2,8,7,5};
        int K=2;
        int N=0;
        int low=1;
        int max=sumOfsweetness(sweetness);
        int currentSweetness=0;
        System.out.println(max);

        while(low<=max){
            int midpointSweetnessRange=(low+max)/2 ;
            int totalSweetness=0;
            int[] newSweetnessPieces = new int[0];
            int pieces=0;
              for(int s:sweetness)
                {
                    currentSweetness+=s;
                    if(currentSweetness>midpointSweetnessRange)
                    {
                        pieces++;

                        currentSweetness=0;
                    }

                }}
            if (pieces > K) {
                // If we can form more pieces than allowed, sweetness should be increased
                low = max;
            } else {
                // If we can form fewer pieces than allowed, sweetness should be decreased
                max = midpointSweetnessRange - 1;
            }


              


        }

    }
    public static int sumOfsweetness(int [] sweetness)
    {
        int sum=0;
        for (int sweet:sweetness)
        {
            sum+=sweet;
        }
        return sum;
    }}