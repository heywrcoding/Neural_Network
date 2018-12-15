package NeuralNet;

import NeuralNet.Layers.*;

import java.util.ArrayList;

public class NeuralNet {

    private InputLayer inputLayer;
    private ArrayList<HiddenLayer> listOfHiddenLayer;
    private OutputLayer outputLayer;

    private int numberOfHiddenLayers;
    private int numberOfOutputs;
    private int numberOfInputs;

    private ArrayList<Double> inputs;
    private ArrayList<Double> outputs;

    private double[][] trainSet;
    private double[] realOutputSet;

    public NeuralNet(int numberOfInputs, int numberOfHiddenLayers, int numberOfNeuronsInHiddenLayer, int numberOfOutputs) {
        inputLayer = new InputLayer(numberOfInputs);
        this.numberOfHiddenLayers = numberOfHiddenLayers;
        outputLayer = new OutputLayer(numberOfOutputs);

        for (int i = 0; i < numberOfHiddenLayers; i++) {
            HiddenLayer hiddenLayer = new HiddenLayer(numberOfNeuronsInHiddenLayer);
            listOfHiddenLayer.add(hiddenLayer);
        }

    }

    public void printNet() {
        inputLayer.printLayer();
        for (HiddenLayer hiddenLayer: listOfHiddenLayer) {
            hiddenLayer.printLayer();
        }
        outputLayer.printLayer();
    }


    public void setTrainSet(double[][] trainSet) {
        this.trainSet = trainSet;
    }

    public void setRealOutputSet(double[] realOutputSet) {
        this.realOutputSet = realOutputSet;
    }

    public void setInputLayer(InputLayer inputLayer) {
        this.inputLayer = inputLayer;
    }

    public void setHiddenLayers(ArrayList<HiddenLayer> hiddenLayers) {
        this.listOfHiddenLayer = hiddenLayers;
    }

    public void setOutputLayer(OutputLayer outputLayer) {
        this.outputLayer = outputLayer;
    }

    public void setNumberOfHiddenLayers(int numberOfHiddenLayers) {
        this.numberOfHiddenLayers = numberOfHiddenLayers;
    }

    public void setNumberOfOutputs(int numberOfOutputs) {
        this.numberOfOutputs = numberOfOutputs;
    }

    public void setNumberOfInputs(int numberOfInputs) {
        this.numberOfInputs = numberOfInputs;
    }

    public void setInputs(ArrayList<Double> inputs) {
        this.inputs = inputs;
    }

    public void setOutputs(ArrayList<Double> outputs) {
        this.outputs = outputs;
    }

    public InputLayer getInputLayer() {
        return inputLayer;
    }

    public ArrayList<HiddenLayer> getHiddenLayers() {
        return listOfHiddenLayer;
    }

    public HiddenLayer getHiddenLayer(int index) {
        return listOfHiddenLayer.get(index);
    }

    public OutputLayer getOutputLayer() {
        return outputLayer;
    }

    public int getNumberOfHiddenLayers() {
        return numberOfHiddenLayers;
    }

    public int getNumberOfOutputs() {
        return numberOfOutputs;
    }

    public ArrayList<Double> getInputs() {
        return inputs;
    }

    public double getInput(int index) {
        return inputs.get(index);
    }

    public ArrayList<Double> getOutputs() {
        return outputs;
    }

    public int getNumberOfInputs() {
        return numberOfInputs;
    }
}
