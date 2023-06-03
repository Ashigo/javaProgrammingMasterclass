public class ifKeywordChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;

        calculateScore(gameOver,800,5,100);

        calculateScore(gameOver,10000,8,200);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
