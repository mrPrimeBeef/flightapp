package dk.cphbusiness.flightdemo.dtos;

import lombok.Data;

@Data
public class FlightDTO {
    private String flight_date;
    private String flight_status;
    private DepartureDTO departure;
    private ArrivalDTO arrival;
    private FlightDetailsDTO flight;
    private AirlineDTO airline;
}

