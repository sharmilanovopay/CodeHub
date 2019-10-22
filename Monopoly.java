package com.company;

public class Monopoly {
    int sum;
    int dice1;
    int dice2;
    public void twoDiceRolls(){
        dice1 = (int)(Math.random()*6)+1;
        dice2 = (int)(Math.random()*6)+1;
        sum =  dice1 + dice2;
        System.out.println("Value on Dice 1= " + dice1 + " and Dice 2 = "+ dice2 );
        while (dice1==dice2){
            System.out.println("Since bot dice rolled up to same values, they get to go again ROLLING DOUBLES ");
            dice1=(int)(Math.random()*6)+1;
            dice2=(int)(Math.random()*6)+1;
            sum = sum + dice1 + dice2;
            System.out.println("rolling doubles Value on Dice 1= " + dice1 + " and Dice 2 = "+ dice2 );
        }
        System.out.println("sum of the dice results = " + sum);
    }
}
class mainMonopoly{
    public static void main(String[] args) {
        Monopoly monopolygame= new Monopoly();
        for (int player=1;player<=10;player++){
            System.out.println("********Player "+player+" is playing now********");
            monopolygame.twoDiceRolls();
        }

        String googol = "1";
        int length = googol.length();
        while (length<=100){
            googol += "0";
            length = googol.length();
        }
        System.out.println("googol is equal to " + googol);
    }
}
