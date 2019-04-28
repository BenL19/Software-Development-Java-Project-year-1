package questions;

import java.util.Random;

public class Cards{
    public static void main(String[] args){
	    Cards c = new Cards();

    	String[] cards=new String[52];
        String[] types={"hearts", "spades", "clubs", "diamonds"};
        int current = 0;
        for(String type:types) {
            for(int i = 1; i <= 13 ; i++) {
                cards[current++] = i + "_of_" + type;
            }
        }

        for(int count = 0; count <= 51; count++) {
        	System.out.println(c.shuffle(cards)[count]);
        }

    } //end main

    public String[] shuffle(String[] deck) {
        Random rnd = new Random();

        for (int i = deck.length - 1; i >= 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = deck[index];
            deck[index] = deck[i];
            deck[i] = a;
        }
        return deck;
    }
}// end class
