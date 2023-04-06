public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kilograms = 98;
        float meters = 1.87f;
        int index = service.calculate(kilograms, meters);
        System.out.println(index);
    }
}