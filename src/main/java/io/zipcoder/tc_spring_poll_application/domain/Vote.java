package io.zipcoder.tc_spring_poll_application.domain;

import org.springframework.data.annotation.Id;
import javax.persistence.*;

@Entity
public class Vote {
    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private Option option;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
}
