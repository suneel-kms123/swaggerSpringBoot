package com.uk.sprint.rest.interfaces.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
class SprintRestController {

    @RequestMapping(
            method = {RequestMethod.GET}
    )
    @ApiOperation("My App Service get test1 API")
    @ApiResponses({@ApiResponse(
            code = 200,
            message = "")})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping({"/api/v1/restApi"})
    public ResponseEntity<String> getRestApi() {
        return ResponseEntity.ok("success");
    }

}
