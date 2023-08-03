package com.uk.sprint.rest.infrastructure;

import com.uk.sprint.rest.domain.model.User;
import com.uk.sprint.rest.domain.repository.UserRepository;
import com.uk.sprint.rest.infrastructure.database.UserProfileEntity;
import com.uk.sprint.rest.infrastructure.database.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RequiredArgsConstructor
public class AirlineUserRepository implements UserRepository {
    @Autowired
    UserProfileRepository userProfileRepository;

    @Override
    public List<User> getUserProfile() {
        return userProfileRepository.findAll();
    }

    @Override
    public void saveProfile(User user) {
        userProfileRepository.save(user);
    }

    private List<User> convert(List<UserProfileEntity> userProfileEntity) {
        userProfileEntity.stream();
    }
}
