package org.gitexcercise;

import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private String nickname;
    private int age;
    private int moviesViewed;
    private List<Cinema> viewedMovies = new ArrayList<>();

    public Viewer(String nickname, int age, int moviesViewed) {
        this.nickname = nickname;
        this.age = age;
        this.moviesViewed = moviesViewed;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoviesViewed() {
        return moviesViewed;
    }

    public void setMoviesViewed(int moviesViewed) {
        this.moviesViewed = moviesViewed;
    }
}
