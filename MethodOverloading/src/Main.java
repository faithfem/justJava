public class Main {
    public static void main(String[]args)
    {

        //CALL THE METHOD
        caloriesBurned("Nancy", 150);
        caloriesBurned("Mary",200);
        caloriesBurned("Julie");
        caloriesBurned(0);

    }
        //METHOD
        private static void caloriesBurned(String loserName, int weight)
        {
        System.out.println("Loser " + loserName + " weighs " + weight + " pounds");
        }


    //METHOD OVERLOADING EXAMPLE 1-USING SAME METHOD...DIFF PARAMS

    private static void caloriesBurned(String loserName)
    {
        System.out.println("Loser " + loserName + " did not get weighed");
    }


    //METHOD OVERLOADING EXAMPLE 2

    private static void caloriesBurned(int weight)
    {
        System.out.println("No more losers");
    }

}

