/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leo.example;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main Rest API Class is used for simple api calls should be so simple as it
 * possible, so that one could move this class in every other project
 *
 * @author odzhara-ongom
 */
@RestController
@RequestMapping("/api")
public class RestApiDeveloper {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(RestApiDeveloper.class);

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {
        LOGGER.info("developers api call");
        return "checktest service: developers api";
    }

}
