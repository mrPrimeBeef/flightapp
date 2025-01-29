package dk.cphbusiness.flightdemo;

import dk.cphbusiness.flightdemo.dtos.FlightInfoDTO;

import java.time.LocalDate;
import java.util.List;

public class FlightServices {

    public static Long getTotalFlightTimeByAirline(List<FlightInfoDTO> flightInfoDTOList, String airline) {

        long result = flightInfoDTOList.stream()
                .filter(f -> (airline.equals(f.getAirline())))
                .mapToLong(f -> (f.getDuration().toMinutes()))
                .sum();

        return result;
    }
}