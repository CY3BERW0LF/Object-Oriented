
/**
 *
 * @author Ricky
 */
import java.util.ArrayList;
import java.util.Arrays;

public class GPA {
    private static String[] i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize grade variables
        String[] letters = {"D","B","C","A","E"}; 
        ArrayList <Double> GPA = new ArrayList<Double>();
        GPA.add(3.4);
        GPA.add(3.9);
        GPA.add(4.0);
        GPA.add(4.0);
        GPA.add(3.0);
        Arrays.sort(letters);
        //Print out the elements
        for (int i = 0; i < letters.length; i++)
        {
            System.out.printf("\n%s\t ->\t%.2f", letters[i],GPA.get(i));
        }
      //  for (double number : dArr)
        {
        //    System.out.println(number);
    }
    
    
    }
}
