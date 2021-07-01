package services;

import model.StatesCensusCSVModel;

import java.util.List;

public class StateCensusAnalyser {

    public static void main(String[] args) {
        CSVStateCensus csvStateCensus = new CSVStateCensus();
        List<StatesCensusCSVModel> statesCensus;
        statesCensus = csvStateCensus.readStatesCensusCsv("E:\\BridgeLabs Training\\Java\\Advance Java\\IndianStatesCensusAnalyser\\src\\main\\resources\\StateCensusData.csv");
        statesCensus.forEach(System.out::println);
    }
}
