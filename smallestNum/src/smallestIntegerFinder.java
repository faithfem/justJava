public class smallestIntegerFinder {


        public static int findSmallestInt(int[] args) {

            int min = args[0];

            for(int i = 0; i < args.length; i++){
                min = Math.min(args[i], min);
            }


            return min;
        }

    }



