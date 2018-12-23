package NeuralNet.Layers;

import NeuralNet.Neuron.Neuron;

public class OutputLayer extends Layer {
    public OutputLayer(int numberOfNeuronsInLayer) {
        super(numberOfNeuronsInLayer);
    }

    @Override
    public void printLayer() {
        System.out.println("-----------This is Output Layer.--------------");
        if (numberOfNeuronsInLayer > 1)
            System.out.println("There are " + numberOfNeuronsInLayer + " neurons in this Layer.");
        else
            System.out.println("There is " + numberOfNeuronsInLayer + " neuron in this Layer.");

        int index = 0;
        for (Neuron neuron: getListOfNeurons()) {
            System.out.println("Neuron " + index + " :");
            neuron.printNeuron();
            index++;
        }

    }
}
