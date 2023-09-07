class PostofficeEx {
    public static void main(String post[]) {
        Postoffice postoffice = new Postoffice();
         postoffice.setPostOfficeId(1);
         postoffice.setPostOfficeName("Central Post Office");
         postoffice.setPostOfficeAddress("vidyanagar");
         postoffice.setPostalCode("SCT654");
         postoffice.setManagerName("Akshatha");
         postoffice.setNumberOfEmployees(10);
		 
        System.out.println("Post Office ID: " + postoffice.getPostOfficeId());
        System.out.println("Post Office Name: " + postoffice.getPostOfficeName());
        System.out.println("Post Office Address: " + postoffice.getPostOfficeAddress());
        System.out.println("Postal Code: " + postoffice.getPostalCode());
        System.out.println("Manager Name: " + postoffice.getManagerName());
        System.out.println("Number of Employees: " + postoffice.getNumberOfEmployees());
    }
}