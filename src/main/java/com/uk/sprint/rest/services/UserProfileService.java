package com.uk.sprint.rest.services;

import com.uk.sprint.rest.infrastructure.UserProfileEntity;
import com.uk.sprint.rest.model.airline.profile.UserProfile;
import com.uk.sprint.rest.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {

    @Autowired
    UserProfileRepository userProfileRepository;

    public void saveUserProfile(UserProfile userProfile) {
        UserProfileEntity userProfileEntity = UserProfile.toEntity(userProfile);
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
