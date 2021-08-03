package com.uk.sprint.rest.repository;

import com.uk.sprint.rest.infrastructure.UserProfileEntity;
import com.uk.sprint.rest.model.airline.profile.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfileEntity, Integer> {

    UserProfile findProfileByPassportId(final String passportId);

}
