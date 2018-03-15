package com.example.carlosanguiano.testretrofit;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class UserList{

	@SerializedName("per_page")
	public int perPage;

	@SerializedName("total")
	public int total;

	@SerializedName("data")
	public List<DataItem> data;

	@SerializedName("page")
	public int page;

	@SerializedName("total_pages")
	public int totalPages;

	@Override
 	public String toString(){
		return 
			"UserList{" + 
			"per_page = '" + perPage + '\'' + 
			",total = '" + total + '\'' + 
			",data = '" + data + '\'' + 
			",page = '" + page + '\'' + 
			",total_pages = '" + totalPages + '\'' + 
			"}";
		}
}