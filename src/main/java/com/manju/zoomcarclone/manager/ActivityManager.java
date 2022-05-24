package com.manju.zoomcarclone.manager;

import com.manju.zoomcarclone.models.Activity;

public interface ActivityManager {
    public void pickUpCar(Activity activity);
    public void returnCar(Activity activity);
    public Activity getActivityById(String id);
}
