package com.company;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainJson {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.coindesk.com/v1/bpi/currentprice.json");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        FileOutputStream fos = new FileOutputStream("output.txt");
        InputStream is = conn.getInputStream();
        fos.write(is.readAllBytes());
    }
}
