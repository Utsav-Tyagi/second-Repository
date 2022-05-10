package com.cg.musicComparator;

import java.util.ArrayList;
import java.util.Collections;

public class music {

	public static void main(String[] args) {
		Album p1=new Album(111, "Hip Hop ", "abc", 2017, 4.6f);
	        
		Album p2=new Album(222, "EDM ", "abc", 2020, 8.6f);
	       
		Album p3=new Album(333, "Rock ", "abc", 2015, 6.6f);
	        
		Album p4=new Album(444, "Classic ", "abc", 2021, 3.6f);
	        
		Album p5=new Album(555, "Jazz ", "abc", 2004, 3.4f);
	        
	        ArrayList<Album> musicList=new ArrayList<Album>();	
	        musicList.add(p1);
	        musicList.add(p2);
	        musicList.add(p3);
	        musicList.add(p4);
	        musicList.add(p5);
	        
	        for(Album p: musicList) {
	          	 System.out.println(p);
	          }
	           System.out.println("");
	           System.out.println("ArrayList  After sorted based on year  is");
	           System.out.println("");
	           Collections.sort(musicList);
	           for(Album p: musicList) {
	             	 System.out.println(p);
	             }
	           
	           
//	           System.out.println("");
//	           System.out.println("ArrayList  After sorted based on rating  is");
//	           System.out.println("");
//	           Collections.sort(musicList);
//	           for(Album o: musicList) {
//	             	 System.out.println(o);
//	             }
//	           
	           
	           
		// TODO Auto-generated method stub

	}

}
