/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author lomatik
 */
@ManagedBean (name="Main") // определение managed bean и его наименования
@SessionScoped
public class LoginJSF {
    private String username;
    private String password;

    public LoginJSF() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String validateUser()
    {
        if(username.equals("admin") && password.equals("123"))
            return "index.jsp?faces-redirect=true";
        else
            return "loginfailed?faces-redirect=true";
    }
}
