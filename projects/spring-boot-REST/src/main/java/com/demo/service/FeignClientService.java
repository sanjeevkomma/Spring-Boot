package com.demo.service;

import com.demo.util.client.FeignClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignClientService {

    @Autowired
    private FeignClientUtil feignClientUtil;

    public String fetchData() {

        return feignClientUtil.getData();
    }
}