package edu.app.web.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "authBean")
@SessionScoped
public class AuthenticationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private String password;

	public AuthenticationBean() {
		
	}

	public String doLogin() {
        String navigateTo = null;
		
		if (login.equals("admin")&&password.equals("admin")){
			navigateTo = "success";
		}
		else{ 
			navigateTo="failure";
		}
		
		return navigateTo;

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
