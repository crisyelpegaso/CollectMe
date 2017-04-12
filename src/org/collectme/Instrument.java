package org.collectme;

import java.util.Comparator;

public class Instrument implements Comparable {

	public int id;
	private String name;
	private String description;
	
	public Instrument(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());*/
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		/*if (this.name == "bass") {
				return true;
		}*/
		if (((Instrument) obj).id == this.id) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Object o) {
		return this.getName().compareTo(((Instrument) o).getName());
	}
	
	
}
