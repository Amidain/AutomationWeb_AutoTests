package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonFileReader {
    private String filePath;

    public JsonFileReader(String filePath) {
        this.filePath = filePath;
    }

    public String getValue(String element){
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(filePath));
            return jsonNode.findValue(element).asText();
            //return objectMapper.readValue(new File(filePath), String.class);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println(String.format("File with with given path: '%s', does not exists!", filePath));
        }
        return null;
    }
}
