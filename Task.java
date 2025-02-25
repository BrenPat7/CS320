package taskservice;

public class Task {
	private final String TaskId;
	private String name; 
	private String description;
	
	
	
	public Task(String TaskId, String name, String description) {
		if (TaskId == null || TaskId.length() > 10) {
			throw new IllegalArgumentException("Invailid Task id");
		}
		 if (name == null || name.length() > 20) {
	            throw new IllegalArgumentException("Invalid Task name");
	        }
	        if (description == null || description.length() > 50) {
	            throw new IllegalArgumentException("invalid task description");
	        }
	        
	        this.TaskId = TaskId;
	        this.name = name;
	        this.description = description;
	    }
	
	public String getTaskId() {
		return TaskId;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public void setName(String name) {
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid Task name");
		}
		this.name = name;
	}
	public void setDescription(String Description) {
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("invalid Task Desc");
		}
		this.description = description;
	}
	
	
	}

