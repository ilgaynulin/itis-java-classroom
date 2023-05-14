package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DeterminateGenderExt extends DeterminateGender {

    DeterminateGenderExt(){
        urlAddress = "https://api.genderize.io";
    }
    @Override
    public String nameToGender(String inputName) throws IOException {
        URL url = new URL(urlAddress + "/?name=" + inputName);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder intermediateLine = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine())!=null){
            intermediateLine.append(line);
        }
        return parser(intermediateLine.toString());
    }

    // Извините, регулярки еще не выучил :(
    private String parser(String stringForParsing){
        String[] features = stringForParsing.split("\"");
        for (int i = 0; i < features.length; i++) {
            if (features[i].equals("gender")){
                return features[i+2];
            }
        }
        return null;
    }
}
