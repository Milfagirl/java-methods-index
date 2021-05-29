import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int weight = 100;
        int height = 170;
        int bmi = bmiService.calculate(weight, height);
        String result;
        if (bmi <= 16) {
            result = "Выраженный дефицит массы";
        } else if (bmi <= 18) {
            result = "Недостаточная (дефицит) масса тела";
        } else if (bmi <= 25) {
            result = "Норма";
        } else if (bmi <= 30) {
            result = "Избыточная масса тела (предожирение)";
        } else if (bmi <= 35) {
            result = "Ожирение первой степени";
        } else if (bmi <= 40) {
            result = "Ожирение второй степени";
        } else result = "Ожирение третьей степени (морбидное)";
        System.out.println("Индекс массы тела: " + bmi + " " + result);
    }
}
