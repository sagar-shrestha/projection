package com.sagar.projection.service;

import com.sagar.projection.entity.TicketImage;
import com.sagar.projection.helper.TicketImageHelper;
import com.sagar.projection.repository.TicketImageRepository;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class TicketImageServiceImpl implements TicketImageService {

    private final TicketImageRepository ticketImageRepository;
    private final TicketImageHelper ticketImageHelper;

    @Override
    public void saveTicketImage(TicketImage ticketImage) {
         ticketImageRepository.save(ticketImage);
    }

    @Override
    public void getTicketImageById(int imageId, HttpServletResponse httpServletResponse) throws IOException {
        ticketImageHelper.getTicketImageById(imageId, httpServletResponse);
    }
}
