package NeuralNet.Layers;

import NeuralNet.Neuron.Neuron;
import NeuralNet.Utils.ActivationFunc;

import java.util.ArrayList;

public class Layer {

    private ArrayList<Neuron> listOfNeurons;
    int numberOfNeuronsInLayer;

    Layer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;

        for (int i = 0; i < numberOfNeuronsInLayer; i++) {
            Neuron neuron = new Neuron();
            listOfNeurons.add(neuron);
        }
    }

    public void printLayer() {

    }

    //default: sigmoid
    public void calcNeuronValueInThisLayer(Layer lastLayer) {
        for (Neuron neuron: listOfNeurons) {
            neuron.setValue(ActivationFunc.sigmoid(summing(lastLayer, neuron.getListOfWeightIn())));
        }
    }

    private double summing(Layer lastLayer, ArrayList<Double> inputWeight) {
        double result = 0;
        int index = 0;

        for (Neuron lastLayerNeuron: lastLayer.getListOfNeurons()) {
            result += lastLayerNeuron.getValue() * inputWeight.get(index);
            index++;
        }

        return result;
    }

    public void setListOfNeurons(ArrayList<Neuron> listOfNeurons) {
        this.listOfNeurons = listOfNeurons;
    }

    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }

    public ArrayList<Neuron> getListOfNeurons() {
        return listOfNeurons;
    }

    public Neuron getNeuron(int index) {
        return listOfNeurons.get(index);
    }

    public int getNumberOfNeuronsInLayer() {
        return numberOfNeuronsInLayer;
    }
}
