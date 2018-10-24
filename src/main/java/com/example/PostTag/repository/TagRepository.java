package com.example.PostTag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PostTag.model.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long>{

}