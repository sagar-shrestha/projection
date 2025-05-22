package com.sagar.projection.service;

import com.sagar.projection.entity.TicketImage;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface TicketImageService {

    void saveTicketImage(TicketImage ticketImage);

    void getTicketImageById(int imageId, HttpServletResponse httpServletResponse) throws IOException;
}
