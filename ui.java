import java.util.Scanner;

public class ui {
    Scanner stdin = new Scanner(System.in);
    public void startProgram() {
        evaluator evaluate = new evaluator();
        movie [] movies = new movie [50];
        movies = evaluate.initializeMovies();
        
        boolean exit = false;
        do {
            String input = stdin.nextLine();
            switch(input) {
                case "a":
                    int movieNum = stdin.nextInt(), rate = stdin.nextInt();
                    movies = evaluate.rater(movies, movieNum, rate);
                    break;
                case "b":
                    evaluate.recommender(movies);
                    break;
                case "c":
                    exit = true;
                    break;
                default:
                    System.out.println(" wr inp");
            }
        } while (!exit);
    }
}
