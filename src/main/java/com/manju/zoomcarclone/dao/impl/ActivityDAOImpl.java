package com.manju.zoomcarclone.dao.impl;

import com.manju.zoomcarclone.dao.ActivityDAO;
import com.manju.zoomcarclone.models.Activity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ActivityDAOImpl implements ActivityDAO {

    private Map<String,Activity> activityIdVsActivity = new HashMap<>();
    @Override
    public void pickUpCar(Activity activity) {
        activityIdVsActivity.put(activity.getActivityId(),activity);
    }

    @Override
    public void returnCar(Activity activity) {
        activityIdVsActivity.put(activity.getActivityId(), activity);
    }

    @Override
    public Activity getActivityById(String id) {
        if(activityIdVsActivity.containsKey(id)){
            return activityIdVsActivity.get(id);
        }
        return null;
    }
}
