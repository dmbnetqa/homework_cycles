import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.homework_cycles.services.calcService;

public class calcServiceTest {

@ParameterizedTest
@CsvFileSource(files = "src/test/resources/data.csv")
    public void monthsVacation(int expected, int income, int expenses,int threshold) {

        calcService service = new calcService();

    //    int expected = 3;
   // int income = 10_000;
   // int expenses= 3_000;
  //  int threshold = 20_000;
    int actual = service.Calculate(income, expenses, threshold);

    Assertions.assertEquals(expected, actual);

    }
}