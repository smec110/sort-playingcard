/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceex3;

// PlayingCard.java
// Author: Rob Miller
// Program last changed: 27 October 2008
    
public class PlayingCard implements Comparable <PlayingCard>
{
    private String suit;   // clubs, diamonds, hearts or spades
    private String rank;   // ace, 2, 3, etc.
    
    public PlayingCard (String aRank, String aSuit)
    {
        if (rankOK(aRank))
            this.rank = aRank;
        else
        {
            System.out.println("Fatal Error: forbidden rank used creating playing card.");
            System.exit(0);
        }
        if (suitOK(aSuit))
            this.suit = aSuit;
        else
        {
            System.out.println("Fatal Error: forbidden suit used creating playing card.");
            System.exit(0);
        }
    }
    
    private static boolean rankOK(String aRank)
    {
        return (aRank.equals("ace") ||
                aRank.equals("2") ||
                aRank.equals("3") ||
                aRank.equals("4") ||
                aRank.equals("5") ||
                aRank.equals("6") ||
                aRank.equals("7") ||
                aRank.equals("8") ||
                aRank.equals("9") ||
                aRank.equals("10") ||
                aRank.equals("jack") ||
                aRank.equals("queen") ||
                aRank.equals("king"));
    }
    
    private static boolean suitOK(String aSuit)
    {
        return (aSuit.equals("clubs") ||
                aSuit.equals("diamonds") ||
                aSuit.equals("hearts") ||
                aSuit.equals("spades"));
    }
    
    
    public String toString ()
    {
        return (this.rank + " of " + this.suit);
    }
    
    @Override
    public boolean equals (Object otherObject)
    {
        if (!super.equals(otherObject))
            return false;
        PlayingCard otherPlayingCard = (PlayingCard)otherObject;
        return (this.rank == otherPlayingCard.rank && 
                this.suit == otherPlayingCard.suit);
    }
    
    @Override
    public int compareTo(PlayingCard other) {
        int i = this.suit.compareTo(other.suit);
        if (i == 0){
            try{
                Integer current = Integer.parseInt(rank);
                Integer otherC = Integer.parseInt(other.rank);
                return current.compareTo(otherC);
            }
            catch (NumberFormatException e){
                return this.rank.compareTo(other.rank);
            }
            
        }
        return i;
    }   
     
}


