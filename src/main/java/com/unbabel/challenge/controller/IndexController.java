package com.unbabel.challenge.controller;

import com.unbabel.challenge.dto.TranslatedDTO;
import com.unbabel.challenge.dto.TranslationDTO;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class IndexController {

    @Value("${java.challenge.company}")
    private String company; // Reads this value from Spring properties file
    @Value("${api.key}")
    private String apiKey; // Reads value from aproperties file, is Auth key
    @Value("${api.endpoint}")
    private String apiEndpoint; // Reads value from aproperties file, is the API endpoint
    /**
     * Accepts get requests to the "/" url, generates random messages and
     * renders them in thymeleaf template (index.html).
     *
     * @param model inject objects into thymeleaf template
     * @return generated html page using thymeleaf
     */

    @Autowired
    private Mapper mapper;
    private RestTemplate rest;
    private HttpHeaders headers;
    private HttpStatus status;

    public IndexController() {
        this.rest = new RestTemplate();
        this.headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "ApiKey fullstack-challenge:9db71b322d43a6ac0f681784ebdcc6409bb83359");
    }

    @GetMapping("translation/{translationId}/")
    public TranslationDTO get(@PathVariable("translationId") String uri) {
        HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
        ResponseEntity<String> responseEntity = rest.exchange(apiEndpoint + "/translation/" + uri + "/", HttpMethod.GET, requestEntity, String.class);
        return mapper.map(responseEntity.getBody(),TranslationDTO.class);
    }

    @GetMapping("translation/")
    public String getAll(String uri) {
        HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
        ResponseEntity<String> responseEntity = rest.exchange(apiEndpoint + "/translation/", HttpMethod.GET, requestEntity, String.class);
        return responseEntity.getBody();
    }

    @PostMapping("translation/")
    public TranslatedDTO post(@RequestBody String text, String uri, String json) {
        HttpEntity<String> requestEntity = new HttpEntity<String>(text, headers);
        ResponseEntity<String> responseEntity = rest.exchange(apiEndpoint + "/translation/", HttpMethod.POST, requestEntity, String.class);
        return mapper.map(responseEntity.getBody(),TranslatedDTO.class);
    }

}
