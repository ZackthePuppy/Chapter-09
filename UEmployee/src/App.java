public class App {

    static PrintBoxes design = new PrintBoxes();


    public static void Lines(){
        for (int x=0; x<=50; x++){
            System.out.print("==");
        }
        System.out.println();
    }


    public static void main(String[] args) throws Exception {
        Faculty fac = new Faculty();
        Staff staf = new Staff();
        UEmployee ue = new UEmployee();
        UEmployee fac2 = fac;
        UEmployee staf2 = staf;

        String format = "%-25s %-25s %20s";

        fac.setEmployeeName("1miliiion");
        fac2.getDescription("gago");
        staf2.getDescription("gago");

        // Staff staff = new Staff("Aubrey Rose Cordero", "$45,000", "Associate QA Dev");
        // Staff staff1 = new Staff("John Russel Sauli", "$145,000", "Junior Developer");
        // Faculty faculty1 = new Faculty("Mayk Lemuel Chan", "$46,000", "Information Technology");
        // Faculty faculty2 = new Faculty("Jayperson Babaran", "$51,000", "Information Technology");
        // Faculty faculty3 = new Faculty("Joshua Nino Salimbao", "$69,000", "Information Technology");
    
        Lines();
        design.printBox("LIST OF EMPLOYEES");

        System.out.format(format, "NAME", "JOB TITLE", "SALARY" + "\n");
        // System.out.format(format, staff.getEmployeeName(), staff.getJobTitle(), staff.getSalary() + "\n");
        // System.out.format(format, staff1.getEmployeeName(), staff1.getJobTitle(), staff1.getSalary() + "\n");

        // Lines();
        // System.out.format(format, "NAME", "DEPARTMENT NAME", "SALARY" + "\n");
        // System.out.format(format, faculty1.getEmployeeName(), faculty1.getDepartmentName(), faculty1.getSalary() + "\n");
        // System.out.format(format, faculty2.getEmployeeName(), faculty2.getDepartmentName(), faculty2.getSalary() + "\n");
        // System.out.format(format, faculty3.getEmployeeName(), faculty3.getDepartmentName(), faculty3.getSalary() + "\n");
        Lines();

        System.out.println(fac.getDepartmentName());
        System.out.println(staf.getJobTitle());
        System.out.println(fac.getEmployeeName());
    }
}
