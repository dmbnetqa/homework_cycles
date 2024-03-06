import ru.netology.homework_cycles.services.calcService;

public class Main {
    public static void main(String[] args) {
        calcService service = new calcService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        service.Calculate(income, expenses, threshold);
    }
}