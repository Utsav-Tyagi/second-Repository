package com.cg.musicComparator;

import com.cg.collections.Product;

public class Album implements Comparable<Album>{
	

	private int id;
	private String albumName;
	private String composer;
	private int yearofRelease;
	private float rating;
	
	public Album(int id, String albumName, String composer, int yearofRelease, float rating) {
		super();
		this.id = id;
		this.albumName = albumName;
		this.composer = composer;
		this.yearofRelease = yearofRelease;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYearofRelease() {
		return yearofRelease;
	}

	public void setYearofRelease(int yearofRelease) {
		this.yearofRelease = yearofRelease;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		return "Album [id=" + id + ", albumName=" + albumName + ", composer=" + composer + ", yearofRelease=" + yearofRelease+ ", rating=" + rating
				+ "]";
	}
	public int compareTo(Album p) {
//		System.out.println("comparing" +this.albumName);
	if(this.yearofRelease<p.yearofRelease) {
		return -1;
	}
	else {
		return 1;
	}
	}
 

}
