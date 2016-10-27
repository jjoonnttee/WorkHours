package com.jonasmalik94.workhours.View;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.jonasmalik94.workhours.Controller.CalendarAdapter;
import com.jonasmalik94.workhours.Controller.CalendarOnClickListener;
import com.jonasmalik94.workhours.Controller.CalendarOnItemClickListener;
import com.jonasmalik94.workhours.Elements.CalendarElements;
import com.jonasmalik94.workhours.Model.CalendarEngine;
import com.jonasmalik94.workhours.R;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * A placeholder fragment containing a simple view.
 */
public class CalendarFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public CalendarFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static CalendarFragment newInstance(int sectionNumber) {
        CalendarFragment fragment = new CalendarFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        CalendarEngine engine = new CalendarEngine();
        CalendarElements e = CalendarElements.getInstance();
        CalendarOnClickListener clickListener = new CalendarOnClickListener();
        View rootView = inflater.inflate(R.layout.fragment_calender, container, false);
        CalendarOnItemClickListener itemListener = new CalendarOnItemClickListener(getContext());
        ArrayList<String> items = new ArrayList();
        int counter = 0;

        while (counter<engine.getCountOfDays(engine.getYear(),engine.getMonthNumber())){
            items.add(Integer.toString(counter+1));
            counter++;
        }

        TextView month = (TextView) rootView.findViewById(R.id.month);
        final GridView calendar = (GridView) rootView.findViewById(R.id.calender);
        Button left = (Button) rootView.findViewById(R.id.left);
        Button right = (Button) rootView.findViewById(R.id.right);
        TextView infoHeader = (TextView) rootView.findViewById(R.id.info_header);

        calendar.setAdapter(new CalendarAdapter(getContext(),items, engine.getMonthNumber()));
        left.setOnClickListener(clickListener);
        right.setOnClickListener(clickListener);
        month.setText(engine.getMonthName(engine.getMonthNumber())+" "+engine.getYear());
        calendar.setOnItemClickListener(itemListener);

        e.setInfoHeader(infoHeader);
        e.setCalendar(calendar);
        e.setMonth(month);
        e.setLeft(left);
        e.setRight(right);


        return rootView;
    }
}