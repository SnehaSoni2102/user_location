package com.userlocation.User_location.service;

import com.userlocation.User_location.entity.user_location;

import java.util.List;

public interface user_locationService {
    public List<user_location>  get_users();
    public user_location get_usersById(long id);

    public user_location update_data(user_location User_location);

}
