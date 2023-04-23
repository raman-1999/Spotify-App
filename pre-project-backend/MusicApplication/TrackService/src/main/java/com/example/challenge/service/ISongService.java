package com.example.challenge.service;

import com.example.challenge.domain.Photo;
import com.example.challenge.domain.Song;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ISongService {

    String post(MultipartFile file,String songName) throws IOException;
    Song get(String id) throws IOException;
    List<Song> getAllSongs();
    String  getSongByName(String songName) throws IOException;

}
