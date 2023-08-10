package com.uk.sprint.rest.domain.model;

import com.uk.sprint.rest.infrastructure.model.airline.profile.UserProfile;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Builder
@Getter
public class User {

    @NotNull
    private String firstName;
    @NotNull
    private String surname;
    @NotNull
    private String address;

    @NotNull
    private String passportId;

    public UserProfile toDomain(User user) {
        return UserProfile.builder().address(user.getAddress()).firstName(user.getFirstName())
                .passportId(user.getPassportId())
                .surname(user.getSurname()).build();
    }
}
