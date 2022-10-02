public class distribution extends movie{
    /*
        will store the dstribution infos of the movies
     */

   
     

     String producers;



    public distribution() { 
        
    }
    

    public void setProducers(String catgrs) {
        producers = catgrs; 
    }


   

    public String getProducers() {
        /*
         * this part either be a straight string that writes "Action/Drama..." or just list the movies like a table
         */
        return producers;
    }
}
