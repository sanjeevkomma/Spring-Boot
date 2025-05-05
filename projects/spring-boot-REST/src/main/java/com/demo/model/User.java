package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@AllArgsConstructor
public class User {

    private Integer id;
    private String name;
    private String email;

}
