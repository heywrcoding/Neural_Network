package NeuralNet.Neuron;

import NeuralNet.Utils.ActivationFunc;

import java.util.ArrayList;

public class Neuron {
    private ArrayList<Double> listOfWeightIn;
    private ArrayList<Double> listOfWeightOut;
    private int numberOfInputs;
    private int numberOfOutputs;
    private double value;

    public Neuron() {
        this(0,0);
    }

    Neuron(int inputLinkNum, int outputLinkNum) {
        this.numberOfInputs = inputLinkNum;
        this.numberOfOutputs = outputLinkNum;
        listOfWeightIn = new ArrayList<>(inputLinkNum);
        listOfWeightOut = new ArrayList<>(outputLinkNum);
    }

    public void initNeuron() {
        for (int i = 0; i < numberOfInputs; i++) {
            listOfWeightIn.add(i, Math.random());
        }

        for (int i = 0; i < numberOfOutputs; i++) {
            listOfWeightOut.add(i, Math.random());
        }
    }

    public ArrayList<Double> derivativeBatch(ArrayList<ArrayList<Double>> inputData) {
        ArrayList<Double> derivativeOfSigmoid =  new ArrayList<>();

        for (int i = 0; i < inputData.size(); i++) {
            Double sum = 0.0;

            for (int j = 0; j < inputData.get(0).size(); j++) {
                sum += inputData.get(i).get(j) * listOfWeightIn.get(j);
            }

            derivativeOfSigmoid.add(i, ActivationFunc.sigmoidDerivative(sum));
        }

        return derivativeOfSigmoid;
    }

    public double derivative(ArrayList<Double> inputData) {
        return 0.5;
    }

    public void updateWeight(int index, double newWeight) {
        listOfWeightIn.set(index, newWeight);
    }

    public void printNeuron() {
        System.out.println("- Value of this neuron is: " + value);
        if (listOfWeightIn.size() != 0) {
            for (int i = 0; i < listOfWeightIn.size(); i++) {
                System.out.println("- Input Weight " + i + " : " + listOfWeightIn.get(i));
            }
        }

    }

    public void setNumberOfInputs(int numberOfInputs) {
        this.numberOfInputs = numberOfInputs;
        this.listOfWeightIn = new ArrayList<>(numberOfInputs);
    }

    public void setNumberOfOutputs(int numberOfOutputs) {
        this.numberOfOutputs = numberOfOutputs;
        this.listOfWeightOut = new ArrayList<>(numberOfOutputs);
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
