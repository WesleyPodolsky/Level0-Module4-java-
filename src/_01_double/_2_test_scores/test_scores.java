package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
	public static void main(String[] args) {
		String grade = JOptionPane.showInputDialog("what was your test score?");
		double gradeDouble = Double.parseDouble(grade);
		if(gradeDouble >= 90) {
			JOptionPane.showMessageDialog(null,"good job on the A!"); } 
		else if(gradeDouble >= 80) {
			JOptionPane.showMessageDialog(null,"ok not bad you got a B!"); }
		else if(gradeDouble >= 70) {
			JOptionPane.showMessageDialog(null,"oof better luck next time. You got a C"); }
		else{
			JOptionPane.showMessageDialog(null,"F. not your best work :/"); }
	}
}
