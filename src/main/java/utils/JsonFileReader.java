package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import logging.Log;

import java.io.File;
import java.io.IOException;

public class JsonFileReader {
    private String filePath;
    private final ObjectMapper objectMapper = new ObjectMapper();
    public JsonFileReader(String filePath) {
        this.filePath = filePath;
    }

    public String getValue(String jsonPath){
        try{
            JsonNode jsonNode = objectMapper.readTree(new File(filePath));
            return jsonNode.at(jsonPath).asText();
        } catch (IOException e){
            e.printStackTrace();
            Log.error(String.format("File with with given path: '%s', does not exists!", filePath));
        }
        return null;
    }

    public <T> T mapToClass(Class<T> clazz){
        try{
            return objectMapper.readerFor(clazz).readValue(new File(filePath));
        } catch (IOException e){
            e.printStackTrace();
            Log.error(String.format("File with with given path: '%s', does not exists!", filePath));
        }
        return null;
    }
}
