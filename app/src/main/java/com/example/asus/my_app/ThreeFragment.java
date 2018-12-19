package com.example.asus.my_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

public class ThreeFragment extends Fragment {
    private ImageButton btn;
    private ImageButton btn1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_three, container, false);

        btn = (ImageButton) view.findViewById(R.id.imageButton5);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast toast = Toast.makeText(getActivity(), "您已预订谢霆锋为您的训练师 !",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.LEFT,250,1000);toast.show();

            }

        });

        btn1 = (ImageButton) view.findViewById(R.id.imageButton6);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast toast = Toast.makeText(getActivity(), "您已预订彭于晏为您的训练师 !",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.LEFT,250,1000);toast.show();


            }

        });

        //return inflater.inflate(R.layout.fragment_two, container, false);
        return view;
    }
}
