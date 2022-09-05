public class distribution extends movie{
    /*
        will store the dstribution infos of the movies
     */

   
     // warner bros, disney, paramount, 20th century studios, Universal, Lionsgate, Columbia Pictures, DreamWorks Pictures, New Line Cinema; Walt Disney Pictures, 
     // Walt Disney Studios, LucasFilm, Sony Pictures, Legendary Entertainment, Marvel Studios, Pixar,Lionsgate

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
