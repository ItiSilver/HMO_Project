package com.app;

import com.app.Vaccine;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CoronaDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private Vaccine vac1;
    private Vaccine vac2;
    private Vaccine vac3;
    private Vaccine vac4;
    private Date psitive_date;
    private Date recovery_date;


}

