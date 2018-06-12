package com.zfspace.providerticket.controller;

import com.zfspace.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZF
 * @description
 * @date 2018-06-12 17:22
 */
@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/ticket")
    public String getTicket() {
        System.out.println("8002");
        return ticketService.getTicket();
    }
}
