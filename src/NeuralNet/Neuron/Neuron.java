package NeuralNet.Neuron;

import java.util.ArrayList;

public class Neuron {
    private ArrayList<Double> inputWeight;
    private ArrayList<Double> outputWeight;
    private int inputLinkNum;
    private int outputLinkNum;

    Neuron(int inputLinkNum, int outputLinkNum) {
        this.inputLinkNum = inputLinkNum;
        this.outputLinkNum = outputLinkNum;
        inputWeight = new ArrayList<>(inputLinkNum);
        outputWeight = new ArrayList<>(outputLinkNum);
    }

    public void initNeuron() {
        for (int i = 0; i < inputLinkNum; i++) {
            inputWeight.set(i, Math.random());
        }

        for (int i = 0; i < outputLinkNum; i++) {
            outputWeight.set(i, Math.random());
        }
    }

    public void setInputWeight(ArrayList<Double> inputWeight) {
        this.inputWeight = inputWeight;
    }

    public void setOutputWeight(ArrayList<Double> outputWeight) {
        this.outputWeight = outputWeight;
    }
}
