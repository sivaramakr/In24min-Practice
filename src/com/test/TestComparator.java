package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> dataList = new ArrayList<>(25);
       dataList.add(1);
       dataList.add(2);
       dataList.add(3);
       dataList.add(4);
       dataList.add(5);
       dataList.add(6);
       dataList.add(7);
       dataList.add(8);
       dataList.add(9);
       dataList.add(10);
       
       
      System.out.println(Arrays.asList(dataList,dataList));
       
       Comparator<Integer> c1 = (i1,i2)-> {
    	   if(i1==i2)return 0;
    	   else if(i1<i2) return 1;
    	   else return -1;
       };
      
    
        Collections.sort(dataList, c1);
      
	System.out.println(Arrays.asList(dataList,dataList));
    
	}

}
	
	


