package com.web.pojo;
// Generated 2019-12-18 21:11:26 by Hibernate Tools 3.4.0.CR1

/**
 * DemoId generated by hbm2java
 */
public class DemoId implements java.io.Serializable {

	private long id;
	private String name;

	public DemoId() {
	}

	public DemoId(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DemoId))
			return false;
		DemoId castOther = (DemoId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}
