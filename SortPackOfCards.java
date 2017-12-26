/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceex3;

/**
 *
 * @author stellacanessa
 */
public class SortPackOfCards
{
    public static void main (String[] args)
    {
        PlayingCard[] packOfCards = new PlayingCard[52];
        packOfCards[0] = new PlayingCard("7","clubs");
        packOfCards[1] = new PlayingCard("5","hearts");
        packOfCards[2] = new PlayingCard("8","diamonds");
        packOfCards[3] = new PlayingCard("5","diamonds");
        packOfCards[4] = new PlayingCard("8","spades");
        packOfCards[5] = new PlayingCard("4","clubs");
        packOfCards[6] = new PlayingCard("7","spades");
        packOfCards[7] = new PlayingCard("6","spades");
        packOfCards[8] = new PlayingCard("king","spades");
        packOfCards[9] = new PlayingCard("10","spades");
        packOfCards[10] = new PlayingCard("ace","diamonds");
        packOfCards[11] = new PlayingCard("queen","spades");
        packOfCards[12] = new PlayingCard("jack","spades");
        packOfCards[13] = new PlayingCard("ace","hearts");
        packOfCards[14] = new PlayingCard("queen","diamonds");
        packOfCards[15] = new PlayingCard("4","hearts");
        packOfCards[16] = new PlayingCard("5","clubs");
        packOfCards[17] = new PlayingCard("6","hearts");
        packOfCards[18] = new PlayingCard("5","spades");
        packOfCards[19] = new PlayingCard("3","diamonds");
        packOfCards[20] = new PlayingCard("2","clubs");
        packOfCards[21] = new PlayingCard("ace","spades");
        packOfCards[22] = new PlayingCard("9","spades");
        packOfCards[23] = new PlayingCard("6","diamonds");
        packOfCards[24] = new PlayingCard("2","spades");
        packOfCards[25] = new PlayingCard("8","clubs");
        packOfCards[26] = new PlayingCard("9","hearts");
        packOfCards[27] = new PlayingCard("jack","clubs");
        packOfCards[28] = new PlayingCard("10","hearts");
        packOfCards[29] = new PlayingCard("2","diamonds");
        packOfCards[30] = new PlayingCard("jack","diamonds");
        packOfCards[31] = new PlayingCard("ace","clubs");
        packOfCards[32] = new PlayingCard("10","diamonds");
        packOfCards[33] = new PlayingCard("9","diamonds");
        packOfCards[34] = new PlayingCard("2","hearts");
        packOfCards[35] = new PlayingCard("king","diamonds");
        packOfCards[36] = new PlayingCard("7","diamonds");
        packOfCards[37] = new PlayingCard("3","spades");
        packOfCards[38] = new PlayingCard("9","clubs");
        packOfCards[39] = new PlayingCard("7","hearts");
        packOfCards[40] = new PlayingCard("4","diamonds");
        packOfCards[41] = new PlayingCard("jack","hearts");
        packOfCards[42] = new PlayingCard("4","spades");
        packOfCards[43] = new PlayingCard("3","clubs");
        packOfCards[44] = new PlayingCard("queen","clubs");
        packOfCards[45] = new PlayingCard("queen","hearts");
        packOfCards[46] = new PlayingCard("10","clubs");
        packOfCards[47] = new PlayingCard("8","hearts");
        packOfCards[48] = new PlayingCard("6","clubs");
        packOfCards[49] = new PlayingCard("3","hearts");
        packOfCards[50] = new PlayingCard("king","hearts");
        packOfCards[51] = new PlayingCard("king","clubs");
        
        System.out.println("PACK OF CARDS BEFORE SORTING:");
        for (int i = 0; i < packOfCards.length; i++)
            System.out.println(packOfCards[i]);
        
        SelectionSort.sort(packOfCards);
        
        System.out.println("\nPACK OF CARDS AFTER SORTING:");
        for (int i = 0; i < packOfCards.length; i++)
            System.out.println(packOfCards[i]);
    }
}
