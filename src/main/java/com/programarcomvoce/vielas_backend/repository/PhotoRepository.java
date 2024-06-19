package com.programarcomvoce.vielas_backend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programarcomvoce.vielas_backend.model.Photo;

public interface PhotoRepository extends JpaRepository<Photo,UUID>{
    
}
