/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide7_DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
         "10", "Jack", "Queen", "King"};
        
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        int temp = 0;
        for (int i = 0; i < deck.length; i++) {
            int shuffle = (int)(Math.random()*52);
            temp = deck[i];
            deck[i] = deck[shuffle];
            deck[shuffle] = temp;     
        }
        for (int i = 0; i < 4; i++) {
            int suit = deck[i]/13;
            int rankIndex = deck[i]%13;
            System.out.printf("%d st card's suit is %s and its rank is %s \n",(i+1), suits[suit],ranks[rankIndex]);
        }
    }
}
