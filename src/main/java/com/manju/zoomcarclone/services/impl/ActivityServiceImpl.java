package com.manju.zoomcarclone.services.impl;

import com.manju.zoomcarclone.manager.ActivityManager;
import com.manju.zoomcarclone.models.Activity;
import com.manju.zoomcarclone.models.ActivityType;
import com.manju.zoomcarclone.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityManager activityManager;
    @Override
    public void pickUpCar(Activity activity) {
        String activityId = UUID.randomUUID().toString();
        activity.setActivityId(activityId);
        activityManager.pickUpCar(activity);
    }

    @Override
    public void returnCar(Activity activity) {
        String activityId = UUID.randomUUID().toString();
        activity.setActivityId(activityId);
        activityManager.returnCar(activity);
    }

    @Override
    public Activity getActivityById(String id) {
        return activityManager.getActivityById(id);
    }
}
