/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Manuel
 */
public class LoginForm extends org.apache.struts.action.ActionForm {
    
    private String email, pass;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    

    /**
     *
     */
    public LoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
         if (email == null || email.length() <= 0 || !email.matches("[a-zA-Z0-9\\-\\_]{4,20}\\@[a-zA-Z]{3,10}\\.[a-zA-Z]{2,3}")) {
            errors.add("error.login.email", new ActionMessage("error.login.email"));
        }
        if (pass == null || pass.length() <= 0) {
            errors.add("error.login.pass", new ActionMessage("error.login.pass"));
        }
        return errors;
    }
}
