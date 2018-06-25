package com.example.jannikokan.timetable.Table;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.jannikokan.timetable.R;

public class TimeTableFragment extends Fragment {
    private static final String TAG = "TimeTableFragment";

        TableLayout myTL;
        RelativeLayout myRLMontag1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_timetable, container ,false);
        myTL = view.findViewById(R.id.tableLayoutTage);
        myRLMontag1 = view.findViewById(R.id.montag1);

        
        
        
        
        myRLMontag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: button montag 1 gepresst");
            }
        });
        


        return view;
    }
}

