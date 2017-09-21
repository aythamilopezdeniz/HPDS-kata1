package org.ulpgc;

public class FizzBuzz {
    public String get(int position) {
        if(position%15==0)return "FizzBuzz";
        else if(position%5==0)return "Buzz";
        return (position%3==0) ? "Fizz" : String.valueOf(position);
    }
}
