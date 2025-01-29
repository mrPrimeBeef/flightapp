package dk.cphbusiness.flightdemo;

import dk.cphbusiness.flightdemo.dtos.FlightInfoDTO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class FlightServices {

    public static Long getTotalFlightTimeByAirline(List<FlightInfoDTO> flightInfoDTOList, String airline) {

        long result = flightInfoDTOList.stream()
                .filter(f -> (airline.equals(f.getAirline())))
                .mapToLong(f -> (f.getDuration().toMinutes()))
                .sum();

        return result;
    }

    public static List<FlightInfoDTO> flightsBetweenOriginDestination(List<FlightInfoDTO> flightInfoDTOList, String origin, String destination) {
        return flightInfoDTOList.stream()
                .filter(f->origin.equals(f.getOrigin()))
                .filter(f->destination.equals(f.getDestination()))
                .toList();
    }
    public static List<FlightInfoDTO> flightBeforeOClock(List<FlightInfoDTO> flightInfoDTOList, String origin,  LocalTime timeToCheck){
        return flightInfoDTOList.stream()
                .filter(o -> origin.equals(o.getOrigin()))
                .filter(f -> f.getDeparture().toLocalTime().isBefore(timeToCheck))
                .toList();
    }
}