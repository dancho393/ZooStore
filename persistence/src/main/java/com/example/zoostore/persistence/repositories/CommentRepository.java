package com.example.zoostore.persistence.repositories;

import com.example.zoostore.persistence.entities.Comment;
import com.example.zoostore.persistence.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CommentRepository extends JpaRepository<Comment, UUID> {
    List<Comment> findAllByItem(Item item);
}
