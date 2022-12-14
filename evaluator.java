public class evaluator {
    
    /*
        this class will create an object array of the class movies and store the list of movies // mostly done
        this class will store the liked movies 
        this class will have methods for evaluating the person's interests and give numeric values for them, using these interest values to find the top 3 matches etc.
        (if we can) there will be a method to find patterns such as having a strong preference over an actor or an era, which'd (hopefully) determine favorites and help the recommendation process 

     */
    public void recommender(movie [] movies) {
        double [] profiledCategories = profiling(movies);
        int [] [] movieMatchList = new int [50] [3];
        for (int i = 0; i<50; i++) {
            Integer rating = movies[i].getRating();
            movieMatchList[i] [1] = 5;
            if (rating != 3) {
                movieMatchList[i] [0] = i;
                movieMatchList[i] [1] = 0;
                
            } else {

                movieMatchList[i] [0] = i;
                movieMatchList[i] [1] = matchPercentCalculator(movies, i, profiledCategories);
            } 
        }
        movieMatchList = sorter(movieMatchList);
        System.out.println("Top 3 matches are:");
        System.out.println("1- " + movies[movieMatchList[0][0]].movieName + " " +(movieMatchList[0][1]) + "%");
        System.out.println("2- " + movies[movieMatchList[1][0]].movieName + " " +(movieMatchList[1][1]) + "%");
        System.out.println("3- " + movies[movieMatchList[2][0]].movieName + " " +(movieMatchList[2][1]) + "%");
    }

    public int [] [] sorter (int [] [] movieMatchList) {
        boolean wasntSorted = true;
        do {
            wasntSorted = true;
            for (int i = 0; i<49; i++) {
                if (movieMatchList [i][1]< movieMatchList [i+1][1]) {
                    int tempPoint = movieMatchList [i][1], tempNumber = movieMatchList [i][0];
                    movieMatchList [i][1] = movieMatchList [i+1][1];
                    movieMatchList [i+1][1] = tempPoint;
                    movieMatchList [i][0] = movieMatchList [i+1][0];
                    movieMatchList [i+1][0] = tempNumber;
                    wasntSorted = false;
                }
            }
        } while (!wasntSorted);
        return movieMatchList;
    }

    public int matchPercentCalculator (movie [] movies, int movieNum, double [] profiledCategories) {
        int [] categories = movies [movieNum].getCategories();
        int points = 0;
        for (int i = 0; i<14; i++) {
            Integer category = categories[i];
            if(profiledCategories[i]<1.5) {
                if(category.equals(0)) {
                    points += 7;
                } else {
                    points += 0;
                }
            } else if (profiledCategories[i] <= 1.5 && profiledCategories[i] < 2.5) {
                if (category.equals(0)) {
                    points += 6;
                } else {
                    points += 1;
                }
            } else if (profiledCategories[i] <= 2.5 && profiledCategories[i] < 3.5) {
                points +=3;
            } else if (profiledCategories[i] <= 3.5 && profiledCategories[i] < 4.5) {
                if(category.equals(0)){
                    points += 1;
                } else {
                    points += 6;
                }
            } else {
                if(category.equals(0)) {
                    points += 0;
                } else {
                    points += 7;
                }
            }
        }
        movies[movieNum].setMatchPercentage(points);
        return (points+2);
    }
   
    public double [] profiling(movie [] movies) { 
        double [] profiledCategories = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i<50; i++) {
            Integer rating = movies[i].getRating();
            if (!rating.equals(3)) {
                int [] categories = movies[i].getCategories();
                for (int j = 0; j<14; j++) {
                    Integer category = categories[j] ;
                    Double profiledCategory = profiledCategories[j];
                    if (!(category.equals(0))) {
                        if (profiledCategory.equals(0.0)) {
                            profiledCategories[j] = (profiledCategories[j] + (rating*category));
                        }else{
                        profiledCategories[j] = (profiledCategories[j] + (rating*category))/2;
                        }
                    }
                }
            }            
        }
        return profiledCategories;
    }

    public movie [] rater(movie [] movies, int movieNum, int rate) { 
        movies[movieNum].setRating(rate);
        return movies;
    }

    public movie [] initializeMovies() {
        movie [] movies;
        movies = new movie[50]; 
    
    
        for (int i=0; i<50; i++) {
            movie temp = new movie();
            temp.emptyMovie();
            movies[i] = temp;
        }
        // Columbia, Paramount, 20th Century, Warner Bros. Walt Disney, Sony, MGM, Universal, Neon, Lionsgate, Marvel Studios, Dreamworks, Open Road, Orion, Focus, Mirama
        
        int [] categoriesTemp;
        // action, crime, thriller, drama, comedy, mystery, fantasy, horror, romance, animation, musical, scifi, family, adventure
        categoriesTemp = new int [] {0,1,1,0,1,1,0,0,0,0,0,0,0,0}; //ilk film i??in bunu
        movies[0].fillMovie("American Psycho", 2000, categoriesTemp, "Columbia Pictures");

        categoriesTemp = new int [] {0,0,0,1,1,0,0,0,0,0,0,0,0,0}; //ikinci film i??in bunu
        movies[1].fillMovie("The Wolf of the Wallstreet", 2013, categoriesTemp, "Paramount Pictures");

        categoriesTemp = new int [] {0,0,1,1,0,1,0,0,0,0,0,0,0,0};
        movies[2].fillMovie("Fight Club", 2003, categoriesTemp, "20th Century Fox");
        
        categoriesTemp = new int [] {0,1,0,1,0,0,0,0,0,0,0,0,0,0};
        movies[3].fillMovie("The Godfather", 1972, categoriesTemp, "Paramount Pictures");
        
        categoriesTemp = new int [] {0,1,0,1,0,0,0,0,0,0,0,0,0,0};
        movies[4].fillMovie("Joker", 2019, categoriesTemp, "Warner Bros.");
        
        categoriesTemp = new int [] {1,1,0,1,0,0,0,0,0,0,0,0,0,1};
        movies[5].fillMovie("The Batman", 2022, categoriesTemp, "Warner Bros.");
        
        categoriesTemp = new int [] {0,0,0,0,1,0,0,0,0,1,0,0,1,1};
        movies[6].fillMovie("Cars", 2006, categoriesTemp, "Walt Disney Pictures");
        
        categoriesTemp = new int [] {0,0,0,0,1,0,0,0,0,1,1,0,1,1};
        movies[7].fillMovie("Frozen", 2013, categoriesTemp, "Walt Disney Pictures");
        
        categoriesTemp = new int [] {0,0,0,0,1,0,0,0,0,0,0,0,1,1};
        movies[8].fillMovie("Space Jam", 2003, categoriesTemp, "Warner Bros.");
        
        categoriesTemp = new int [] {0,0,1,0,0,1,0,1,0,0,0,0,1,0};
        movies[9].fillMovie("It", 2017, categoriesTemp, "Warner Bros.");
        
        categoriesTemp = new int [] {0,0,1,1,0,1,0,0,0,0,0,1,0,0};
        movies[10].fillMovie("Gravity", 2013, categoriesTemp, "Warner Bros.");
        
        categoriesTemp = new int [] {0,0,0,0,1,0,0,0,0,1,0,0,1,1};
        movies[11].fillMovie("Monsters Inc.", 2001, categoriesTemp, "Walt Disney Pictures");
        
        categoriesTemp = new int [] {0,0,0,0,1,0,0,0,0,1,0,0,1,0};
        movies[12].fillMovie("Ratatouille", 2007, categoriesTemp, "Walt Disney Pictures");
        
        categoriesTemp = new int [] {0,0,0,1,0,0,0,0,0,0,0,0,0,0};
        movies[13].fillMovie("The Social Network", 2010, categoriesTemp, "Sony Pictures");
        
        categoriesTemp = new int [] {0,0,0,1,0,0,0,0,0,0,0,0,0,0};
        movies[14].fillMovie("12 Angry Men", 1957, categoriesTemp, "MGM");
        
        categoriesTemp = new int [] {1,0,1,0,0,1,0,0,0,0,0,1,0,0};
        movies[15].fillMovie("The Terminator", 1984, categoriesTemp, "MGM");
        
        categoriesTemp = new int [] {0,0,0,0,1,0,0,0,0,1,0,0,1,1};
        movies[16].fillMovie("Toy Story", 1995, categoriesTemp, "Walt Disney Pictures");
        
        categoriesTemp = new int [] {0,0,0,0,0,0,1,0,0,0,0,1,1,1};
        movies[17].fillMovie("E.T.", 1982, categoriesTemp, "Universal Picture");
        
        categoriesTemp = new int [] {0,0,0,0,1,0,0,0,0,1,0,0,1,1};
        movies[18].fillMovie("Finding Nemo", 2003, categoriesTemp, "Walt Disney Pictures");
        
        categoriesTemp = new int [] {0,0,1,1,1,1,0,0,0,0,0,0,0,0};
        movies[19].fillMovie("Parasite", 2019, categoriesTemp, "Neon");
        
        categoriesTemp = new int [] {0,0,0,0,0,0,0,1,0,0,0,1,0,0};
        movies[20].fillMovie("Alien", 1979, categoriesTemp, "20th Century Fox");
        
        categoriesTemp = new int [] {0,0,0,0,0,0,1,0,0,0,1,0,1,0};
        movies[21].fillMovie("The Wizard Of Oz", 1939, categoriesTemp, "MGM");
        
        categoriesTemp = new int [] {0,0,0,0,1,0,1,0,0,0,0,1,0,1};
        movies[22].fillMovie("Back To The Future", 1985, categoriesTemp, "Universal Studios");
        
        categoriesTemp = new int [] {0,0,1,1,0,1,0,0,0,0,0,0,0,1};
        movies[23].fillMovie("Jaws", 1975, categoriesTemp, "Universal Studios");
        
        categoriesTemp = new int [] {0,1,1,1,1,1,0,0,0,0,0,0,0,0};
        movies[24].fillMovie("Knives Out", 2019, categoriesTemp, "Lionsgate");
        
        categoriesTemp = new int [] {0,0,0,0,1,0,1,0,0,0,0,0,1,0};
        movies[25].fillMovie("Charlie and the Chocolate Factory", 2005, categoriesTemp, "Warner Bros.");
        
        categoriesTemp = new int [] {1,0,0,0,0,0,1,0,0,0,0,0,0,1};
        movies[26].fillMovie("Black Panther ", 2018, categoriesTemp, "Marvel Studios");
        
        categoriesTemp = new int [] {0,1,0,1,1,0,0,0,0,0,0,0,0,0};
        movies[27].fillMovie("Catch Me If You Can", 2002, categoriesTemp, "DreamWorks");
        
        categoriesTemp = new int [] {0,1,1,1,0,1,0,0,0,0,0,0,0,0};
        movies[28].fillMovie("Night Crawler", 2014, categoriesTemp, "Open Road");
        
        categoriesTemp = new int [] {1,0,0,0,0,0,1,0,0,0,0,1,0,1};
        movies[29].fillMovie("Superman: The Movie", 1978, categoriesTemp, "Warner Bros.");
        
        categoriesTemp = new int [] {0,1,1,1,0,1,0,0,0,0,0,0,0,0};
        movies[30].fillMovie("The Silence of the Lambs", 1991, categoriesTemp, "Orion Pictures");
        
        categoriesTemp = new int [] {0,0,0,1,1,0,0,0,0,0,0,0,0,0};
        movies[31].fillMovie("The Truman Show", 1998, categoriesTemp, "Paramount Pictures");
        
        categoriesTemp = new int [] {0,0,0,0,1,0,0,0,0,0,0,1,1,1};
        movies[32].fillMovie("Wall-E", 2008, categoriesTemp, "Walt Disney Pictures");
        
        categoriesTemp = new int [] {0,0,0,1,1,0,0,0,1,0,0,0,0,0};
        movies[33].fillMovie("Her", 2014, categoriesTemp, "Warner Bros.");
        
        categoriesTemp = new int [] {1,0,0,0,0,0,1,0,0,0,0,0,0,1};
        movies[34].fillMovie("Iron Man ", 2008, categoriesTemp, "Marvel Studios");
        
        categoriesTemp = new int [] {1,0,0,0,0,0,1,0,0,0,0,0,0,1};
        movies[35].fillMovie("Logan", 2017, categoriesTemp, "20th Century Fox");
        
        categoriesTemp = new int [] {1,0,1,0,0,1,0,0,0,0,0,0,0,1};
        movies[36].fillMovie("Mission: Impossible Rogue Nation", 2015, categoriesTemp, "Paramount Pictures");
        
        categoriesTemp = new int [] {1,0,0,0,0,0,1,0,0,0,0,1,0,1};
        movies[37].fillMovie("Star Trek", 2009, categoriesTemp, "Paramount Pictures");
        
        categoriesTemp = new int [] {1,0,0,0,0,0,1,0,0,0,0,1,0,1};
        movies[38].fillMovie("Star Wars: The Empire Strikes Back", 1980, categoriesTemp, "20th Century Fox");
        
        categoriesTemp = new int [] {1,0,0,0,0,0,1,0,0,0,0,0,0,1};
        movies[39].fillMovie("The Dark Knight", 2008, categoriesTemp, "Warner Bros.");
        
        categoriesTemp = new int [] {1,0,1,0,0,1,0,1,0,0,0,1,0,1};
        movies[40].fillMovie("The War For the Planet of the Apes", 2017, categoriesTemp, "20th Century Fox");
        
        categoriesTemp = new int [] {0,0,0,1,0,0,1,0,0,0,0,0,0,1};
        movies[41].fillMovie("Hugo", 2011, categoriesTemp, "Paramount Pictures");
        
        categoriesTemp = new int [] {0,0,1,0,0,1,0,1,0,0,0,0,0,0};
        movies[42].fillMovie("Us", 2019, categoriesTemp, "Universal Pictures");
        
        categoriesTemp = new int [] {1,0,1,0,0,1,0,0,0,0,0,0,0,0};
        movies[43].fillMovie("Baby Driver", 2017, categoriesTemp, "Sony Pictures");
        
        categoriesTemp = new int [] {0,0,0,0,0,0,0,0,1,0,0,1,0,0};
        movies[44].fillMovie("Eternal Sunshine of the Spotless Mind", 2004, categoriesTemp, "Focus Features");
        
        categoriesTemp = new int [] {1,0,1,0,0,1,0,0,0,0,0,0,0,1};
        movies[45].fillMovie("Jurassic Park", 1993, categoriesTemp, "Universal Pictures");
        
        categoriesTemp = new int [] {1,0,0,0,1,0,0,0,0,0,0,1,0,0};
        movies[46].fillMovie("Men In Black", 1997, categoriesTemp, "Columbia Pictures");
        
        categoriesTemp = new int [] {0,1,0,1,0,0,0,0,0,0,0,0,0,0};
        movies[47].fillMovie("Pulp Fiction", 1994, categoriesTemp, "Miramax Films");
        
        categoriesTemp = new int [] {0,0,0,1,1,0,0,0,1,0,1,0,0,0};
        movies[48].fillMovie("La La Land ", 2016, categoriesTemp, "Lionsgate");
        
        categoriesTemp = new int [] {0,0,0,0,0,0,1,0,0,0,0,0,0,1};
        movies[49].fillMovie("The Lord of the Rings: The Fellowship of the Ring", 2001, categoriesTemp, "Warner Bros.");    


        return movies;
    }

}