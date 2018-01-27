package com.trw.webapp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class MyController {
    private static final Log LOGGER = LogFactory.getLog(MyController.class);

    @PostConstruct
    public void init() {

    }

    // to hit this endpoint: http://localhost:8080/testing?code=55
    @RequestMapping(path= "/testing")
    public void authenticate(@RequestParam("code") String code, HttpServletRequest request, HttpServletResponse response) throws IOException {
        LOGGER.info(String.format("code: {}", code));
    }

}
