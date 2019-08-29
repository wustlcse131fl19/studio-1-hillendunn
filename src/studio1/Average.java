package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int testScore1 = ap.nextInt("What is the first test score?");
        int testScore2 = ap.nextInt("What is the second test score?");
        double averageTestScore = (double)(testScore1 + testScore2) / 2;

        System.out.println("The average of both test scores is: " + averageTestScore);

    }
}
