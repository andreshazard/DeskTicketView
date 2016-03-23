package com.hazard.factorys;

import com.hazard.desk_ticket.Entry;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Creates InputStream for the DeskTicket and its components
 */
@Service
public class InputStreamFactory {
    private String linkForAPI;
    private Entry ticket;
    private static final Logger LOGGER = Logger.getLogger(InputStreamFactory.class.getName());

    public InputStreamFactory(String linkForAPI, Entry ticket) {
        //constructor for the components of the desk ticket
        this.linkForAPI = linkForAPI;
        this.ticket = ticket;
    }

    public InputStreamFactory(String linkForAPI) {
        //constructor for desk ticket
        this.linkForAPI = linkForAPI;
        this.ticket = null;
    }

    public InputStreamFactory() {
        //constructor empty for @service
    }

    public void setLinkForAPI(String linkForAPI) {
        this.linkForAPI = linkForAPI;
    }

    public final InputStream getInputStream() throws IOException {
        String apiUrl;
        if (ticket != null) {
            apiUrl = "https://servicerocket.desk.com" + this.linkForAPI;

        }else {
            apiUrl = linkForAPI;
        }
        URL url = new URL(apiUrl);
        URLConnection urlConnection = url.openConnection();
        ArrayList<String> credentials = getCredentials();
        String username = credentials.get(0);
        String password = credentials.get(1);
        String userpass = username + ":" + password;
        String basicAuth = "Basic " + new String(new Base64().encode(userpass.getBytes()));
        urlConnection.setRequestProperty ("Authorization", basicAuth);
        InputStream inputStream = urlConnection.getInputStream();
        return inputStream;
    }

    private ArrayList<String> getCredentials() {
        Scanner s = null;
        try {
            s = new Scanner(new File("credentials"));
        } catch (FileNotFoundException e) {
            LOGGER.log(Level.SEVERE, "Check if credentials file is present", e);
        }
        ArrayList<String> credentials = new ArrayList<String>();
        while (s.hasNext()){
            credentials.add(s.next());
        }
        s.close();
        return credentials;
    }
}
