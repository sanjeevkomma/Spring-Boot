package com.demo.tools;

import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Component
public class TimeTool implements Tool {


    @Override
    public String name() {
        return "get_time";
    }


    @Override
    public String description() {
        return "Returns current IST time";
    }


    @Override
    public String execute(String input) {
        return ZonedDateTime.now(ZoneId.of("Asia/Kolkata")).toString();
    }
}