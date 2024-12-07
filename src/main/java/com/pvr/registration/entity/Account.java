package com.pvr.registration.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {


    private String firstName;

    private String lastName;

    private Long aadharNumber;

    private String panNumber;

    private String mobileNumber;

}
