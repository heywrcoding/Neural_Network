package NeuralNet.Neuron;

import java.util.ArrayList;

public class Neuron {
    private ArrayList<Double> listOfWeightIn;
    private ArrayList<Double> listOfWeightOut;
    private int numberOfInputs;
    private int numberOfOutputs;
    private double value;

    public Neuron() {

    }

    public Neuron(int inputLinkNum, int outputLinkNum) {
        this.numberOfInputs = inputLinkNum;
        this.numberOfOutputs = outputLinkNum;
        listOfWeightIn = new ArrayList<>(inputLinkNum);
        listOfWeightOut = new ArrayList<>(outputLinkNum);
    }

    public void initNeuron() {
//        for (int i = 0; i < numberOfInputs; i++) {
//            listOfWeightIn.set(i, Math.random());
//        }
//
//        for (int i = 0; i < numberOfOutputs; i++) {
//            listOfWeightOut.set(i, Math.random());
//        }
    }

    public ArrayList<Double> derivativeBatch(ArrayList<ArrayList<Double>> inputData) {
        return new ArrayList<Double>();
    }

    public double derivative(ArrayList<Double> inputData) {
        return 0.5;
    }

    public void updateWeight(int index, double newWeight) {
        listOfWeightIn.set(index, newWeight);
    }

//    /**
//     * Calculate value of neuron.
//     * @param activeFuncFlag
//     * 0 for Sigmoid, 1 for hyperbolicTangent, 2 for hardLimitingThreshold, 3 for linear, 4 for rectifiedLinear.
//     */
//    public void calcValue(int activeFuncFlag) {
//        switch (activeFuncFlag) {
//            case 0:
//                value
//        }
//    }

//    private double summingFunc() {
//
//    }

    public void setListOfWeightIn(ArrayList<Double> inputWeights) {
        this.listOfWeightIn = inputWeights;
    }

    public void setListOfWeightOut(ArrayList<Double> outputWeights) {
        this.listOfWeightOut = outputWeights;
    }

    public int getNumberOfInputs() {
        return numberOfInputs;
    }

    public int getNumberOfOutputs() {
        return numberOfOutputs;
    }

    public ArrayList<Double> getListOfWeightIn() {
        return listOfWeightIn;
    }

    public double getWeight(int index) {
        return listOfWeightIn.get(index);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
