package core.util.utilities;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class JsonViews {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static JsonNode toJson(Object bean, Class<?> view) {
        TokenBuffer buf = new TokenBuffer(objectMapper, false);
        JsonNode result;
        try {
            objectMapper.writerWithView(view).writeValue(buf, bean);
            JsonParser jp = buf.asParser();
            result = objectMapper.readTree(jp);
            jp.close();
        } catch (IOException e) { // should not occur, no real i/o...
            throw new IllegalArgumentException(e.getMessage(), e);
        }
        return  result;
    }
}
