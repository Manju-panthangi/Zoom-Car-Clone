package com.manju.zoomcarclone.views.mappers;

import com.manju.zoomcarclone.models.Activity;
import com.manju.zoomcarclone.models.ActivityType;
import com.manju.zoomcarclone.views.ActivityVO;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ActivityMapper {
    public Activity fromView(ActivityVO activityVo) throws ParseException {
        Activity activity = new Activity();

        if(activityVo==null){
            return null;
        }

        activity.setReservationId(activityVo.getReservationId());
        activity.setType(ActivityType.valueOf(activityVo.getType()));
        activity.setAccountId(activityVo.getAccountId());

        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

        Date dateTimeStamp = format.parse(activityVo.getDateTimeStamp());

        activity.setTimeStamp(dateTimeStamp);

        return activity;
    }

    public  ActivityVO toView(Activity activity){
        ActivityVO activityVo = new ActivityVO();

        if(activity==null){
            return null;
        }

        activityVo.setReservationId(activity.getReservationId());
        activityVo.setType(activity.getType().toString());
        activityVo.setAccountId(activity.getAccountId());

        SimpleDateFormat formatter = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

        String dateTimeStamp = formatter.format(activity.getTimeStamp());

        activityVo.setDateTimeStamp(dateTimeStamp);

        return activityVo;
    }
}
