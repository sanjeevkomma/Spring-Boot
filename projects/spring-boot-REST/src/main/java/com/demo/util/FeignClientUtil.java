package com.demo.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "exampleClient", url = "https://jsonplaceholder.typicode.com")
public interface FeignClientUtil {

    @GetMapping("/posts")
    String getData();
}
