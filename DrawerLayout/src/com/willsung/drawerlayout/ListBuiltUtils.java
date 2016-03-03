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
    public static ArrayList<HashMap<String,String>> getFirstMapList(){  
        ArrayList<HashMap<String, String>> tempMapList = new ArrayList<HashMap<String,String>>();  
           
        for(int i=0;i<2;i++){  
            HashMap<String, String> tempMap = new HashMap<String, String>();  
            tempMap.put("menu", "FirstFragment选项 "+(i+1));  
            tempMapList.add(tempMap);  
        }  
        return tempMapList;  
    }  
    
    public static ArrayList<HashMap<String,String>> getSecondMapList(){  
        ArrayList<HashMap<String, String>> tempMapList = new ArrayList<HashMap<String,String>>();  
           
        for(int i=0;i<2;i++){  
            HashMap<String, String> tempMap = new HashMap<String, String>();  
            tempMap.put("menu", "SecondFragment菜单  "+(i+1));  
            tempMapList.add(tempMap);  
        }  
        return tempMapList;  
    } 
}
