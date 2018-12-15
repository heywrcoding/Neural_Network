package NeuralNet.Layers;

public class OutputLayer extends Layer {
    public OutputLayer(int numberOfNeuronsInLayer) {
        super(numberOfNeuronsInLayer);
    }

    @Override
    public void printLayer() {
        System.out.println("-----------This is Output Layer.--------------");
        System.out.println(numberOfNeuronsInLayer + " neurons are in this Layer.");

        System.out.println("----------------------------------------------");
    }
}
