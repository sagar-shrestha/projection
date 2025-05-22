package com.sagar.projection.service;

import com.sagar.projection.common.pojo.request.TicketTopicRequest;
import com.sagar.projection.entity.TicketTopic;
import org.springframework.data.domain.Page;

public interface TicketTopicService {

void saveTicketTopic(TicketTopicRequest ticketTopicRequest);

TicketTopic updateTicketTopic(TicketTopicRequest ticketTopicRequest, int id);

TicketTopic getTopicById(int id);

Page<TicketTopic> getAllTopic(int pageNo, int pageSize);


}
