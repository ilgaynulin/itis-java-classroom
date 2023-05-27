import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class AgeApi {
    public String ENDPOINT = "https://api.agify.io/?name=";

    public String get(String name) throws IOException {
        URL url = new URL(ENDPOINT + name);
        HttpURLConnection comn = (HttpURLConnection) url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(comn.getInputStream()));
        StringBuilder resultLine = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            resultLine.append(line);
        }
        return resultLine.toString();
    }
}
