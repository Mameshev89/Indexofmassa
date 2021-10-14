public class Main {
    public static void main(String[] args) {
        Bmiservice run = new Bmiservice();
        float index = run.calculate(78, 1.73f);
        System.out.println(index);
    }
}
