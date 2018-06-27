package io.amecodelabs.locationservice;

import io.amecodelabs.repository.DataRepository;
import io.amecodelabs.util.Concatenation;

public enum Location {
	ADD("add"),
	DELETE("delete");
	
	private String nameService;
	
	//TODO - Anadir una clase concreta para cada servicio (Pediente)
	public static Service findService(String nameService) {
		System.out.println("Call Service...");
		if (ADD.nameService.equals(nameService)) {
			return (String... param) -> {
				Concatenation concatenation = Concatenation.separateBy("->");
				for(String valueCurrent: param) {
					DataRepository
						.getRepository()
						.addData(valueCurrent);
					concatenation.concat(valueCurrent, "added");
				}
				System.out.println("RESULTADOS:" + concatenation.result());
				return (concatenation.empty()) ?
						"?" :
						concatenation.result();
			};
		}
		
		else if (DELETE.nameService.equals(nameService)) {
			return (String... param) -> {
				Concatenation concatenation = Concatenation.separateBy("->");
				for(String valueCurrent: param) {
					boolean flagRemoved = DataRepository
						.getRepository()
						.deleteData(valueCurrent);
					String result = (flagRemoved) ?  "removed" : "no found";
					concatenation.concat(valueCurrent, result);
				}
				return concatenation.result();
			};
		}
		// Pattern Null Objects
		else {
			return (String... param) -> "Service not found, =P";
		}
	}
	
	private Location(String nameService) {
		this.nameService = nameService;
	}
	
	public String getNameService() {
		return this.nameService;
	}
	
}
