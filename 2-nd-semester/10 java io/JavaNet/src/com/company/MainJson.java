package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainJson {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.coindesk.com/v1/bpi/currentprice.json");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder resultLine = new StringBuilder();
        String line;
        while((line = br.readLine()) != null) {
            resultLine.append(line);
        }
        BitcoinPriceParser.getUSDPriceFromText(resultLine.toString());
    }
}
