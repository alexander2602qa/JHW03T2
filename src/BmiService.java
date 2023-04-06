public class BmiService {

    public int calculate(int kilograms, float meters) {
        float index = kilograms / (meters * meters);
        return (int) index;
    }

}
