public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();
        int month = service.calculate(10000, 3000, 20000);
        System.out.println(month);
    }
}
