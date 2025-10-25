package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> usCities = new ArrayList<>();


        usCities.add("New York");
        usCities.add("Los Angeles");
        usCities.add("Chicago");
        usCities.add("Houston");
        usCities.add("Phoenix");
        usCities.add("Philadelphia");
        usCities.add("San Antonio");
        usCities.add("San Diego");
        usCities.add("Dallas");
        usCities.add("San Jose");

        for (String City: usCities){
            System.out.println(City);
        }
    }
}