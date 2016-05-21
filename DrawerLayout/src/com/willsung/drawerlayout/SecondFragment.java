package com.willsung.drawerlayout;

import android.os.Bundle;  
import android.support.v4.app.Fragment;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;  
import android.widget.ListView;
   
public class SecondFragment extends Fragment{
    private ListView listView;
    @Override 
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){  
        View layout = inflater.inflate(R.layout.layout_next, null);
        listView = (ListView) layout.findViewById(R.id.secondFragmentListView);  
        MenuListViewAdapter adapter = new MenuListViewAdapter(getActivity(), ListBuiltUtils.getSubMapList(3));  
        listView.setAdapter(adapter);  
        return layout;  
    }  
}
