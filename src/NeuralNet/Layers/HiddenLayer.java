package NeuralNet.Layers;

import NeuralNet.Neuron.Neuron;

public class HiddenLayer extends Layer{
    public HiddenLayer(int numberOfNeuronsInLayer) {
        super(numberOfNeuronsInLayer);
    }

    @Override
    public void printLayer() {
        System.out.println("-----------This is Hidden Layer.--------------");
        System.out.println("There are " + numberOfNeuronsInLayer + " neurons in this Layer.");

        int index = 0;
        for (Neuron neuron: getListOfNeurons()) {
            System.out.println("Neuron " + index + " :");
            neuron.printNeuron();
            index++;
        }
    }
}
