package com.store.customer.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tbl_city")
public class City implements Serializable {

	private static final long serialVersionUID = 1864111947831213058L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
}
