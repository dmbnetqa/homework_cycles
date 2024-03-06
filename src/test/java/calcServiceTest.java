import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.homework_cycles.services.calcService;

public class calcServiceTest {

@Test
    public void monthsVacation() {

        calcService service = new calcService();

        int expected = 3;
   // int income = 10_000;
   // int expenses= 3_000;
  //  int threshold = 20_000;
    int actual = service.Calculate(10_000, 3_000, 20_000);

    Assertions.assertEquals(expected, actual);

    }
}