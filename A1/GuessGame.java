public class GuessGame {

    long number;
    int winners = 0;

    void startGame(){
        number = Math.round(10*Math.random()); 
        System.out.println("Game: I have picked a number!");

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();


        Player players[] = { p1, p2, p3 };

        while(winners == 0){
            for(int i = 0; i<3; i++){
                System.out.println("Game: Do you have a guess Player"+ (i+1) +"?");;
                players[i].guessNumber();

                if(players[i].number == number) {
                    winners++;
                    System.out.println("Game: Congratulations."+ System.lineSeparator());
                }
                else System.out.println("Game: Sorry, you're wrong."+ System.lineSeparator());
            }
        }
    }       
}
