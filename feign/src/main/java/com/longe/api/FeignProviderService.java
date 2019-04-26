package com.longe.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "PROVIDER-SERVICE")
public interface FeignProviderService {

    @RequestMapping("provider")
    public String provider();
}
