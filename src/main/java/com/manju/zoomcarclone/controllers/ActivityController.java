package com.manju.zoomcarclone.controllers;

import com.manju.zoomcarclone.views.ActivityVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @PostMapping("/pickUp/")
    void pickUpCar(@ResponseBody ActivityVO activity){

    }

}