package com.custom.exception.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.custom.exception.Repositiory.userRepo;
import com.custom.exception.entity.user;
import com.custom.exception.usernotfound.userexception;

@Service
public class userservice {
    @Autowired
	private userRepo userrepo;
    public user findUserByUsername(String username) {
        user ur = userrepo.findByUsername(username);
        if (ur == null) {
            throw new userexception("User not found : " + username);
        }
        return ur;
    }
}
