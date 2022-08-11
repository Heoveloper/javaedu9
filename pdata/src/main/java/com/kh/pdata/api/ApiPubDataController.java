package com.kh.pdata.api;

import com.kh.pdata.svc.ApiExplorer;
import com.kh.pdata.svc.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/pub")
@RequiredArgsConstructor
public class ApiPubDataController {

    private final ApiExplorer apiExplorer;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getData() {
        Response res = apiExplorer.apiCall();
        log.info("res={}", res);
        return res;
    }
    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Response getXMLData() {
        Response res = apiExplorer.apiCall();
        log.info("res={}", res);
        return res;
    }
    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getJsonData() {
        Response res = apiExplorer.apiCall();
        log.info("res={}", res);
        return res;
    }
}
