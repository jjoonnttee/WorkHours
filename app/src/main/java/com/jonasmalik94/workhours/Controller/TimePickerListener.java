package com.jonasmalik94.workhours.Controller;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

import com.jonasmalik94.workhours.DB.FieldHolder;
import com.jonasmalik94.workhours.Elements.NewDayElements;

/**
 * Created by jonas on 2016-10-23.
 */

public class TimePickerListener implements TimePickerDialog.OnTimeSetListener {
    NewDayElements e = NewDayElements.getInstance();
    FieldHolder f = FieldHolder.getInstance();
    int id;

    public TimePickerListener(int id) {
        this.id = id;
    }


    @Override
    public void onTimeSet(TimePicker timePicker, int hours, int minutes) {
        if (e.getStart().getId() == id){
            e.getStart().setText(hours+":"+minutes);
            f.setStart_time(hours+":"+minutes);
        }
        else {
            e.getEnd().setText(hours+":"+minutes);
            f.setEnd_time(hours+":"+minutes);
        }
    }
}
