package com.example.algorithmpractice.hot100.cursor;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class WebsiteInfo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String urlString = scanner.nextLine();
        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            System.out.println("Content Type: " + conn.getContentType());
            System.out.println("Content Length: " + conn.getContentLength());
            System.out.println("Last Modified: " + new java.util.Date(conn.getLastModified()));
        } catch (MalformedURLException e) {
            System.err.println(urlString + " is not a valid URL");
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}

