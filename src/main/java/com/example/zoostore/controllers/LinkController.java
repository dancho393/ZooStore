package com.example.zoostore.controllers;

import com.example.zoostore.services.IMPL.LinkServiceIMPL;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/link")
@RequiredArgsConstructor
public class LinkController {

    private final LinkServiceIMPL linkService;


}
