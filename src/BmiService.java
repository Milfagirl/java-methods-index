public class BmiService {
    public int calculate(int weight, int height) {
        return (weight * 10000) / (height * height);
    }
}
