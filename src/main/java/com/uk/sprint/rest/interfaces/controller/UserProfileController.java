package com.uk.sprint.rest.interfaces.controller;

import com.uk.sprint.rest.application.services.UserProfileService;
import com.uk.sprint.rest.domain.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airline/api/v1")
@Slf4j
@RequiredArgsConstructor
public class UserProfileController {

    private final UserProfileService userProfileService;

    @PostMapping(path = "createUser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createUserProfile(@RequestBody User newUser) {
        log.info("new user --> " + newUser.getFirstName());
        userProfileService.saveUserProfile(newUser.toDomain(newUser));
    }

}
