package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        Human human = new Human("Alina", "Kalarash");

        ObjectMapper om = new ObjectMapper();

        System.out.println(om.writeValueAsString(human));
    }
}