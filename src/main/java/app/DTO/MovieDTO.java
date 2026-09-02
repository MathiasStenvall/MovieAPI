package app.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDTO {

    @JsonProperty("movie_results")
    private List<MovieDTOInfo> info;

    @Getter
    @Setter
    @NoArgsConstructor
    @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MovieDTOInfo {

        @JsonProperty("title")
        private String name;

        @JsonProperty("overview")
        private String overview;

        @JsonProperty("release_date")
        private LocalDate releaseDate;

        @JsonProperty("adult")
        private boolean isAdult;

        @JsonProperty("vote_average")
        private double voteAverage;

        public int getReleaseYear(){
            return releaseDate.getYear();
        }
    }


}


