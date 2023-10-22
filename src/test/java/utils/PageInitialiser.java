package utils;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.EmployeeSearchPage;
import pages.LoginPage;

public class PageInitialiser {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static EmployeeSearchPage employeeSearchPage;
    public static AddEmployeePage addEmployeePage;

    public static void intialisePageObjects(){
        loginPage=new LoginPage();
        dashboardPage=new DashboardPage();
        employeeSearchPage=new EmployeeSearchPage();
        addEmployeePage=new AddEmployeePage();

    }

}
