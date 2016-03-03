package com.willsung.drawerlayout;

import android.os.Bundle;  
import android.support.v4.app.Fragment;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;  
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
   
public class SecondFragment extends Fragment{  
    private TextView textView;
    private ListView listView;
    @Override 
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){  
        View layout = inflater.inflate(R.layout.layout_next, null);  
        textView = (TextView) layout.findViewById(R.id.secondtextView);  
        textView.setOnClickListener(new OnClickListener() {  
               
            @Override 
            public void onClick(View arg0) {  
                Toast.makeText(getActivity(), "SecondFragment", Toast.LENGTH_SHORT).show();  
            }  
        });  
        listView = (ListView) layout.findViewById(R.id.secondFragmentListView);  
        MenuListViewAdapter adapter = new MenuListViewAdapter(getActivity(), ListBuiltUtils.getSecondMapList());  
        listView.setAdapter(adapter);  
        return layout;  
    }  
}
