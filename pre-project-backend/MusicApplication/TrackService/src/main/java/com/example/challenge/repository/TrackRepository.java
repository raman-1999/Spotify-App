package com.example.challenge.repository;

import com.example.challenge.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrackRepository extends MongoRepository<Track,Integer> {
}
