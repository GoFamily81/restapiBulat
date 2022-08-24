package com.example.restapi.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity (name = "Car")
@Table(name = "cars")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Integer id;

    @Column(name = "car_brand")
    private String carBrand;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_colour")
    private String carColour;

}
