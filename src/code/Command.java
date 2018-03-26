package code;

import com.jcraft.jsch.*;
import java.io.*;

public class Command {

    public String[] userData = new String[5];

    //public Command() throws JSchException, IOException {}

    public void Connection(String[] userData) throws IOException, JSchException {
        this.userData = userData;
        
        String[] parts = userData[0].split("@");
        String user = parts[0];
        String host = parts[1];        
        
        JSch jsch = new JSch();
        Session session = jsch.getSession(user, host, Integer.parseInt(userData[1]));
        
        if(!userData[2].equals("") && userData[3].equals("")){//pass
             UserInfo ui = new SUserInfo(userData[2], null);
            session.setUserInfo(ui);
            session.setPassword(userData[2]);
        }
        else if(!userData[3].equals("") && userData[2].equals("")){//key????
            jsch.addIdentity(userData[3]);
            UserInfo ui = new SUserInfo(null, null);
            session.setUserInfo(ui);
        }
        else if(!userData[2].equals("") && !userData[3].equals("")){//key+pass
            jsch.addIdentity(userData[3]);
            UserInfo ui = new SUserInfo(null, userData[2]);
            session.setUserInfo(ui);
        }
        
        session.connect();  
        
        //session.setPortForwardingL(9000, "localhost", 80);
        
        ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
        InputStream inMsj = channelExec.getInputStream();
        InputStream inError = channelExec.getErrStream();

        channelExec.setCommand(userData[4]);
        channelExec.connect();

        BufferedReader msj = new BufferedReader(new InputStreamReader(inMsj));
        BufferedReader error = new BufferedReader(new InputStreamReader(inError));
        
        String linea = null;
        int index = 0;
        
        while (((linea = msj.readLine()) != null) || ((linea = error.readLine()) != null)) {
            System.out.println(++index + " : " + linea);
        }        
     
        channelExec.disconnect();
        session.disconnect();
    }

}
