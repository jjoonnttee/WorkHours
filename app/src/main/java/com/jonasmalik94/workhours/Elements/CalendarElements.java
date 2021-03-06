package com.jonasmalik94.workhours.Elements;

import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * Created by jonas on 2016-10-15.
 */

public class CalendarElements {

    private static CalendarElements instance = null;
    private CalendarElements() {}

    public static synchronized CalendarElements getInstance() {
        if (instance == null) instance = new CalendarElements();
        return instance;
    }

    private GridView calendar;
    private TextView month;
    private TextView infoHeader;
    private TextView infoHoursWorked;
    private TextView daysTotal;
    private TextView hoursTotal;
    private Button left;
    private Button right;
    private Button cell;

    public GridView getCalendar() {
        return calendar;
    }
    public void setCalendar(GridView calendar) {
        this.calendar = calendar;
    }
    public TextView getMonth() {
        return month;
    }
    public void setMonth(TextView month) {
        this.month = month;
    }
    public Button getLeft() {
        return left;
    }
    public void setLeft(Button left) {
        this.left = left;
    }
    public Button getRight() {
        return right;
    }
    public void setRight(Button right) {
        this.right = right;
    }
    public TextView getInfoHeader() {
        return infoHeader;
    }
    public void setInfoHeader(TextView infoHeader) {
        this.infoHeader = infoHeader;
    }
    public TextView getInfoHoursWorked() {
        return infoHoursWorked;
    }
    public void setInfoHoursWorked(TextView infoHoursWorked) {
        this.infoHoursWorked = infoHoursWorked;
    }
    public TextView getDaysTotal() {
        return daysTotal;
    }
    public void setDaysTotal(TextView daysTotal) {
        this.daysTotal = daysTotal;
    }
    public TextView getHoursTotal() {
        return hoursTotal;
    }
    public void setHoursTotal(TextView hoursTotal) {
        this.hoursTotal = hoursTotal;
    }
    public Button getCell() {
        return cell;
    }
    public void setCell(Button cell) {
        this.cell = cell;
    }
}
