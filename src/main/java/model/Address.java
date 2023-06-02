package model;

import lombok.Data;

@Data
public class Address {
    private String street;
    private String country;
    private String state;
    private String city;
    private String zipCode;
}
