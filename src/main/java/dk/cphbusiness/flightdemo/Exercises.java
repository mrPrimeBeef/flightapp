package dk.cphbusiness.flightdemo;

import dk.cphbusiness.flightdemo.dtos.FlightDTO;
import dk.cphbusiness.flightdemo.dtos.FlightInfoDTO;

import java.io.IOException;
import java.time.LocalTime;
import java.util.List;

import static dk.cphbusiness.flightdemo.FlightReader.getFlightInfoDetails;
import static dk.cphbusiness.flightdemo.FlightReader.getFlightsFromFile;

public class Exercises {
    public static void main(String[] args) {
        try {
            List<FlightDTO> flightList = getFlightsFromFile("flights.json");
            List<FlightInfoDTO> flightInfoDTOList = getFlightInfoDetails(flightList);
//            flightInfoDTOList.forEach(System.out::println);

            //System.out.println("-----Round1--------");
            // System.out.println("Minuts: " + FlightServices.getTotalFlightTimeByAirline(flightInfoDTOList, "Lufthansa"));

            //System.out.println("-----Round2--------");
            //FlightServices.flightsBetweenOriginDestination(flightInfoDTOList, "Fukuoka","Haneda Airport").forEach(System.out::println);

//            System.out.println("-----Round3--------");
//            FlightServices.flightBeforeOClock(flightInfoDTOList,"Fukuoka", LocalTime.of(7,6)).forEach(System.out::println);

//            System.out.println("-----Round4--------");
//            FlightServices.calculatAverageFlightTimeByAirline(flightInfoDTOList).forEach((a,aft) -> System.out.println(a + " " + aft));

            System.out.println("-----Round5--------");
            FlightServices.flightsSortedByArrivalTime(flightInfoDTOList).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
