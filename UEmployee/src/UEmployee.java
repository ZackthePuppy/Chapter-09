public class UEmployee {
    
    private String employeeName = "";
    private String salary = "";
  
    /**
     * @return String return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @return int return the salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(String salary) {
        this.salary += salary + "\n";
    }


    public void getDescription (String description){
        this.employeeName = description;
    }


}
