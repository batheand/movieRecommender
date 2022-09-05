public class distribution extends movie{
    /*
        will store the dstribution infos of the movies
     */

   
     

     int[] producers = new int[16];



    public distribution() { 
        
    }
    

    public void setProducers(int[] catgrs) {
        producers = catgrs; 
    }


   

    public int[] getProducers() {
        /*
         * this part either be a straight string that writes "Action/Drama..." or just list the movies like a table
         */
        return producers;
    }
}
