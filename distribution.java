public class distribution extends movie{
    /*
        will store the dstribution infos of the movies
     */

   
     // warner bros, disney, paramount, 20th century studios, Universal, Lionsgate, Columbia Pictures, DreamWorks Pictures, New Line Cinema; Walt Disney Pictures, 
     // Walt Disney Studios, LucasFilm, Sony Pictures, Legendary Entertainment, Marvel Studios, Pixar,Lionsgate

    boolean[] producers = new boolean[16];

    public distribution(String Name, String movieCat, int Year) {
        super(Name, movieCat, Year);
        //TODO Auto-generated constructor stub
    }

    int[] distributors = new int [3];

    public void setDistributors() {
        /*
         * opened for constructing with user input
         */


    }

    public void setDistributors(int [] catg) {
        distributors = catg;
    }

    public int[] getDistributors() {
        return distributors;
    }
}
