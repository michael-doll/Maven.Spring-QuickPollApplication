package io.zipcoder.tc_spring_poll_application.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OPTION_ID")
    private Long Id;
    @Column(name = "OPTION_VALUE")
    private String value;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
