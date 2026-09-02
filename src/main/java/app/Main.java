package app;

import app.APIReader.APIReader;
import app.DTO.MovieDTO;

public class Main {

    public static void main(String[] args) {

        APIReader apiReader = new APIReader();
        MovieDTO mifune = apiReader.getWithJsonGeneric("tt0164756", MovieDTO.class);
        System.out.println(mifune);
        System.out.println(mifune.getInfo().get(0).getReleaseYear());

    }

}
