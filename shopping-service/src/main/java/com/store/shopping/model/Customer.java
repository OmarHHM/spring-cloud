package com.store.shopping.model;

import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private Long id;


    private String phoneNumber;

    private String firstName;


    private String lastName;


    private String email;


    private String photoUrl;

    private Set<Address> addresses;

    private String status;
}
