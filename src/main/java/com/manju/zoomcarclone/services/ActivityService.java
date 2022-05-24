package com.manju.zoomcarclone.services;

import com.manju.zoomcarclone.models.Activity;

public interface ActivityService {
    public void pickUpCar(Activity activity);
    public void returnCar(Activity activity);
    public Activity getActivityById(String id);
}
