/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import com.jcraft.jsch.UserInfo;

/**
 *
 * @author jmiranda
 */
public class SUserInfo implements UserInfo {
    
     private final String password;
    private final String passPhrase;

    public SUserInfo (String password, String passPhrase) {
        this.password = password;
        this.passPhrase = passPhrase;
    }
 
     @Override
    public String getPassphrase() {
        return passPhrase;
    }
 
     @Override
    public String getPassword() {
        return password;
    }
 
     @Override
    public boolean promptPassphrase(String arg0) {
        return true;
    }
 
     @Override
    public boolean promptPassword(String arg0) {
        return false;
    }
 
     @Override
    public boolean promptYesNo(String arg0) {
        return true;
    }
 
     @Override
    public void showMessage(String arg0) {
        System.out.println("SUserInfo.showMessage()");
    }
}
