package jacksonseralization;

public class Project {
	String projectName;
	String projectId;
	String status;
	String teamsize;
	
	public Project(String projectName, String projectId, String status, String teamsize) {
		super();
		this.projectName = projectName;
		this.projectId = projectId;
		this.status = status;
		this.teamsize = teamsize;
	}
	
	public Project() {
		
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(String teamsize) {
		this.teamsize = teamsize;
	}
	
	

}
