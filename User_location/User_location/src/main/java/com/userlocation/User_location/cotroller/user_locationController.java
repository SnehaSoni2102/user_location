package com.userlocation.User_location.cotroller;

import com.userlocation.User_location.entity.user_location;
import com.userlocation.User_location.service.user_locationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user_location")
public class user_locationController {
    @Autowired
    private user_locationService userLocationService;
    @PostMapping ("/post")
    public ResponseEntity<user_location> create_data(@RequestBody user_location userLocation){
        user_location userLocations=null;
        try{
            userLocations=userLocationService.update_data(userLocation);
        }catch (Exception e){
            e.getMessage();
        }
        return new ResponseEntity<user_location>(userLocations,HttpStatus.OK);
    }
    @GetMapping("/users")
    public ResponseEntity<List<user_location>> get_users(){
        List<user_location> userLocations=null;
        try{
            userLocations=userLocationService.get_users();
        }catch (Exception e){
            e.getMessage();
        }
        return new ResponseEntity<List<user_location>>(userLocations,HttpStatus.OK);
    }
    @GetMapping("/getById{id}")
    public ResponseEntity<user_location> get_userById(@PathVariable("id")long id){
        user_location userLocations=null;
        try{
            userLocations=userLocationService.get_usersById(id);
        }catch (Exception e){
            e.getMessage();
        }
        return new ResponseEntity<user_location>(userLocations,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<user_location> update_data(@RequestBody user_location userLocation){
        user_location userLocations=null;
        try{
            userLocations=userLocationService.update_data(userLocation);
        }catch (Exception e){
            e.getMessage();
        }
        return new ResponseEntity<user_location>(userLocations,HttpStatus.OK);
    }
}
