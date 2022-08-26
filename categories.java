public class categories extends movie{
    /*
        will store the categories of movies
     */
    int[] categories = new int [3];

    public void setCategories() {
        /*
         * opened for constructing with user input
         */
    }

    public void setCategories(int [] catg) {
        categories = catg;
    }

    public int[] getCategories() {
        return categories;
    }
}
