public class evaluator {
    /*
        this class will create an object array of the class movies and store the list of movies
        this class will store the liked movies
        this class will have methods for evaluating the person's interests and give numeric values for them, using these interest values to find the top 3 matches etc.
        (if we can) there will be a method to find patterns such as having a strong preference over an actor or an era, which'd (hopefully) determine favorites and help the recommendation process 

     */

    movie [] movies = new movie[50];
    

    for (int i=0; i<50; i++) {
        movie temp = new movie();
        temp.emptyMovie();
        movies[i] = temp;
    }
     // action, crime, thriller, drama, comedy, mystery, fantasy, horror, romance, animation, musical, scifi, family
    int [] categoriesTemp = new int[] {0,1,1,0,1,1,0,0,0,0,0,0,0};
    
    movies[0].fillMovie("American Psycho", 2000, categoriesTemp, "Columbia Pictures");

    // Columbia, Paramount, 20th Century, Warner Bros. Walt Disney, Sony, MGM, Universal, Neon, Lionsgate, Marvel Studios, Dreamworks, Open Road, Orion, Focus, Miramax




}

