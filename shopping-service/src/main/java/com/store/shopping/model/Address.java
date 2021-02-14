package com.store.shopping.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address  {

    private Long id;
	private Long customerId;
    private State state;
    private City city;
    private String address;    
}
