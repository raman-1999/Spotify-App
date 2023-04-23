package com.example.challenge.service;

import com.example.challenge.domain.Track;
import com.example.challenge.domain.UserDomain;
import com.example.challenge.exception.UserAlreadyExistsException;
import com.example.challenge.exception.UserNotFoundException;

import java.util.List;

public interface IUserService {
    UserDomain addUser(UserDomain user) throws UserAlreadyExistsException;
    UserDomain addTrackForUser(String email, Track track) throws UserNotFoundException;
    List<Track> getAllTracksForUser(String email);
    boolean deleteTrackForUser(String email,String trackName);
    List<UserDomain> getAllUsers();
    UserDomain getUserByEmail(String email) throws UserNotFoundException;
//    public UserDomain deleteTrackFromUser(String userId,int trackId) throws UserNotFoundException, TrackNotFoundException;
//    List<Track> getTrackForUser(String userId) throws UserNotFoundException;
//    UserDomain updateTrackForUser(String userId,Track track) throws UserNotFoundException;
}
