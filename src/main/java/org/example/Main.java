package org.example;

import logging.Log;
import utils.JsonFileReader;

public class Main {
    public static void main(String[] args) {
        JsonFileReader jsonFileReader = new JsonFileReader("src/main/resources/config.json");
        String a = jsonFileReader.getValue("/url");
        System.out.println(a);
    }
}