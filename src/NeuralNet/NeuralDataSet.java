package NeuralNet;

import java.util.*;

public class NeuralDataSet {
    public int numberOfRecords;
    private ArrayList<ArrayList<Double>> inputArrayList;
    private ArrayList<ArrayList<Double>> outputArrayList;

    private ArrayList<ArrayList<Double>> arrayTargetOutputRecord;
    private ArrayList<ArrayList<Double>> arrayNeuralOutputRecord;

    private double[] arrayInputRecord;

    public void setNeuralOutput(int index, ArrayList<Double> ithOutput) {
        outputArrayList.set(index, ithOutput);
    }

    public ArrayList<ArrayList<Double>> getArrayInputData() {
        return inputArrayList;
    }

    public ArrayList<Double> getIthInputArrayList(int index) {
        return inputArrayList.get(index);
    }

    public ArrayList<Double> getInputRecord(int index) {
        return inputArrayList.get(index);
    }

    public ArrayList<ArrayList<Double>> getInputArrayList() {
        return inputArrayList;
    }

    public ArrayList<Double> getArrayInputRecord(int index) {
        return inputArrayList.get(index);
    }

    public ArrayList<Double> getArrayTargetOutputRecord(int index) {
        return arrayTargetOutputRecord.get(index);
    }

    public ArrayList<Double> getArrayNeuralOutputRecord(int index) {
        return arrayNeuralOutputRecord.get(index);
    }
}
