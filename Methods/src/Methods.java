public class Methods
{

    public static void main(String[] args)
    {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        caloriesBurned(true, 100, 150, 7);

        //PS: There is a method for each type of function needed
    }


    //SCORES METHOD
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {

        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final score is: " + finalScore);
        }
    }


    //CALORIES METHOD
    public static void caloriesBurned(boolean exercise, int joules, int weight, int level)
    {
        if (exercise)
        {
            double calories = joules * (weight / level);
            calories += 0;
            System.out.println("Calories burned: " + calories);

        }

    }
}


