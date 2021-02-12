
public class Current {
	private String companyName, typeOfBusiness, website, contactName;

	public Current(String companyName, String typeOfBusiness, String website, String contactName) {
		super();
		this.companyName = companyName;
		this.typeOfBusiness = typeOfBusiness;
		this.website = website;
		this.contactName = contactName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTypeOfBusiness() {
		return typeOfBusiness;
	}

	public void setTypeOfBusiness(String typeOfBusiness) {
		this.typeOfBusiness = typeOfBusiness;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public boolean equals(Current current) {
		if (this.companyName.length() != current.getCompanyName().length()
				|| this.typeOfBusiness.length() != current.getTypeOfBusiness().length()
				|| this.website.length() != current.getWebsite().length()
				|| this.contactName.length() != current.getContactName().length()) {
			return false;
		}
		else
		{
			for(int i=0;i<this.companyName.length();i++)
			{
				if(this.companyName.charAt(i)!=current.getCompanyName().charAt(i))
				{
					return false;
				}
			}
			for(int i=0;i<this.contactName.length();i++)
			{
				if(this.contactName.charAt(i) != current.getContactName().charAt(i))
				{
					return false;
				}
			}
			for(int i=0;i<this.website.length();i++)
			{
				if(this.website.charAt(i)!=current.getWebsite().charAt(i))
				{
					return false;
				}
			}
			for(int i=0;i<this.typeOfBusiness.length();i++)
			{
				if(this.typeOfBusiness.charAt(i)!=current.getTypeOfBusiness().charAt(i))
				{
					return false;
				}
			}
		}

		return true;
	}
}
