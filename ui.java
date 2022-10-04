import java.util.Scanner;

public class ui {
    Scanner stdin = new Scanner(System.in);
    public void startProgram() {
        evaluator evaluate = new evaluator();
        movie [] movies = new movie [50];
        movies = evaluate.initializeMovies();
        
        boolean exit = false;
       
        System.out.println("Welcome to the movie recommender!");
        System.out.println("Choose a few movies from our list and rate them between 1-5 (1: least liked, 3: neutral, 5: most liked)");
        System.out.println("Type 'add' in order to rate a movie and enter the number of the movie first and then enter your rate for the movie");
        System.out.println("Type 'rec' to recieve your movie recommendations");
        System.out.println("Type 'e' to exit movie recommender");
        
        for (int i =0; i<movies.length; i++) {
            System.out.println(i+1 + "- " + movies[i].movieName + "(" + movies[i].movieYear + ")");
        }
        
        
        do {
            String input = stdin.nextLine();
            switch(input) {
                case "add":
                    int movieNum = stdin.nextInt() - 1, rate = stdin.nextInt();
                    movies = evaluate.rater(movies, movieNum, rate);
                    break;
                case "rec":
                    evaluate.recommender(movies);
                    break;
                case "e":
                    exit = true;
                    break;
                default:
                    System.out.print("");
            }
        } while (!exit);
       
       
    }
}
