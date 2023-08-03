package com.uk.sprint.rest.application.services;

import com.uk.sprint.rest.infrastructure.database.UserProfileEntity;
import com.uk.sprint.rest.infrastructure.model.airline.profile.UserProfile;
import com.uk.sprint.rest.infrastructure.database.UserProfileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserProfileService {

    @Autowired
    UserProfileRepository userProfileRepository;

    public void saveUserProfile(UserProfile userProfile) {
        UserProfileEntity userProfileEntity = UserProfile.toEntity(userProfile);
        log.info(userProfileEntity.getFirstName());
        log.info(userProfileEntity.getSurname());
        log.info(userProfileEntity.getUserId() + "");
        log.info(userProfileEntity.getAddress());
        log.info(userProfileEntity.getPassportId());
        userProfileRepository.save(userProfileEntity);
    }

    public List<UserProfile> getAllUserProfile() {
        return UserProfile.toDomain(userProfileRepository.findAll(Sort.sort(UserProfile.class)));
    }

    public void updateUserProfile(UserProfile userProfile) {
        UserProfileEntity userProfileEntity = UserProfile.toEntity(userProfile);
        userProfileRepository.save(userProfileEntity);
    }
}
