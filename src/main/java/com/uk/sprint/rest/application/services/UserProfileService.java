package com.uk.sprint.rest.application.services;

import com.uk.sprint.rest.domain.repository.UserRepository;
import com.uk.sprint.rest.infrastructure.database.UserProfileEntity;
import com.uk.sprint.rest.infrastructure.model.airline.profile.UserProfile;
import com.uk.sprint.rest.infrastructure.database.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserProfileService {

    private UserRepository userRepository;

    public void saveUserProfile(UserProfile userProfile) {
        UserProfileEntity userProfileEntity = UserProfile.toEntity(userProfile);
        log.info(userProfileEntity.getFirstName());
        log.info(userProfileEntity.getSurname());
        log.info(userProfileEntity.getUserId() + "");
        log.info(userProfileEntity.getAddress());
        log.info(userProfileEntity.getPassport());
        //userRepository.save(userProfileEntity);
    }

    public List<UserProfile> getAllUserProfile() {
        return null; // UserProfile.toDomain(userRepository.findAll(Sort.sort(UserProfile.class)));
    }

    public void updateUserProfile(UserProfile userProfile) {
        UserProfileEntity userProfileEntity = UserProfile.toEntity(userProfile);
        //userRepository.save(userProfileEntity);
    }
}
