package com.userlocation.User_location.service.impl;

import com.userlocation.User_location.entity.user_location;
import com.userlocation.User_location.repository.user_locationRepository;
import com.userlocation.User_location.service.user_locationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class user_locationServiceImpl implements user_locationService{
    @Autowired
    private user_locationRepository User_locationRepository;


    @Override
    public List<user_location> get_users() {
        return  (List<user_location>) User_locationRepository.findAll();
    }

    @Override
    public user_location get_usersById(long id) {
        return  User_locationRepository.findById(id).orElse(null);
    }

    @Override
    public user_location update_data(user_location User_location) {

        return User_locationRepository.save(User_location);
    }
}
