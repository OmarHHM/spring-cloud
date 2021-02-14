package com.store.customer.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tbl_states")
public class State implements Serializable {

	private static final long serialVersionUID = 5048004174712795062L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
}
