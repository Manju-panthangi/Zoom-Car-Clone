package com.manju.zoomcarclone.controllers;

import com.manju.zoomcarclone.models.Activity;
import com.manju.zoomcarclone.services.ActivityService;
import com.manju.zoomcarclone.views.ActivityVO;
import com.manju.zoomcarclone.views.mappers.ActivityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;
    @Autowired
    private ActivityMapper activityMapper;

    @PostMapping("/pickUp")
    public void pickUpCar(@RequestBody ActivityVO activityVo) throws ParseException {
        Activity activity =activityMapper.fromView(activityVo);
        activityService.pickUpCar(activity);
    }

    @PostMapping("/return")
    public void returnCar(@RequestBody ActivityVO activityVo) throws ParseException {
        Activity activity = activityMapper.fromView(activityVo);
        activityService.returnCar(activity);
    }

    @GetMapping("/{id}")
    public Activity getActivityById(@PathVariable String id){
        return activityService.getActivityById(id);
    }

}
