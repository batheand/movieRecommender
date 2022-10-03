

public class movie extends evaluator {
    
    String movieName;
    int movieYear;
    int rating = 3, matchPercentage;

    String producers;

    int[] categories = new int [13];


    public void setRating(int rate) {
        rating = rate;
    }

    public int getRating() {
        return rating;
    }

    public void setMatchPercentage(int percent) {
        matchPercentage = percent;
    }

    public int getMatchPercentage() {
        return matchPercentage;
    }
    
    public movie () {
        emptyMovie();
    }
    
   
    int[] xx = new int [] {1,2,3,4,5,6,7,8,9,0,1,2,3};
    public int [] getCategories() {
        return categories;
    }


    public void emptyMovie() {
        movieName = "";
        movieYear = 1111;
        categories = xx;
        producers = "";
    }
    public void fillMovie(String Name , int Year, int [] categoriesInp , String producersInp){
        movieName = Name;
        movieYear = Year;
        categories = categoriesInp;
        producers = producersInp;
    }



    

    
}
