package com.example.algorithmpractice.hot100.cursor;

import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a URL: ");
        String url = reader.readLine();
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            if (inputLine.contains("<title>")) {
                System.out.println(inputLine.substring(inputLine.indexOf("<title>") + 7, inputLine.indexOf("</title>")));
                break;
            }
        }
        in.close();
    }
}