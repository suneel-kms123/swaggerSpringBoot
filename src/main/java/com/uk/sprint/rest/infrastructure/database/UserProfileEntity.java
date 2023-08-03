package com.uk.sprint.rest.infrastructure.database;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@Getter
@Setter
@Table(name = "userProfile")
public class UserProfileEntity implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer userId;

    @NotNull
    @Column(name = "first_name")
    private String firstName;
    @NotNull
    @Column(name = "last_name")
    private String surname;
    @NotNull
    private String address;

    @NotNull
    private String passportId;
}
