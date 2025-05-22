package com.sagar.projection.service;

import com.sagar.projection.common.pojo.request.TicketRequest;
import com.sagar.projection.common.pojo.response.TicketResponse;

import java.net.MalformedURLException;

public interface TicketService {

    void saveTicket(TicketRequest ticketRequestPojo) throws Exception;

    void updateTicket(TicketRequest ticketRequestPojo, Long id) throws Exception;

    TicketResponse getTicketById(Long id) throws MalformedURLException;
}
