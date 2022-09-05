

public class movie extends evaluator {
    //siksok push muhs deniyoz, selamlar
    String movieName;
    int movieYear;
    
    public movie() { 
    }


    categories categories = new categories();
    distribution distribution = new distribution();
    public movie(String Name , int Year, int [] categoriesInp , int [] producersInp){
        movieName = Name;
        movieYear = Year;
        categories.setCategories(categoriesInp);
        distribution.setProducers(producersInp);
    }



    

    
}
