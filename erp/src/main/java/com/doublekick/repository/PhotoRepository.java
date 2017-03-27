package com.doublekick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doublekick.entity.academy.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo,  Integer>{

}
