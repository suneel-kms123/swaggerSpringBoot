package com.uk.sprint.rest.domain.repository;

import com.uk.sprint.rest.domain.model.User;

public interface UserRepository {

    User getUserProfile();

    void saveProfile(User user);
}
