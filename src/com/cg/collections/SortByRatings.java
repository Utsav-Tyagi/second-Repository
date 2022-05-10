package com.cg.collections;

import java.util.Comparator;

public class SortByRatings implements Comparator<Product>{

	public   int compare(Product p1, Product p2) {
		
		if(p1.getRating()<p2.getRating())
			return 1;
		else
			return -1;
		// TODO Auto-generated method stub

	}

 

}
