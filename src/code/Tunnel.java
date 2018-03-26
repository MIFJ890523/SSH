package code;

import com.jcraft.jsch.*;
import java.io.*;

public class Tunnel {

    public String[] userData = new String[5];

    public Session Connection(String[] userData) throws JSchException, IOException {
        this.userData = userData;

        String[] parts = userData[0].split("@");
        String user = parts[0];
        String host = parts[1];

        String[] port = userData[4].split(":");
        String portLocal = port[0];
        String hostRemoto = port[1];
        String portRemoto = port[2];

        JSch jsch = new JSch();
        Session session = jsch.getSession(user, host, Integer.parseInt(userData[1]));

        if (!userData[2].equals("") && userData[3].equals("")) {//pass
            UserInfo ui = new SUserInfo(userData[2], null);
            session.setUserInfo(ui);
            session.setPassword(userData[2]);
        } else if (!userData[3].equals("") && userData[2].equals("")) {//key????
            jsch.addIdentity(userData[3]);
            UserInfo ui = new SUserInfo(null, null);
            session.setUserInfo(ui);
        } else if (!userData[2].equals("") && !userData[3].equals("")) {//key+pass
            jsch.addIdentity(userData[3]);
            UserInfo ui = new SUserInfo(null, userData[2]);
            session.setUserInfo(ui);
        }

        session.connect();
        session.setPortForwardingL(Integer.parseInt(portLocal), hostRemoto, Integer.parseInt(portRemoto));

        System.out.println(session);
        return session;

    }

}
