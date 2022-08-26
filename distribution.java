public class distribution extends movie{
    /*
        will store the dstribution infos of the movies
     */

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
