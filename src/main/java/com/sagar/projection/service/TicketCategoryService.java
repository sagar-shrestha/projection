package com.sagar.projection.service;

import com.sagar.projection.common.pojo.request.TicketCategoryRequest;
import com.sagar.projection.entity.TicketCategory;
import org.springframework.data.domain.Page;

public interface TicketCategoryService {
    void saveTicketCategory(TicketCategoryRequest ticketCategoryRequest);

    TicketCategory updateTicketCategory(TicketCategoryRequest ticketCategoryRequest, int id);

    TicketCategory getCategoryById(int id);

    Page<TicketCategory> getAllCategory(int pageNo, int pageSize);
}
