class Postoffice {
    private int postOfficeId;
    private String postOfficeName;
    private String postOfficeAddress;
    private String postalCode;
    private String managerName;
    private int numberOfEmployees;
    

    // Setter and Getter methods
	public void setPostOfficeId(int postOfficeId) {
        this.postOfficeId = postOfficeId;
    }
    public int getPostOfficeId() {
        return postOfficeId;
    }
	
	 public void setPostOfficeName(String postOfficeName) {
        this.postOfficeName = postOfficeName;
    }
    public String getPostOfficeName() {
        return postOfficeName;
    }

   public void setPostOfficeAddress(String postOfficeAddress) {
        this.postOfficeAddress = postOfficeAddress;
    }
    public String getPostOfficeAddress() {
        return postOfficeAddress;
    }

      public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }
	
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    public String getManagerName() {
        return managerName;
    }

    
     public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    
}