package com.example.carlosanguiano.testretrofit;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("last_name")
	public String lastName;

	@SerializedName("id")
	public int id;

	@SerializedName("avatar")
	public String avatar;

	@SerializedName("first_name")
	public String firstName;

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"last_name = '" + lastName + '\'' + 
			",id = '" + id + '\'' + 
			",avatar = '" + avatar + '\'' + 
			",first_name = '" + firstName + '\'' + 
			"}";
		}
}