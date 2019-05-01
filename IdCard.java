
public class IdCard extends Inventory {
	
	private String name;
	private String idNum;
	private int gradYear;
	private int schoolName;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public int getGradYear() {
		return gradYear;
	}
	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}
	public int getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(int schoolName) {
		this.schoolName = schoolName;
	}
	
}
