public class MyCounter implements Counter {
    @Override
    public String report(int countOfMonths) {
        return "Отчет за " + countOfMonths + " месяцев";
    }
}
