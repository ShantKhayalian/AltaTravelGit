package com.example.demo.repository;

import com.example.demo.model.AboutUs;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AboutUsRepository extends MongoRepository<AboutUs,Long> {
}
