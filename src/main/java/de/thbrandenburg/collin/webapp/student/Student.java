package de.thbrandenburg.collin.webapp.student;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@JsonAnyGetter
@JsonAnySetter
@EntityScan


public class Student {
    @JsonTypeId
    private Long id;
    private String name;
    private Long matrNr;

}
