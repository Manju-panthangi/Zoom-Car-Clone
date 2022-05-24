package com.manju.zoomcarclone.dao;

import com.manju.zoomcarclone.models.Activity;

public interface ActivityDAO {
    public void pickUpCar(Activity activity);
    public void returnCar(Activity activity);
    public Activity getActivityById(String id);
}
