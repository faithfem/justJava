public class score {
    public static void main(String[] args) {

        int score = 1000;
        int levelCompleted = 5;
        boolean gameOver = true;
        int bonus = 10000;

        calculateScore(score, levelCompleted, gameOver, bonus); //call the method below.

        //BETTER METHOD BELOW
        //Or you can use method below which is better because u can then eliminate the need to declare any variables above
        calculateScore(8, 5, true, 500); //u can use above function or this (this is same as one below)
        calculateScore(2300, 6, false, 1000);
    }

    //this is the method below
    //we use int instead of void because we do have parameters
    //we use return because

    public static int calculateScore(int score, int levelCompleted, boolean gameOver, int bonus) {

        //now print the method
        if (!gameOver) {

            int finalScore = score + (levelCompleted * bonus);

            System.out.println("Your Final Score is " + finalScore);
            return finalScore;

        } else {
            System.out.println("Game is not over");
            return -1;

        }
    }
}
