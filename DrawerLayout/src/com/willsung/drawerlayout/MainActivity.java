package com.willsung.drawerlayout;

import java.util.ArrayList;  
import java.util.HashMap;  
   
import android.os.Bundle;  
import android.support.v4.app.Fragment;  
import android.support.v4.app.FragmentActivity;  
import android.support.v4.app.FragmentTransaction;  
import android.support.v4.widget.DrawerLayout;  
import android.view.View;  
import android.widget.AdapterView;  
import android.widget.LinearLayout;  
import android.widget.ListView;  
import android.widget.AdapterView.OnItemClickListener;  
   
/** 
 * ����Ч�� 
 * DrawerLayout��Fragment������ 
 * DrawerLayout��أ� 
 * 1.һ�����ݲ�ʹ��framelayout 
 * 2.slidingLayout��Ҫ����һ��layout_grative���� 
 * �ĵ�����ʹ��android:layout_gravity="start" 
 */ 
public class MainActivity extends FragmentActivity{  
      
    private DrawerLayout mDrawer_layout;  //����ʽ����  
    private LinearLayout mMenu_layout;   
                        
    @Override 
    protected void onCreate(Bundle savedInstanceState){  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
        mDrawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);  
        mMenu_layout = (LinearLayout) findViewById(R.id.menu_layout);  
        ListView menu_listview = (ListView) mMenu_layout.findViewById(R.id.menu_listView);  
        ArrayList<HashMap<String, String>> tempMapList = ListBuiltUtils.getMainMapList();  
        menu_listview.setAdapter(new MenuListViewAdapter( getApplicationContext(), tempMapList));  
        //�˵�ListView���ü����¼�  
        menu_listview.setOnItemClickListener(new DrawerItemClickListener());  
    }  
                        
    public class DrawerItemClickListener implements OnItemClickListener {  
           
        @Override 
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){  
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();  
            Fragment fragment = null;  
            //����item����к��ж�����ָ��Fragment  
            switch (position){  
                case 0:  
                    fragment = new FirstFragment();  
                    break;  
                case 1:  
                    fragment = new SecondFragment();  
                    break;  
                default:  
                     fragment = new ThirdFragment();  
                    break;  
            }  
            ft.replace(R.id.fragment_layout, fragment);  
            ft.commit();  
            mDrawer_layout.closeDrawer(mMenu_layout);//�����ر�mMenu_layout  
        }  
    }  
}
