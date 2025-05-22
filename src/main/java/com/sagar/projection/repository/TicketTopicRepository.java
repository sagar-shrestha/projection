package com.sagar.projection.repository;

import com.sagar.projection.entity.TicketTopic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketTopicRepository extends JpaRepository<TicketTopic, Integer> {
}
