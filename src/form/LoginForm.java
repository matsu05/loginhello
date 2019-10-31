package form;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm {

	private String name;
	private String pass;

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getPass() { return pass; }
	public void setPass(String pass) { this.pass = pass; }
}