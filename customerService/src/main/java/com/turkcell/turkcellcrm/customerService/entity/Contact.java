package com.turkcell.turkcellcrm.customerService.entity;

import com.turkcell.turkcellcrm.customerService.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "contacts")
public class Contact extends BaseEntity {
    private String email;
    private String homePhone;
    private String mobilePhone;
    private String fax;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
