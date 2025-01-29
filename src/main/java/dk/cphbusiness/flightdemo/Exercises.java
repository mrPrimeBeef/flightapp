package dk.cphbusiness.flightdemo;

import dk.cphbusiness.flightdemo.dtos.FlightDTO;
import dk.cphbusiness.flightdemo.dtos.FlightInfoDTO;

import java.io.IOException;
import java.util.List;

import static dk.cphbusiness.flightdemo.FlightReader.getFlightInfoDetails;
import static dk.cphbusiness.flightdemo.FlightReader.getFlightsFromFile;

public class Exercises {
    public static void main(String[] args) {
        try {
            List<FlightDTO> flightList = getFlightsFromFile("flights.json");
            List<FlightInfoDTO> flightInfoDTOList = getFlightInfoDetails(flightList);
//            flightInfoDTOList.forEach(System.out::println);

            System.out.println("-----Round1--------");
            System.out.println("Minuts: " + FlightServices.getTotalFlightTimeByAirline(flightInfoDTOList, "Lufthansa"));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
