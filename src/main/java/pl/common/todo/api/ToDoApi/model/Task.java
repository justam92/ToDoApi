package pl.common.todo.api.ToDoApi.model;

public class Task {
	
	private Integer ID;
	
	private String name;
	
	private Integer deadline;
	
	private Integer dateOfInsertion;
	
	private Integer updateDate;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDeadline() {
		return deadline;
	}

	public void setDeadline(Integer deadline) {
		this.deadline = deadline;
	}

	public Integer getDateOfInsertion() {
		return dateOfInsertion;
	}

	public void setDateOfInsertion(Integer dateOfInsertion) {
		this.dateOfInsertion = dateOfInsertion;
	}

	public Integer getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Integer updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Task [ID=" + ID + ", name=" + name + ", deadline=" + deadline + ", dateOfInsertion=" + dateOfInsertion
				+ ", updateDate=" + updateDate + "]";
	}
}
