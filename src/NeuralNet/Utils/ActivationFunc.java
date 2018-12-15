package NeuralNet.Utils;

public class ActivationFunc {

    static public double sigmoid(double x) {
        return 1/(1 + Math.exp(-x));
    }

    static public double hyperbolicTangent(double x) {
        return (1 - Math.exp(-x))/(1 + Math.exp(-x));
    }

    static public int hardLimitingThreshold(double x) {
        return x >= 0 ? 1 : 0;
    }

    static public double linear(double x) {
        return x;
    }

    static public double rectifiedLinear(double x) {
        return x > 0 ? x : 0;
    }
}
