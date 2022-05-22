package com.manju.zoomcarclone.controllers;

import com.manju.zoomcarclone.views.ActivityVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @PostMapping("/pickUp")
    void pickUpCar(@RequestBody ActivityVO activity){

    }

    @PostMapping("/return")
    void returnCar(@RequestBody ActivityVO activity){

    }

}
