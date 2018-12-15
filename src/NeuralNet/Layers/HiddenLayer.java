package NeuralNet.Layers;

public class HiddenLayer extends Layer{
    public HiddenLayer(int numberOfNeuronsInLayer) {
        super(numberOfNeuronsInLayer);
    }

    @Override
    public void printLayer() {
        System.out.println("-----------This is Hidden Layer.--------------");
        System.out.println(numberOfNeuronsInLayer + " neurons are in this Layer.");

        System.out.println("----------------------------------------------");
    }
}
