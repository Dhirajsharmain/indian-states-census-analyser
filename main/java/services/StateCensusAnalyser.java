/**
 ****************************************************************************
 * Purpose: The purpose of this class to load the Indian States Census
 * Information from a csv file and perform some analysis on data.
 *
 * @author Dhiraj and Naziya
 * @version 1.0
 * @since 30-06-2021
 ****************************************************************************
 */
package services;

public class StateCensusAnalyser {

    public static void main(String[] args) {
        CSVStateCensus csvStateCensus = new CSVStateCensus();
        int statesCensus;
        statesCensus = csvStateCensus.readStatesCensusCsv("E:\\BridgeLabs Training\\Java\\Advance Java\\IndianStatesCensusAnalyser\\src\\main\\resources\\StateCensusData.csv");
        System.out.println(statesCensus);
    }
}
