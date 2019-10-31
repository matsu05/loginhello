package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.LoginForm;

public class LoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) {

		LoginForm lf = (LoginForm) form;
		String name = lf.getName();
		String pass = lf.getPass();

		req.setAttribute("name", name);

		if ("test".equals(name) && "test".equals(pass)) {
			return (mapping.findForward("success"));
		} else {
			return (mapping.findForward("fail"));
		}
	}
}