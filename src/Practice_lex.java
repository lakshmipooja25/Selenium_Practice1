import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice_lex {

		
	    @Test(priority=1)
	    @Parameters({"laksh","laksh1","laksh2"})
	    public void login(String name1, String name2, String name3) 
	    {
	        System.out.println(name1);
	    }
	   // @Test(dependsOnMethods= "login")
	    public void dashboard()
	    {
	        System.out.println("Dashboard Page");
	    }
	  // @Test(dependsOnMethods= { "dashboard"})
	    public void logout() 
	    {
	        System.out.println("Logout from the application");
	    }
	

}
