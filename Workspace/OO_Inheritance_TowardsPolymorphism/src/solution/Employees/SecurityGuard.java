package Solution.Employees;

public class SecurityGuard extends SkilledWorker {
	
	public SecurityGuard(String name, String jobTitle) {
		super(name, jobTitle);
	}

	private boolean prefersNightWork;

	public String getPrefersNightWork() {
		return (prefersNightWork) ? "Night" : "Day";
	}

	public void setPrefersNightWork(boolean prefersNightWork) {
		this.prefersNightWork = prefersNightWork;
	}

	public void showInfo() {
		super.showInfo();
		System.out.printf("\t- Prefers %s work\n" , getPrefersNightWork());
	}
}
