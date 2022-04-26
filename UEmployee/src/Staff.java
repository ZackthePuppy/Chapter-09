public class Staff extends UEmployee {
    private String jobTitle = "";

    /**
     * @return String return the jobTitle
     */

    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle += jobTitle + "\n";
    }

    @Override
    public void getDescription (String description){
        this.jobTitle = description;
    }
}
