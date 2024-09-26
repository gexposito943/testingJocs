package com.Videogames;
import com.Videogames.Videogame;

import com.users.User;

public class Review {
    private User user;
    private Videogame videogame;
    private String comment;
    private int rating;

    public Review(User user, Videogame videogame, String comment, int rating) {
        this.user = user;
        this.videogame = videogame;
        this.comment = comment;
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public int getRating() {
        return rating;
    }

    public User getUser() {
        return user;
    }

    public Videogame getVideogame() {
        return videogame;
    }
}
