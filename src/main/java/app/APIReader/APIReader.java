package app.APIReader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class APIReader {

    private static final String TMDB = "https://api.themoviedb.org/3/find/";

    private static final String apiKey = "?external_source=imdb_id&language=en-US&api_key=" + System.getenv("api_key");
    private final ObjectMapper objectMapper = new ObjectMapper();

    public <T> T getWithJsonGeneric (String movie, Class<T> tClass){
        try {
            JsonNode node = objectMapper.readTree(new URI(TMDB+movie+apiKey).toURL());
            return objectMapper.treeToValue(node, tClass);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
