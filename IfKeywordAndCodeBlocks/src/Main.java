public class Main {

    public static void main(String[]args){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = score+(levelCompleted*bonus);
            System.out.println("Final score is: " + finalScore);
        }


        score= 10000;
        levelCompleted=8;
        bonus=200;

        if(gameOver){
            int finalScore2 = score+(levelCompleted*bonus);
            System.out.println("Other Final Score is: " + finalScore2);

            //This method duplicates code and if u change it in one place
            //you have to remember to change it everywhere else it's duplicated
            //rife with errors
        }
    }
}
