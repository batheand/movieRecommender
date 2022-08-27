public class categories extends movie{
    String[] Action, Sci_Fi, Drama, Horor, Comedy; //this should continue 

    public categories(String Name, String movieCat, int Year) {
        super(Name, movieCat, Year);
        
    }

    /*
        will store the categories of movies
     */
    int[] categories = new int [3];

    public void setCategories(String movieCatt) {

        if(super.movieCategorie == "Action"){
            for(int x = 0 ; x <= 10 ; x++ ) {
                Action[x] = super.movieName;   
            }     
        }

        if(super.movieCategorie == "Sci_Fi"){
            for(int x = 0 ; x <= 10 ; x++ ) {
                Sci_Fi[x] = super.movieName;   
            }     
        }

        if(super.movieCategorie == "Drama"){
            for(int x = 0 ; x <= 10 ; x++ ) {
                Drama[x] = super.movieName;   
            }     
        }

        if(super.movieCategorie == "Horor"){
            for(int x = 0 ; x <= 10 ; x++ ) {
                Horor[x] = super.movieName;   
            }     
        }

        if(super.movieCategorie == "Comedy"){
            for(int x = 0 ; x <= 10 ; x++ ) {
                Comedy[x] = super.movieName;   
            }     
        }
    }

    public void setCategories(int [] catg) {
        categories = catg;
    }

    public int[] getCategories() {
        /*
         * this part either be a straight string that writes "Action/Drama..." or just list the movies like a table
         */
        return categories;
    }
}
