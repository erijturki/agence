package Interface;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.mindfusion.scheduling.Calendar;

public class Main extends JFrame implements PropertyChangeListener{
JFormattedTextField textField = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));
private JTextField textField_1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SwingUtilities.invokeLater(new Runnable() {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Main window = null;
		try {
			window = new Main();
			window.setVisible(true);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	

});
}
	
	public Main() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(368, 362);
		setTitle("Recherche");
		Container cp = getContentPane();
		FlowLayout flowLayout = new FlowLayout();
		cp.setLayout(flowLayout);
		cp.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		textField_1 = new JTextField();
		textField_1.setBounds(20, 25, 293, 56);
		textField_1.setText("ville,hotel ou mot spécifique");
		textField.setPreferredSize(new Dimension(130, 130));
		cp.add(textField_1);
		textField_1.setColumns(10);
		textField.setValue(new Date());
		textField.setPreferredSize(new Dimension(130, 30));
		cp.add(textField);
		
		JButton calButton = new JButton("pick a date");
		cp.add(calButton);
		
		calendarwindow calendarwindow = new calendarwindow ();
		
		calButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
			calendarwindow.setLocation(textField.getLocationOnScreen().x,
					(textField.getLocationOnScreen().y + textField.getHeight()) );
			Date d = (Date)textField.getValue();
			calendarwindow.resetSelection(d);				
			calendarwindow.setUndecorated(true);
		    calendarwindow.setVisible(true);
			}

			
			}
				);
			cp.add(textField);
			cp.add(calButton);
			cp.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	        
	        

	
		
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		if (evt.getPropertyName().equals("selectedDate")) {
            
			java.util.Calendar cal = (java.util.Calendar)evt.getNewValue();
			Date selDate =  cal.getTime();
			textField.setValue(selDate);
        }
	}
	
	
}