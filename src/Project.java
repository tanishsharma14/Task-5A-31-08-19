
public class Project {

	private int project_code;
	private String project_title;
	private int duration_in_days;
	private String client_name;
	
	public int getProject_code() {
		return project_code;
	}

	public void setProject_code(int project_code) {
		this.project_code = project_code;
	}

	public String getProject_title() {
		return project_title;
	}

	public void setProject_title(String project_title) {
		this.project_title = project_title;
	}

	public int getDuration_in_days() {
		return duration_in_days;
	}

	public void setDuration_in_days(int duration_in_days) {
		this.duration_in_days = duration_in_days;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public Project(int project_code, String project_title,
			int duration_in_days, String client_name) {
		super();
		this.project_code = project_code;
		this.project_title = project_title;
		this.duration_in_days = duration_in_days;
		this.client_name = client_name;
	}

	@Override
	public String toString() {
		return "Project [project_code=" + project_code + ", project_title="
				+ project_title + ", duration_in_days=" + duration_in_days
				+ ", client_name=" + client_name + "]";
	}
	
}
