/*
 * package com.rest.api.spring.config;
 * 
 * import java.util.Collections;
 * 
 * import org.springframework.boot.web.client.RestTemplateCustomizer; import
 * org.springframework.http.client.BufferingClientHttpRequestFactory; import
 * org.springframework.web.client.RestTemplate;
 * 
 * public class CustomRestTemplateCustomizer implements RestTemplateCustomizer {
 * 
 * @Override public void customize(RestTemplate restTemplate) {
 * restTemplate.setRequestFactory( new
 * BufferingClientHttpRequestFactory(clientHttpRequestFactory()) );
 * restTemplate.setMessageConverters(Collections.singletonList(
 * mappingJacksonHttpMessageConverter()));
 * restTemplate.setInterceptors(Collections.singletonList(new
 * RequestResponseLoggingInterceptor())); } }
 */