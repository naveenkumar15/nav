package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends Base {
public Register() {
PageFactory.initElements(driver, this);

}	
@FindBy(xpath="//input[@placeholder='First Name']")
private WebElement txtfirstname;
@FindBy(xpath="//input[@placeholder='Last Name']")
private WebElement txtlastname;
@FindBy(xpath="//textarea[@rows='3']")
private WebElement address;
@FindBy(xpath="//input[@type='email']")
private WebElement Email;
@FindBy(xpath="//input[@type='tel']")
private WebElement Phone;
@FindBy(xpath="//input[@value='Male']")
private WebElement Gender;
@FindBy(id="checkbox2")
private WebElement Hobbies;
@FindBy(id="msdd")
private WebElement Language;
@FindBy(id="firstpassword")
private WebElement Password;
@FindBy(id="secondpassword")
private WebElement ConfrimPwd;
public WebElement getTxtfirstname() {
	return txtfirstname;
}
public void setTxtfirstname(WebElement txtfirstname) {
	this.txtfirstname = txtfirstname;
}
public WebElement getTxtlastname() {
	return txtlastname;
}
public void setTxtlastname(WebElement txtlastname) {
	this.txtlastname = txtlastname;
}
public WebElement getAddress() {
	return address;
}
public void setAddress(WebElement address) {
	this.address = address;
}
public WebElement getEmail() {
	return Email;
}
public void setEmail(WebElement email) {
	Email = email;
}
public WebElement getPhone() {
	return Phone;
}
public void setPhone(WebElement phone) {
	Phone = phone;
}
public WebElement getGender() {
	return Gender;
}
public void setGender(WebElement gender) {
	Gender = gender;
}
public WebElement getHobbies() {
	return Hobbies;
}
public void setHobbies(WebElement hobbies) {
	Hobbies = hobbies;
}
public WebElement getLanguage() {
	return Language;
}
public void setLanguage(WebElement language) {
	Language = language;
}
public WebElement getPassword() {
	return Password;
}
public void setPassword(WebElement password) {
	Password = password;
}
public WebElement getConfrimPwd() {
	return ConfrimPwd;
}
public void setConfrimPwd(WebElement confrimPwd) {
	ConfrimPwd = confrimPwd;
}


}

