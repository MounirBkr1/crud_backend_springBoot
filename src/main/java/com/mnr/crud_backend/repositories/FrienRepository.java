package com.mnr.crud_backend.repositories;

import com.mnr.crud_backend.entities.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrienRepository  extends JpaRepository <Friend,Long>{
}
