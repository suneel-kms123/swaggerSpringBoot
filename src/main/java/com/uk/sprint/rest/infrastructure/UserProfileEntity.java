package com.uk.sprint.rest.infrastructure;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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
