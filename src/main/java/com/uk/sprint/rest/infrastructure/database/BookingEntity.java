package com.uk.sprint.rest.infrastructure.database;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Getter
@Setter
@Table(name = "userProfile")
@NoArgsConstructor
public class BookingEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String username;

    private String airlineName;

    private String price;

    private Timestamp travelDate;
    private String paymentId;

    private String source;

    private String destination;

    private Timestamp date;

    @NonNull
    private String mobile;

    @NonNull
    private String email;

}
