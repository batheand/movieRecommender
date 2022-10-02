public class evaluator {
    /*
        this class will create an object array of the class movies and store the list of movies // mostly done
        this class will store the liked movies 
        this class will have methods for evaluating the person's interests and give numeric values for them, using these interest values to find the top 3 matches etc.
        (if we can) there will be a method to find patterns such as having a strong preference over an actor or an era, which'd (hopefully) determine favorites and help the recommendation process 

     */

    public void profiling() {
        
    }

    public void initializeMovies() {
        movie [] movies;
        movies = new movie[50]; 
    
    
        for (int i=0; i<50; i++) {
            movie temp = new movie();
            temp.emptyMovie();
            movies[i] = temp;
        }
        // Columbia, Paramount, 20th Century, Warner Bros. Walt Disney, Sony, MGM, Universal, Neon, Lionsgate, Marvel Studios, Dreamworks, Open Road, Orion, Focus, Mirama
        
        int [] categoriesTemp;
        // action, crime, thriller, drama, comedy, mystery, fantasy, horror, romance, animation, musical, scifi, family
        categoriesTemp = new int [] {0,1,1,0,1,1,0,0,0,0,0,0,0}; //ilk film için bunu
        movies[0].fillMovie("American Psycho", 2000, categoriesTemp, "Columbia Pictures");
        categoriesTemp = new int [] {0,1,1,0,1,1,0,0,0,0,0,0,0}; //ikinci film için bunu
        movies[1].fillMovie("The Wolf of the Wallstreet", 2013, categoriesTemp, "Paramount Pictures");
        //3. için buraya
        movies[2].fillMovie("Fight Club", 2003, categoriesTemp, "20th Century Fox");
        //4. için buraya and so on..
        movies[3].fillMovie("The Godfather", 1972, categoriesTemp, "20th Century Fox");
        movies[4].fillMovie("Joker", 2019, categoriesTemp, "20th Century Fox");
        movies[5].fillMovie("The Batman", 2022, categoriesTemp, "20th Century Fox");
        movies[6].fillMovie("Cars", 2006, categoriesTemp, "20th Century Fox");
        movies[7].fillMovie("Frozen", 2013, categoriesTemp, "20th Century Fox");
        movies[8].fillMovie("Space Jam", 2003, categoriesTemp, "20th Century Fox");
        movies[9].fillMovie("It", 2017, categoriesTemp, "20th Century Fox");
        movies[10].fillMovie("Gravity", 2013, categoriesTemp, "20th Century Fox");
        movies[11].fillMovie("Monsters Inc.", 2001, categoriesTemp, "20th Century Fox");
        movies[12].fillMovie("Ratatouille", 2007, categoriesTemp, "20th Century Fox");
        movies[13].fillMovie("The Social Network", 2010, categoriesTemp, "20th Century Fox");
        movies[14].fillMovie("12 Angry Men", 1957, categoriesTemp, "20th Century Fox");
        movies[15].fillMovie("The Terminator", 1984, categoriesTemp, "20th Century Fox");
        movies[16].fillMovie("Toy Story", 1995, categoriesTemp, "20th Century Fox");
        movies[17].fillMovie("E.T.", 1982, categoriesTemp, "20th Century Fox");
        movies[18].fillMovie("Finding Nemo", 2003, categoriesTemp, "20th Century Fox");
        movies[19].fillMovie("Parasite", 2019, categoriesTemp, "20th Century Fox");
        movies[20].fillMovie("Alien", 1979, categoriesTemp, "20th Century Fox");
        movies[21].fillMovie("The Wizard Of Oz", 1939, categoriesTemp, "20th Century Fox");
        movies[22].fillMovie("Back To The Future", 1985, categoriesTemp, "20th Century Fox");
        movies[23].fillMovie("Jaws", 1975, categoriesTemp, "20th Century Fox");
        movies[24].fillMovie("Knives Out", 2019, categoriesTemp, "20th Century Fox");
        movies[25].fillMovie("Charlie and the Chocolate Factory", 2005, categoriesTemp, "20th Century Fox");
        movies[26].fillMovie("Black Panther ", 2018, categoriesTemp, "20th Century Fox");
        movies[27].fillMovie("Catch Me If You Can", 2002, categoriesTemp, "20th Century Fox");
        movies[28].fillMovie("Night Crawler", 2014, categoriesTemp, "20th Century Fox");
        movies[29].fillMovie("Superman: The Movie", 1978, categoriesTemp, "20th Century Fox");
        movies[30].fillMovie("The Silence of the Lambs", 1991, categoriesTemp, "20th Century Fox");
        movies[31].fillMovie("The Truman Show", 1998, categoriesTemp, "20th Century Fox");
        movies[32].fillMovie("Wall-E", 2008, categoriesTemp, "20th Century Fox");
        movies[33].fillMovie("Her", 2014, categoriesTemp, "20th Century Fox");
        movies[34].fillMovie("Iron Man ", 2008, categoriesTemp, "20th Century Fox");
        movies[35].fillMovie("Logan", 2017, categoriesTemp, "20th Century Fox");
        movies[36].fillMovie("Mission: Impossible Rogue Nation", 2015, categoriesTemp, "20th Century Fox");
        movies[37].fillMovie("Star Trek", 2009, categoriesTemp, "20th Century Fox");
        movies[38].fillMovie("Star Wars: The Empire Strikes Back", 1980, categoriesTemp, "20th Century Fox");
        movies[39].fillMovie("The Dark Knight", 2008, categoriesTemp, "20th Century Fox");
        movies[40].fillMovie("The War For the Planet of the Apes", 2017, categoriesTemp, "20th Century Fox");
        movies[41].fillMovie("Hugo", 2011, categoriesTemp, "20th Century Fox");
        movies[42].fillMovie("Us", 2019, categoriesTemp, "20th Century Fox");
        movies[43].fillMovie("Baby Driver", 2017, categoriesTemp, "20th Century Fox");
        movies[44].fillMovie("ternal Sunshine of the Spotless Mind", 2004, categoriesTemp, "20th Century Fox");
        movies[45].fillMovie("Jurassic Park", 1993, categoriesTemp, "20th Century Fox");
        movies[46].fillMovie("Men In Black", 1997, categoriesTemp, "20th Century Fox");
        movies[47].fillMovie("Pulp Fiction", 1994, categoriesTemp, "20th Century Fox");
        movies[48].fillMovie("La La Land ", 2016, categoriesTemp, "20th Century Fox");
        movies[49].fillMovie("The Lord of the Rings: The Fellowship of the Ring", 2001, categoriesTemp, "20th Century Fox");    
    }

    
    
    
    
    
   
   



   
}