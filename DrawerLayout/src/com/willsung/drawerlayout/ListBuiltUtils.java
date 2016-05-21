package com.willsung.drawerlayout;

import java.util.ArrayList;  
import java.util.HashMap;
   
public class ListBuiltUtils {  
   
	//抽屉中选项行数：
    public static ArrayList<HashMap<String,String>> getMainMapList(){  
        ArrayList<HashMap<String, String>> tempMapList = new ArrayList<HashMap<String,String>>();  
           
        for(int i=0;i<3;i++){  
            HashMap<String, String> tempMap = new HashMap<String, String>();  
            tempMap.put("menu", "抽屉菜单 "+(i+1));  
            tempMapList.add(tempMap);  
        }  
        return tempMapList;  
    }  
    
    //抽屉每一项调用出的页面中选项行数：
    public static ArrayList<HashMap<String,String>> getSubMapList(int n){  
        ArrayList<HashMap<String, String>> tempMapList = new ArrayList<HashMap<String,String>>();  
           
        for(int i=0;i<n;i++){  
            HashMap<String, String> tempMap = new HashMap<String, String>();  
            tempMap.put("menu", "选项 "+(i+1));  
            tempMapList.add(tempMap);  
        }  
        return tempMapList;  
    }
}
