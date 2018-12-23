package NeuralNet;

import LearningAlgorithm.LearningAlgorithm;
import NeuralNet.Utils.*;
import java.util.*;

public class NeuralDataSet {
    public int numberOfRecords;
    private int numberOfRealOutputs;

    private ArrayList<ArrayList<Double>> inputArrayList = new ArrayList<>();
    private ArrayList<ArrayList<Double>> outputArrayList = new ArrayList<>();

//    private ArrayList<ArrayList<Double>> arrayTargetOutputRecord = new ArrayList<>();
    private ArrayList<ArrayList<Double>> arrayNeuralOutputRecord = new ArrayList<>();

    private double[] arrayInputRecord;

    public void setTrainSet(double[][] trainSet) {
        numberOfRecords = trainSet.length;
        for (int i = 0; i < numberOfRecords; i++) {
            ArrayList<Double> arrayList = new ArrayList<>();

            for (int j = 0; j < trainSet[0].length; j++) {
                arrayList.add(j, trainSet[i][j]);
            }

            inputArrayList.add(i, arrayList);
        }

        myUtils.caveTest("NeuralDataSet.inputArrayList", inputArrayList, LearningAlgorithm.printTraining);

        for (int i = 0; i < numberOfRecords; i++) {
            arrayNeuralOutputRecord.add(new ArrayList<Double>());
        }
    }

    public void setRealOutputSet(double[][] realOutputSet) {
        numberOfRealOutputs = realOutputSet.length;

        for (int i = 0; i < numberOfRealOutputs; i++) {
            ArrayList<Double> arrayList = new ArrayList<>();

            for (int j = 0; j < realOutputSet[0].length; j++) {
                arrayList.add(j, realOutputSet[i][j]);
            }

            outputArrayList.add(i, arrayList);
        }

        myUtils.caveTest("NeuralDataSet.outputArrayList", outputArrayList, LearningAlgorithm.printTraining);

    }

    public void setNeuralOutput(int index, ArrayList<Double> ithOutput) {
        arrayNeuralOutputRecord.set(index, ithOutput);
        myUtils.caveTest("NeuralDataSet.arrayNeuralOutputRecord", arrayNeuralOutputRecord, LearningAlgorithm.printTraining);
    }

    public ArrayList<ArrayList<Double>> getArrayInputData() {
        return inputArrayList;
    }

    public ArrayList<Double> getIthInputArrayList(int index) {
        ArrayList<Double> ithInputArrayList = new ArrayList<>();
        for (int i = 0; i < numberOfRecords; i++) {
            ithInputArrayList.add(i, inputArrayList.get(i).get(index));
        }

        return ithInputArrayList;
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
        return outputArrayList.get(index);
    }

    public ArrayList<Double> getArrayNeuralOutputRecord(int index) {
        return arrayNeuralOutputRecord.get(index);
    }

    public ArrayList<Double> getIthTargetOutputArrayList(int index) {
        return outputArrayList.get(index);
    }

    public ArrayList<Double> getIthNeuralOutputArrayList(int index) {
        return arrayNeuralOutputRecord.get(index);
    }

    public ArrayList<ArrayList<Double>> getArrayTargetOutputData() {
        return outputArrayList;
    }

    public ArrayList<ArrayList<Double>> getArrayNeuralOutputData() {
        return arrayNeuralOutputRecord;
    }

}
