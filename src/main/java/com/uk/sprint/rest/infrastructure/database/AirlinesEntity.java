package com.uk.sprint.rest.infrastructure.database;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Getter
@Setter
@Table(name = "airlines")
public class AirlinesEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String source;

    private String destination;

    private Timestamp date;

    private Integer price;

    private String airlinesName;

    private String airlineType;

    private String airlineMode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
