import javax.swing.*;

public class AddDropDown {
    public static void main(String[] args) {
        String[] timeList = {"1:30", "3:30", "5:30", "7:30"};
        
        String getTime = (String) JOptionPane.showInputDialog(
                null,
                "Please select a time:",
                "Initial Time",
                JOptionPane.QUESTION_MESSAGE,
                null,
                timeList,
                timeList[0]
		);
        //System.out.println("Time: " + getTime);
        String[] addList = {"0:15", "0:30", "0:45", "1:00"};
        
        String addTime = (String) JOptionPane.showInputDialog(
                null,
                "Please select a time:",
                "Addition Time",
                JOptionPane.QUESTION_MESSAGE,
                null,
                addList,
                addList[0]
		);
        
        int hour = Integer.parseInt(getTime.charAt(0) + "") + Integer.parseInt(addTime.charAt(0) + "");
        int min = Integer.parseInt(getTime.substring(2) ) + Integer.parseInt(addTime.substring(2) );
        if (min >= 60) {
        	hour++;
        	min -= 60;
        }
        
        JOptionPane.showMessageDialog(null, hour + ":" + min);
    }
}