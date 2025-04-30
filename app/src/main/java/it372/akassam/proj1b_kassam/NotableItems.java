//Afroze Kassam
//Project  1B
//Date: 4/17/2025
package it372.akassam.proj1b_kassam;
import java.util.ArrayList;
import java.util.Random;
public class NotableItems {
    private ArrayList<String> notableItems = new ArrayList<>( );
    private Random r = new Random( );
    public NotableItems( ) {
        // Default constructor that creates
        // Prediction object, but nothing else.
    }

    public void addPrediction(String p) {
        // Add joke to the arraylist
        // of possible  predictions.
        notableItems.add(p);
    }
    public String getPrediction( ) {
        // Choose random index for next prediction.
        int n = r.nextInt(notableItems.size( ));
        // Return nth prediction.
        return notableItems.get(n);
    }
}