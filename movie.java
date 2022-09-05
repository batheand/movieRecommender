

public class movie extends evaluator {
    //siksok push muhs deniyoz, selamlar
    String movieName;
    int movieYear;
    
    


    categories categories = new categories();
    distribution distribution = new distribution();
    int[] xx = new int [] {1,2,3,4,5,6,7,8,9,0,1,2,3};
    int[] xy = new int [] {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6};


    public void emptyMovie() {
        movieName = "";
        movieYear = 1111;
        categories.setCategories(xx);
        distribution.setProducers(xy);
    }
    public void fillMovie(String Name , int Year, int [] categoriesInp , int [] producersInp){
        movieName = Name;
        movieYear = Year;
        categories.setCategories(categoriesInp);
        distribution.setProducers(producersInp);
    }



    

    
}
