public class user {
String[] likedCatagories, dislikedCatagories;
int  Action_R, Sci_Fi_R, Drama_R, Horor_R, Comedy_R = 0 ;
/*
 * We could seperate the liked/disliked movies with the user profile, we could use the liked movies and itterate it with every itteration we could 
 * get the users point profile for example [Action(5)/Comedy(3)...] and thus we could understand what user likes (I tried some shit about this)
 */

    public user (){    
        setMovies();
    }

    private void setMovies() {
        /*
         * this will set the liked/Disliked and create a profile for later use in evaluator
         */
    }

    private void setProfile(){
        String[] Liked = getLikedMovies();
        String[] Disliked = getDisikedMovies();

        for(int x = 0 ; x <= 10 ; x++ ) {// not sure how we transfer movies obj-arr to liked string arr and proceed this action but made it just to specify the methods we can use
            if(Liked[x] == "Action"){
                Action_R++;
            }
            if(Liked[x] == "Sci_Fi"){
                Sci_Fi_R++;
            }
            if(Liked[x] == "Drama"){
                Drama_R++;
            }
            if(Liked[x] == "Horor"){
                Horor_R++;
            }
            if(Liked[x] == "Comedy"){
                Comedy_R++;
            }
        } 
    }

    private String[] getLikedMovies(){
        return likedCatagories ;
    }
    private String[] getDisikedMovies(){
        return dislikedCatagories ;
    }

    

    
}
