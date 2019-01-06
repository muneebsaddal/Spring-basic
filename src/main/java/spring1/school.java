package spring1;

import java.util.Date;

public class school {
	
	private String CompanyName;
	private Date CompanyCreationDate;
	private String NumberOfEmployee;
	
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public Date getCompanyCreationDate() {
		return CompanyCreationDate;
	}
	public void setCompanyCreationDate(Date companyCreationDate) {
		CompanyCreationDate = companyCreationDate;
	}
	public String getNumberOfEmployee() {
		return NumberOfEmployee;
	}
	public void setNumberOfEmployee(String numberOfEmployee) {
		NumberOfEmployee = numberOfEmployee;
	}
	@Override
	public String toString() {
		return "school [CompanyName=" + getCompanyName() + ", CompanyCreationDate=" + getCompanyCreationDate() 
				+ ", NumberOfEmployee=" + getNumberOfEmployee() + "]";
	}	
}
