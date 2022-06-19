package com.mnr.crud_backend.controllers;

import com.mnr.crud_backend.entities.Friend;
import com.mnr.crud_backend.services.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin //allow query from other server
public class FriendController {

    @Autowired
    private FriendService friendService;

    //GET LIST OF FRIENDS
    @GetMapping("/friends")
    public List<Friend> getFriends(){
        return friendService.getFriends();
    }

    //ADD
    @PostMapping("/friends/addNew") //@RequestBody:tell a spring that this friend comme from the request body
    public void addFriend(@RequestBody Friend friends){
        friendService.addFriend(friends);
    }



    //UPDATE
    @PutMapping("/friends/{id}/edit")
    public void editFriend(@PathVariable("id") Integer id, @RequestBody Friend friend) {
        friendService.saveFriend(friend);
    }

    //DELETE
    @DeleteMapping("/friends/{id}/delete")
    public void  deleteFriend(@PathVariable("id") Long id){
        friendService.deleteFriend(id);
    }
}
