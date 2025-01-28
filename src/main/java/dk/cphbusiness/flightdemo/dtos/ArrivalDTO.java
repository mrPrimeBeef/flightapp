package dk.cphbusiness.flightdemo.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArrivalDTO {
    private String airport;
    private String timezone;
    private String iata;
    private LocalDateTime scheduled;
}