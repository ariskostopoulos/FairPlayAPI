package com.fairplay.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Dummy service.
 *
 * @author Stavros Grigoriou
 */
@Component
public class DummyService {

    /**
     * Logger instance.
     */
    private static final Logger log = LoggerFactory.getLogger(DummyService.class);

    /**
     * A dummy service. Does nothing!
     */
    public void dummyFunction() {
        log.info("Dummy service works!");
    }

}
