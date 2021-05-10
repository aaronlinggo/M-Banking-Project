/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.banking;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author LINGGO
 */
public class DateBankRut implements Serializable{
    Date d1;

    public DateBankRut(Date d1) {
        this.d1 = d1;
    }
    
    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }
    
}
