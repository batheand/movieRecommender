

public class categories extends movie{
    
    // action, crime, thriller, drama, comedy, mystery, fantasy, horror, romance, western, animation, musical, scifi
    int[] categories = new int [13];

    public categories() { 
        
    }
    

    public void setCategories(int[] catgrs) {
        categories = catgrs; 
    }


   

    public int[] getCategories() {
        /*
         * this part either be a straight string that writes "Action/Drama..." or just list the movies like a table
         */
        return categories;
    }
}
