package com.uk.sprint.Rest.swagger;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
class SprintRestController {

        @RequestMapping(
                method = {RequestMethod.GET}
        )
        @ApiOperation("My App Service get test1 API")
        @ApiResponses({@ApiResponse(
                code = 200,
                message = ""
        )})
        @ResponseStatus(HttpStatus.OK)
        @ResponseBody
        @PostMapping({"/api/v1/restApi"})
        public String getRestApi() {
            return "jai ho";
        }

}
