package app.happygame;

import java.util.HashMap;

/**
 * Created by chris on 20/01/2015.
 */
public class Deck {

    Card card = new Card();
    HashMap <String,Card> deck= new HashMap<String,Card>();


    public Deck(Integer nb){


        switch(nb){
            case 32:break;
            case 54:break;
            default:break;
        }
    }
}
