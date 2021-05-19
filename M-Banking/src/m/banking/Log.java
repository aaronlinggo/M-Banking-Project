/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.banking;

import java.io.Serializable;

/**
 *
 * @author LINGGO
 */
public class Log implements Serializable{
    private String log;

    public Log(String log) {
        this.log = log;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
