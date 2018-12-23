package NeuralNet.Layers;

import NeuralNet.Neuron.Neuron;

public class InputLayer extends Layer {
    public InputLayer(int numberOfNeuronsInLayer) {
        super(numberOfNeuronsInLayer);
    }

    @Override
    public void printLayer() {
        System.out.println("-----------This is Input Layer.--------------");
        System.out.println("There are " + numberOfNeuronsInLayer + " neurons in this Layer.");
        int index = 0;
        for (Neuron neuron: getListOfNeurons()) {
            System.out.println("Neuron " + index + " :");
            neuron.printNeuron();
            index++;
        }
    }
}
