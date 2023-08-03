package com.uk.sprint.rest.infrastructure.model.airline.profile;

import com.uk.sprint.rest.infrastructure.database.UserProfileEntity;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;

@Builder
@Getter
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
        userProfileEntity.setFirstName(userProfile.getFirstName());
        userProfileEntity.setSurname(userProfile.getSurname());
        userProfileEntity.setAddress(userProfile.getAddress());
        userProfileEntity.setPassportId(userProfile.getPassportId());
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
