package task6greensjunitworking;               ///pom framework ---5


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import junitgreenstask8.BaseClassPom;
public class BookingConfirmation5 extends BaseClassPom {
	
public BookingConfirmation5() {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@name='gst']")
private WebElement bookingConfirm;
public WebElement getBookingConfirm() {
	return bookingConfirm;
}
}
