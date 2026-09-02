package app;

import app.APIReader.APIReader;
import app.DTO.MovieDTO;

public class Main {

    public static void main(String[] args) {

        APIReader apiReader = new APIReader();
        MovieDTO overviewDTO = apiReader.getWithJsonGeneric("tt0164756", MovieDTO.class);
        System.out.println(overviewDTO);

    }

}
