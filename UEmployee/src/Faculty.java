public class Faculty extends UEmployee {
    private String departmentName;

    

    

    public String getDepartmentName() {
        return departmentName;
    }
    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName += departmentName + "\n";
    }

    @Override
    public void getDescription (String description){
        this.departmentName = description;
    }
    

}
