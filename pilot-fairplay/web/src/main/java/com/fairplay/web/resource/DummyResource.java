package com.fairplay.web.resource;

import com.fairplay.service.DummyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Dummy Resources.
 *
 * @author Stavros Grigoriou
 */
@RestController
public class DummyResource {

    /**
     * Logger instance.
     */
    public static final Logger log = LoggerFactory.getLogger(DummyResource.class);

    /**
     * Dummy service instance.
     */
    private DummyService dummyService;

    /**
     * Set the instance of {@link #dummyService}.
     *
     * @param dummyService {@link DummyService} instance.
     */
    @Autowired
    public void setDummyService(final DummyService dummyService) {
        this.dummyService = dummyService;
    }

    /**
     * Get the instance of {@link #dummyService}.
     *
     * @return {@link DummyService} instance.
     */
    public DummyService getDummyService() {
        return this.dummyService;
    }

    /**
     * HTTP/GET for /status
     *
     * @return {@link ResponseEntity}.
     */
    @RequestMapping(method = RequestMethod.GET, path = "/dummy", produces = "application/json")
    public ResponseEntity dummyController() {
        log.info("Request for /dummy");
        getDummyService().dummyFunction();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
