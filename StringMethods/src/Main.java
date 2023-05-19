// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        String s= "This is a lot of text again";
        int[] marks={21,47,65,43};
        String[] weeks={"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//      print each text in diff line
        for (int i = 0; i <s.length(); i++) {


            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            //System.out.println(s.charAt(i));
        }
        // get character at any index
        //System.out.println(s.charAt(10)); //  o/p is "l"
        // get index of any specific character
        //System.out.println(s.indexOf('i'));
        //System.out.println(s.lastIndexOf('i'));
        // two diff ways to Print elements of the array
        for (int mrk:marks)
        {
           // System.out.println(mrk);
        }
        for(int i=0;i< marks.length;i++)
        {
            //System.out.println(marks[i]);
        }

        //calling method to find the day with most letters
        System.out.println(array_methods(weeks));
    }

    //method- create a string array with days of the week and find the day with most number of letters in it
            public static String array_methods(String[] weeks)
            {   String dayWithMostLetters= "";
                int lengthOfDay=0;
                for(String week:weeks){
                   if( week.length()>dayWithMostLetters.length())
                   {
                       //lengthOfDay=week.length();
                       dayWithMostLetters=week;
                   }
                }
                return dayWithMostLetters;
            }
}