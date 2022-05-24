package com.manju.zoomcarclone.manager.impl;

import com.manju.zoomcarclone.dao.ActivityDAO;
import com.manju.zoomcarclone.manager.ActivityManager;
import com.manju.zoomcarclone.models.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityManagerImpl implements ActivityManager {
    @Autowired
    private ActivityDAO activityDAO;
    @Override
    public void pickUpCar(Activity activity) {
        activityDAO.pickUpCar(activity);
    }

    @Override
    public void returnCar(Activity activity) {
        activityDAO.returnCar(activity);
    }

    @Override
    public Activity getActivityById(String id) {
        return activityDAO.getActivityById(id);
    }
}
