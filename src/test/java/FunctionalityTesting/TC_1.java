package FunctionalityTesting;

import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.Pom.CalendarRepo;

public class TC_1 extends BaseClass {
	public static CalendarRepo cr;
	@Test
	public void calender_page() {
		cr=new CalendarRepo(driver);
		cr.calendarTab().click();
		
	}
	
	

}
