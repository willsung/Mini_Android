package com.willsung.drawerlayout;

import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
   
import android.content.Context;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;  
import android.widget.BaseAdapter;  
import android.widget.TextView;  
   
public class MenuListViewAdapter extends BaseAdapter { 
	
	//定义一个列表List，用来存储HashMap，HashMap中的key是String，value也是String
    private List<HashMap<String, String>> lists;  
    
    //Inflater用来调用xml布局文件，但是调用的布局文件是隐藏的
    private LayoutInflater mInflater;  
    
    //定义适配器，将List对象映射到View中并显示出来
    public MenuListViewAdapter(Context context, List<HashMap<String, String>> dataList) {  
        //从Context中获得一个布局填充器，这样就可以使用这个填充器来把xml布局文件转为View对象
    	mInflater = LayoutInflater.from(context);  
        lists = dataList;  
    }  
   
    @Override 
    public int getCount() {  
        return lists.size();  
    }  
   
    @Override 
    public Object getItem(int position) {  
        return lists.get(position);  
    }  
   
    @Override 
    public long getItemId(int position) {  
        return position;  
    }  
   
    @Override 
public View getView(final int position, View convertView, ViewGroup parent) {  
        
    	//定义一个ViewHolder，用来存储不同View。
    	ViewHolder holder = null;  
        if (convertView == null) {  
            holder = new ViewHolder();  
            //convertView通过inflate调用出需要的布局文件
            convertView = mInflater.inflate(R.layout.main_listitem, null);  
            holder.menu = (TextView) convertView.findViewById(R.id.menu);  
            //setTag()方法是将括号中的数据，也就是View放入ViewHolder
            convertView.setTag(holder);  
        } else {  
        	//getTag()方法是将目标(也就是ViewHolder)中的数据(也就是View)取出来
            holder = (ViewHolder) convertView.getTag();  
        }  
        // 设置背景色  
        //奇数行
        //if(position%2==1){  
        //	convertView.setBackgroundColor(Color.rgb(220, 220, 220));  
        //}
         //偶数行 
        //else {  
        //	convertView.setBackgroundColor(Color.rgb(255, 250, 250));  
        //} 
         
        if (lists.size() > 0) {  //列表不为空
            final Map<String, String> map = lists.get(position);  
            String number = map.get("menu");  
            holder.menu.setText(number);  
        }  
        return convertView;  
    }  
   
    static class ViewHolder {  
        TextView   menu;    //菜单名称  
    }  
}