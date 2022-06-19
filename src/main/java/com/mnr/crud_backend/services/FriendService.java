package com.mnr.crud_backend.services;

import com.mnr.crud_backend.entities.Friend;
import com.mnr.crud_backend.repositories.FrienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //intermediaire entre data et database
public class FriendService  {

    @Autowired
    private FrienRepository frienRepository;

    public List<Friend> getFriends(){
        return frienRepository.findAll();
    }

    public void  addFriend(Friend friend){
        frienRepository.save(friend);
    }

    public void saveFriend(Friend friend){
        frienRepository.save(friend);
    }
    public void deleteFriend(Long id){
        frienRepository.deleteById(id);
    }

}
