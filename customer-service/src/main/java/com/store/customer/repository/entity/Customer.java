package com.store.customer.repository.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_customers")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El número de telefono no puede ser vacío")
    @Size( min = 10 , max = 10, message = "El tamaño del número de teléfono es 10")
    @Column(name = "phone_number" , unique = true ,length = 8, nullable = false)
    private String phoneNumber;

    @NotEmpty(message = "El nombre no puede ser vacío")
    @Column(name="first_name", nullable=false)
    private String firstName;

    @NotEmpty(message = "El apellido no puede ser vacío")
    @Column(name="last_name", nullable=false)
    private String lastName;

    @NotEmpty(message = "el correo no puede estar vacío")
    @Email(message = "no es un dirección de correo bien formada")
    @Column(unique=true, nullable=false)
    private String email;

    @Column(name="photo_url")
    private String photoUrl;
    
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Set<Address> addresses;
    
    private String status;
    
    
        
}
