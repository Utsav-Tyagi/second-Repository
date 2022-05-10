package com.cg.collections;

import java.util.Comparator;

public class SortProductName implements Comparator<Product> {

 
		public   int compare(Product p1, Product p2) {
			
			if(p1.getProdName().compareTo(p2.getProdName())>=1)
				return 1;
			else
				return -1;
			// TODO Auto-generated method stub

		}
		// TODO Auto-generated method stub

 

}
