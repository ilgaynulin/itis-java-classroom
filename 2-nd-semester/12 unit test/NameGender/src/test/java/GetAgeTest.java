import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GetAgeTest {
    GetAge getAge;
    @Spy
    AgeApi ageApi;

    @Before
    public void init() {
        getAge = new GetAge(ageApi);
    }

    @Test
    public void test_whenAndreyGoToApi_thenMaleResult() {
        String name = "Andrey";
        String expectedGender = "male";
        // Обучение мок обхекта
        try {
            Mockito.when(ageApi.get("Andrey")).thenReturn("{\"age\":44,\"count\":13717,\"name\":\"Andrey\"}");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            getAge.getAge("Andrey");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test_whenArgIsNull_thenApiInvokeZeroTimes() throws IOException {
        getAge.getAge(null);
        verify(ageApi,times(0)).get(any()); // any() - любой аргумент, times(0) - вызовется 0 раз
    }

}