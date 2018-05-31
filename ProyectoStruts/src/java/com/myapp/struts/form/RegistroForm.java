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
public class RegistroForm extends org.apache.struts.action.ActionForm {
    
     private String Email, ConfEm, Pass, ConfPass, Nombre, Apellidos, DNI, IBAN;
    private String[] letras={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getConfEm() {
        return ConfEm;
    }

    public void setConfEm(String ConfEmail) {
        this.ConfEm = ConfEmail;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getConfPass() {
        return ConfPass;
    }

    public void setConfPass(String ConfPass) {
        this.ConfPass = ConfPass;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    /**
     *
     */
    public RegistroForm() {
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
        if (Email == null || Email.length() <= 0 || !Email.matches("[a-zA-Z0-9\\-\\_]{4,20}\\@[a-zA-Z]{3,10}\\.[a-zA-Z]{2,3}"))
        {
            errors.add("error.registro.Email", new ActionMessage("error.registro.Email"));
        }
        if (ConfEm == null || !ConfEm.equals(Email) || ConfEm=="")
        {
            errors.add("error.registro.confEmail", new ActionMessage("error.registro.confEmail"));
        }
        if (Pass == null || !Pass.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")) errors.add("error.registro.Pass", new ActionMessage("error.registro.Pass"));
        if (ConfPass == null || !ConfPass.equals(Pass) || ConfPass=="")
        {
            errors.add("error.registro.confPass", new ActionMessage("error.registro.confPass"));
        }
        if (Nombre == null || !Nombre.matches("[A-Za-z]{3,9}"))
        {
            errors.add("error.registro.nombre", new ActionMessage("error.registro.nombre"));
        }
        if (Apellidos == null || !Apellidos.matches("[A-Za-z]{3,9}")) errors.add("error.registro.apellidos", new ActionMessage("error.registro.apellidos"));
        if (DNI == null || DNI.length()==0 || DNI.length()<9 || !comprobarDNI(DNI)) errors.add("error.registro.DNI", new ActionMessage("error.registro.DNI"));
        //if (IBAN == null || !comprobarIBAN(IBAN)) errors.add("error.registro.IBAN", new ActionMessage("error.registro.IBAN"));
        return errors;
    }
    
    private boolean comprobarDNI(String DNI) {
        boolean retur;

        String sinletra = DNI.substring(0,8);
        int calculo = Integer.parseInt(sinletra)%23;
        String letra = DNI.substring(8,9);
        String letraB = letras[calculo];
        if(letra.toUpperCase().equals(letraB.toUpperCase()))
            {
                retur = true;
            }
        else
        {
            retur = false;
        }
        return retur;
    }

    /*private boolean comprobarIBAN(String IBAN) {
        boolean retur=false;
        if(IBAN.matches("(ES)[0-9]{2}[ ]{1}[0-9]{4}[ ]{1}[0-9]{4}[ ]{1}[0-9]{4}[ ]{1}[0-9]{4}[ ]{1}[0-9]{4}"))
        {
            retur=true;
        }
        else
        {
            retur=false;
        }
        return retur;
    }*/
}
