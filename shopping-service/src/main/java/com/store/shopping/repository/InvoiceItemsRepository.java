package com.store.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.shopping.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
