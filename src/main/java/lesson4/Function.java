package lesson4;

public class Function {
    public static double CalculateArea(int a, int b, int c){
        int p = (a + b + c) / 2;
        int square = (p * (p - a) * (p - b) * (p - c));
        return Math.sqrt(square);
    }
}
