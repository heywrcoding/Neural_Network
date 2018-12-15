package NeuralNet.Layers;

public class InputLayer extends Layer {
    public InputLayer(int numberOfNeuronsInLayer) {
        super(numberOfNeuronsInLayer);
    }

    @Override
    public void printLayer() {
        System.out.println("-----------This is Input Layer.--------------");
        System.out.println(numberOfNeuronsInLayer + " neurons are in this Layer.");

        System.out.println("----------------------------------------------");
    }
}
