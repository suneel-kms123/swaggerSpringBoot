package com.uk.sprint.rest.model.airline.profile;

import com.uk.sprint.rest.infrastructure.UserProfileEntity;
import lombok.Builder;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Builder
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

    public static List<UserProfile> toDomain(List<UserProfileEntity> entityList) {
        List<UserProfile> userProfileList = new ArrayList<>();
        entityList.forEach(userProfileEntity -> userProfileList.add(UserProfile.builder()
                .address(userProfileEntity.getAddress())
                .firstName(userProfileEntity.getFirstName())
                .passportId(userProfileEntity.getPassportId())
                .surname(userProfileEntity.getSurname()).build()));
        return userProfileList;
    }

}
