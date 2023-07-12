package com.example.zoostore.services.IMPL;

import com.example.zoostore.data.repositories.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceIMPL {
    @Autowired
    private LinkRepository linkRepository;
}
