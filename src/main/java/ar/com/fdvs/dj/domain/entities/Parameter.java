package ar.com.fdvs.dj.domain.entities;

public class Parameter implements Entity {
	
	private String name;
	private String className;
	
	public Parameter() {
		super();
	}
	
	public Parameter(String name, String className) {
		super();
		this.name = name;
		this.className = className;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

}
