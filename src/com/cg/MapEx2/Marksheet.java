package com.cg.MapEx2;

 

public class Marksheet {

	float eng;
	float science;
	float maths;
	public float getEng() {
		return eng;
	}
	public void setEng(float eng) {
		this.eng = eng;
	}
	public float getScience() {
		return science;
	}
	public void setScience(float science) {
		this.science = science;
	}
	public float getMaths() {
		return maths;
	}
	public void setMaths(float maths) {
		this.maths = maths;
	}
	@Override
	public String toString() {
		return "Marksheet [eng=" + eng + ", science=" + science + ", maths=" + maths + "]";
	}
	public Marksheet(float eng, float science, float maths) {
		super();
		this.eng = eng;
		this.science = science;
		this.maths = maths;
	}
	
 
	
}
