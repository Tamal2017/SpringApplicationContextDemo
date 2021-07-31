package pp;

public class Emp {
	
	private String empId;
	private String empName;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Emp() {
		System.out.println("The constructor is called !");
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}

}
