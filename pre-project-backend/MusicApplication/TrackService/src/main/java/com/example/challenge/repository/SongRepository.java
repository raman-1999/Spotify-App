package com.example.challenge.repository;

import com.example.challenge.domain.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends MongoRepository<Song,String> {
}
