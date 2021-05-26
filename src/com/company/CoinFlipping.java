package com.company;

public class CoinFlipping {
    private String coinFlipping(){
        if ((int) (Math.random()*(2)) == 1) {
            return "Орёл";
        } else {
            return "Решка";
        }
    }
    public String comparison(String inputMessage){
        if(inputMessage.equals(coinFlipping())){
            return "Win!";
        } else {
            return "Lose(";
        }
    }
}
