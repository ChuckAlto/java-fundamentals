package inheritance.business;

import java.util.ArrayList;

public class Theater extends Business{

    ArrayList<String> movieList = new ArrayList<>();

    public Theater(String name) {
        super.name = name;
    }

    public void addMovie(String movieName){
        movieList.add(movieName);
    }

    public void removeMovie(String movieName){
        movieList.remove(movieName);
    }

    public ArrayList<String> getMovieList() {
        return movieList;
    }

    @Override
    public String toString() {
        return name;
    }
}
