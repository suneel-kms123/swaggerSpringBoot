package com.uk.sprint.rest.model.airline.profile;

import com.uk.sprint.rest.infrastructure.UserProfileEntity;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;

@Builder
@RequiredArgsConstructor
public class UserProfile {

    @NotNull
    private String firstName;
    @NotNull
    private String surname;
    @NotNull
    private String address;

    @NotNull
    private String passportId;

    public static UserProfileEntity toEntity(UserProfile userProfile) {
        UserProfileEntity userProfileEntity = new UserProfileEntity();
        userProfileEntity.setFirstName(userProfile.firstName);
        userProfileEntity.setSurname(userProfile.surname);
        userProfileEntity.setAddress(userProfile.address);
        userProfileEntity.setPassportId(userProfile.passportId);
        return userProfileEntity;
    }

}
