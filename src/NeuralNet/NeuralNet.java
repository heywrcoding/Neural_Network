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

        for (int i = 0; i < numberOfHiddenLayers; i++) {
            for (int j = 0; j < listOfHiddenLayer.get(i).getNumberOfNeuronsInLayer(); j++) {
                //set number of inputs in neuron
                if (i == 0)
                    listOfHiddenLayer.get(i).getNeuron(j).setNumberOfInputs(numberOfInputs);
                else
                    listOfHiddenLayer.get(i).getNeuron(j).setNumberOfInputs(numberOfNeuronsInHiddenLayer);

                //set number of outputs in neuron
                if (i == numberOfHiddenLayers - 1)
                    listOfHiddenLayer.get(i).getNeuron(j).setNumberOfOutputs(numberOfOutputs);
                else
                    listOfHiddenLayer.get(i).getNeuron(j).setNumberOfOutputs(numberOfNeuronsInHiddenLayer);

                //init neuron weight
                listOfHiddenLayer.get(i).getNeuron(j).initNeuron();
            }
        }

        for (int j = 0; j < outputLayer.getNumberOfNeuronsInLayer(); j++) {
            //set number of inputs in neuron
            if (numberOfHiddenLayers == 0)
                outputLayer.getNeuron(j).setNumberOfInputs(numberOfInputs);
            else
                outputLayer.getNeuron(j).setNumberOfInputs(numberOfNeuronsInHiddenLayer);

            //set number of outputs in neuron
            outputLayer.getNeuron(j).setNumberOfOutputs(numberOfOutputs);

            //init neuron weight
            outputLayer.getNeuron(j).initNeuron();
        }

    }

    public void printNet() {
        inputLayer.printLayer();
        for (HiddenLayer hiddenLayer: listOfHiddenLayer) {
            hiddenLayer.printLayer();
        }
        outputLayer.printLayer();
    }

    public void calc() {
        if (numberOfHiddenLayers != 0) {
            //calc hidden layers
            for (int i = 0; i < numberOfHiddenLayers; i++) {
                if (i == 0)
                    listOfHiddenLayer.get(i).calcNeuronValueInThisLayer(inputLayer);
                else
                    listOfHiddenLayer.get(i).calcNeuronValueInThisLayer(listOfHiddenLayer.get(i - 1));
            }

            //calc output layer
            outputLayer.calcNeuronValueInThisLayer(listOfHiddenLayer.get(numberOfHiddenLayers - 1));
        }
        else {
            outputLayer.calcNeuronValueInThisLayer(inputLayer);
        }
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
