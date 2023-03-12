public class Player {
    long number;

    void guessNumber(){
        number = Math.round(10*Math.random()); 
        System.out.println("I have a guess! It's " + number);
    }
}