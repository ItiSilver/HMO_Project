package com.app;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import com.app.CoronaDetails;


@Entity
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String last_name;
    private Data birth_date;
    private String city;
    private String street;
    private String phone;
    private String phone2;
    private CoronaDetails corona_details;


}

