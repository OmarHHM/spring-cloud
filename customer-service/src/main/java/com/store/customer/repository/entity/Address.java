package com.store.customer.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_address")
@JsonIgnoreProperties({ "customerId"})
public class Address implements Serializable {

	private static final long serialVersionUID = -1997054575310005307L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "customer_id")
	private Long customerId;
    
    
    @NotNull(message = "El estado no puede ser vacío")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private State state;
    
    @NotNull(message = "La ciudad no puede ser vacia")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private City city;
		
	
    private String address;
    
    
}
