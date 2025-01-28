package dk.cphbusiness.flightdemo.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class FlightCollectionDTO {
    private FlightDTO[] data;
}