import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetAge {
    AgeApi ageApi;

    public GetAge(AgeApi ageApi) {
        this.ageApi = ageApi;
    }

    public String getAge(String name) throws IOException {
        if(name == null) {
            return null;
        }
        String resultLine = ageApi.get(name);   // зависимость от внешнего функционала
        String regEx = "\"age\":(\\d+)";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(resultLine);

        String founded;
        if (m.find()) {
            founded = resultLine.substring(m.start(), m.end());

            System.out.println("Средний возраст: " + founded.replace("\"age\":", " "));

            return founded;
        } else {
            return null;
        }

    }
}