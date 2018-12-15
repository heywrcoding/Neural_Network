import NeuralNet.NeuralNet;
import NeuralNet.NeuralNet.*;

public class TestNet {
    public static void main(String[] args) {

        NeuralNet testNet = new NeuralNet(0,0,0,0);

        testNet.setTrainSet(new double[][] { { 1.0, 0.0, 0.0 },
                { 1.0, 0.0, 1.0 }, { 1.0, 1.0, 0.0 }, { 1.0, 1.0, 1.0 } });

        testNet.setRealOutputSet(new double[] { 0.0, 0.0, 0.0, 1.0 });

        testNet.setTrainSet(new double[][] { { 1.0, 0.98, 0.94, 0.95 },
                { 1.0, 0.60, 0.60, 0.85 }, { 1.0, 0.35, 0.15, 0.15 },
                { 1.0, 0.25, 0.30, 0.98 }, { 1.0, 0.75, 0.85, 0.91 },
                { 1.0, 0.43, 0.57, 0.87 }, { 1.0, 0.05, 0.06, 0.01 } });

        testNet.setRealOutputSet(new double[] { 0.80, 0.59, 0.23, 0.45,
                0.74, 0.63, 0.10 });

    }
}
