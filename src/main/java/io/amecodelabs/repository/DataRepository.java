package io.amecodelabs.repository;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

	private static DataRepository dataRepository;
	private List<String> dataList;
	
	public static synchronized DataRepository getRepository() {
		if(dataRepository == null)
			return dataRepository = new DataRepository();
		return dataRepository;
	}
	
	private DataRepository() {
		this.dataList = new ArrayList<>();
	}
	
	public synchronized void addData(String data) {
		dataList.add(data);
	}
	
	public synchronized boolean deleteData(String data) {
		return dataList.remove(data);
	}
	
	public List<String> getData() {
		return this.dataList;
	}
	
}
