package de.thbrandenburg.collin.webapp.student;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter


public class Student {
@Id
    private Long id;
    private String name;
    private Long matrNr;

}
