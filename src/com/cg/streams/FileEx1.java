package com.cg.streams;

import java.io.File;
import java.sql.Date;

public class FileEx1 {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\HP\\Desktop\\tagsk.txt");
		System.out.println("Is it a Folder ?" +file.isDirectory());
		System.out.println("IS it a File ?"+ file.isFile());
		System.out.println("Is it a Hidden File ?"+ file.isHidden());
		long lastModified =file.lastModified();
		Date d=new Date(lastModified);
		System.out.println("Last Modified is  "+ d);
		long filesize=file.length();
		System.out.println("file size in bytes " +filesize);
	}

}
