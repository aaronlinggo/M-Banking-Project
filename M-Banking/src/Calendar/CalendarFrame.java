/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

import com.mindfusion.common.DateTime;
import com.mindfusion.scheduling.Calendar;
import com.mindfusion.scheduling.ThemeType;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LINGGO
 */
public class CalendarFrame extends JFrame {

    Calendar calendar = new Calendar();
    java.util.Calendar selectedDate = java.util.Calendar.getInstance();
    
    protected PropertyChangeSupport changeSupport;
    
    public CalendarFrame(){
        calendar.setFont(new java.awt.Font("Courier New", 0, 18));
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        calendar.setTheme(ThemeType.Light);
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(calendar, BorderLayout.CENTER);
        
        changeSupport = new PropertyChangeSupport(this);
        calendar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                if (e.getClickCount() == 2) {
                    calendar.getSelection().reset();
                    DateTime pointedDate = calendar.getDateAt(e.getX(), e.getY());
                    java.util.Calendar cal = java.util.Calendar.getInstance();
                    cal.set(pointedDate.getYear(), pointedDate.getMonth()-1, pointedDate.getDay());
                    
                    setSelectedDate(cal);
                    
                    dispose();
                }
            }
        });
    }
    
    public void resetSelection(Date date){
        calendar.getSelection().reset();
        calendar.getSelection().set(new DateTime(date));
        calendar.setDate(new DateTime(date));
    }
    
    public void setSelectedDate(java.util.Calendar newDate){
        java.util.Calendar oldDate = (java.util.Calendar) selectedDate.clone();
        
        selectedDate = newDate;
        
        changeSupport.firePropertyChange("selectedDate", oldDate, selectedDate);
    }
    
    public java.util.Calendar getSelectedDate(){
        return selectedDate;
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener){
        changeSupport.addPropertyChangeListener(listener);
    }
}
