package com.example.algorithmpractice.hot100.cursor;

import java.net.*;
import java.io.*;

public class WebsiteInfo {
    public static void main(String[] args) {
        try {
            URL url = new URL(args[0]);
            URLConnection conn = url.openConnection();
            System.out.println("Content Type: " + conn.getContentType());
            System.out.println("Content Length: " + conn.getContentLength());
            System.out.println("Last Modified: " + new java.util.Date(conn.getLastModified()));
        } catch (MalformedURLException e) {
            System.err.println(args[0] + " is not a valid URL");
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
