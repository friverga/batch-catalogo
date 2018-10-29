package com.frg.springbatch.login;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Contains the information of authorization and login.
 *
 * @author Fran Rivera
 */
@XmlRootElement(name="login")
public class LoginDTO {

    private String res;
    private String guid;


    public LoginDTO() {}

    public String getRes() {
        return res;
    }

    public String getGuid() {
        return guid;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("emailAddress", this.res)
                .append("name", this.guid)
                .toString();
    }
}
