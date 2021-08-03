package com.uk.sprint.rest.services;

import com.uk.sprint.rest.infrastructure.UserProfileEntity;
import com.uk.sprint.rest.model.airline.profile.UserProfile;
import com.uk.sprint.rest.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    @Autowired
    UserProfileRepository userProfileRepository;

    public void saveUserProfile(UserProfile userProfile) {
        UserProfileEntity userProfileEntity = UserProfile.toEntity(userProfile);
        userProfileRepository.save(userProfileEntity);
    }

    public void getAllUserProfile() {
        userProfileRepository.findAll(Sort.sort(UserProfile.class));
    }

}
