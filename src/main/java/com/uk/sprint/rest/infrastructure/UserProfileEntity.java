package com.uk.sprint.rest.infrastructure;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Getter
@Setter
public class UserProfileEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer userId;

    @NotNull
    private String firstName;
    @NotNull
    private String surname;
    @NotNull
    private String address;

    @NotNull
    private String passportId;
}
