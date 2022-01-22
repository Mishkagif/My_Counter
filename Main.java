public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        //Первый способ анонимный класс, метод принимает 2 аргумента - первый counter, потом через запятую указываем число месяцев.
        director.force(new Counter() {
            @Override
            public String report(int countOfMonths) {
                return "Отчет за " + countOfMonths + " месяцев";
            }
        }, 12);

        //Второй способ
        MyCounter counter = new MyCounter();
        director.force(counter, 12);
    }
}
