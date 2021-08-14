package com.uk.sprint.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airline/api/v1")
public class UserProfileController {

    @PostMapping("/createUser")
    public void createUserProfile() {

    }

}
