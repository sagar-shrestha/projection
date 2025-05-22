package com.sagar.projection.repository;

import com.sagar.projection.entity.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {
}
