package com.example.zoostore.services.IMPL;

import com.example.zoostore.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagServiceIMPL {
    @Autowired
    private TagRepository tagRepository;
}
