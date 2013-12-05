package strange_dice;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;

public class Take2 extends JFrame{
	public Take2() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setPreferredSize(new Dimension(700, 467));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{182, 69, 57, 46, 56, 54, 61, 50, 43, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 273, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		GridBagConstraints gbc_lblDieA = new GridBagConstraints();
		gbc_lblDieA.insets = new Insets(0, 0, 5, 5);
		gbc_lblDieA.gridx = 0;
		gbc_lblDieA.gridy = 1;
		getContentPane().add(getLblDieA(), gbc_lblDieA);
		GridBagConstraints gbc_spinnerA1 = new GridBagConstraints();
		gbc_spinnerA1.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerA1.gridx = 3;
		gbc_spinnerA1.gridy = 1;
		getContentPane().add(getSpinnerA1(), gbc_spinnerA1);
		GridBagConstraints gbc_spinnerA2 = new GridBagConstraints();
		gbc_spinnerA2.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerA2.gridx = 5;
		gbc_spinnerA2.gridy = 1;
		getContentPane().add(getSpinnerA2(), gbc_spinnerA2);
		GridBagConstraints gbc_spinnerA3 = new GridBagConstraints();
		gbc_spinnerA3.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerA3.gridx = 7;
		gbc_spinnerA3.gridy = 1;
		getContentPane().add(getSpinnerA3(), gbc_spinnerA3);
		GridBagConstraints gbc_lblDieB = new GridBagConstraints();
		gbc_lblDieB.insets = new Insets(0, 0, 5, 5);
		gbc_lblDieB.gridx = 0;
		gbc_lblDieB.gridy = 2;
		getContentPane().add(getLblDieB(), gbc_lblDieB);
		GridBagConstraints gbc_spinnerB1 = new GridBagConstraints();
		gbc_spinnerB1.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerB1.gridx = 3;
		gbc_spinnerB1.gridy = 2;
		getContentPane().add(getSpinnerB1(), gbc_spinnerB1);
		GridBagConstraints gbc_spinnerB2 = new GridBagConstraints();
		gbc_spinnerB2.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerB2.gridx = 5;
		gbc_spinnerB2.gridy = 2;
		getContentPane().add(getSpinnerB2(), gbc_spinnerB2);
		GridBagConstraints gbc_spinnerB3 = new GridBagConstraints();
		gbc_spinnerB3.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerB3.gridx = 7;
		gbc_spinnerB3.gridy = 2;
		getContentPane().add(getSpinnerB3(), gbc_spinnerB3);
		GridBagConstraints gbc_btnRoll = new GridBagConstraints();
		gbc_btnRoll.insets = new Insets(0, 0, 5, 0);
		gbc_btnRoll.gridx = 8;
		gbc_btnRoll.gridy = 2;
		getContentPane().add(getBtnRoll(), gbc_btnRoll);
		GridBagConstraints gbc_lblDieC = new GridBagConstraints();
		gbc_lblDieC.insets = new Insets(0, 0, 5, 5);
		gbc_lblDieC.gridx = 0;
		gbc_lblDieC.gridy = 3;
		getContentPane().add(getLblDieC(), gbc_lblDieC);
		GridBagConstraints gbc_spinnerC1 = new GridBagConstraints();
		gbc_spinnerC1.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerC1.gridx = 3;
		gbc_spinnerC1.gridy = 3;
		getContentPane().add(getSpinnerC1(), gbc_spinnerC1);
		GridBagConstraints gbc_spinnerC2 = new GridBagConstraints();
		gbc_spinnerC2.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerC2.gridx = 5;
		gbc_spinnerC2.gridy = 3;
		getContentPane().add(getSpinnerC2(), gbc_spinnerC2);
		GridBagConstraints gbc_spinnerC3 = new GridBagConstraints();
		gbc_spinnerC3.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerC3.gridx = 7;
		gbc_spinnerC3.gridy = 3;
		getContentPane().add(getSpinnerC3(), gbc_spinnerC3);
		GridBagConstraints gbc_lblResult = new GridBagConstraints();
		gbc_lblResult.insets = new Insets(0, 0, 5, 5);
		gbc_lblResult.gridx = 0;
		gbc_lblResult.gridy = 6;
		getContentPane().add(getLblResult(), gbc_lblResult);
		GridBagConstraints gbc_editorPane = new GridBagConstraints();
		gbc_editorPane.insets = new Insets(0, 0, 5, 5);
		gbc_editorPane.gridwidth = 7;
		gbc_editorPane.fill = GridBagConstraints.BOTH;
		gbc_editorPane.gridx = 1;
		gbc_editorPane.gridy = 6;
		getContentPane().add(getEditorPane(), gbc_editorPane);
		this.pack();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblDieA;
	private JSpinner spinnerA3;
	private JSpinner spinnerA1;
	private JSpinner spinnerA2;
	private JLabel lblDieB;
	private JLabel lblDieC;
	private JSpinner spinnerB1;
	private JSpinner spinnerB2;
	private JSpinner spinnerB3;
	private JSpinner spinnerC1;
	private JSpinner spinnerC2;
	private JSpinner spinnerC3;
	private JButton btnRoll;
	private JLabel lblResult;
	private JEditorPane editorPane;
	private JLabel getLblDieA() {
		if (lblDieA == null) {
			lblDieA = new JLabel("Die A");
		}
		return lblDieA;
	}
	private JSpinner getSpinnerA3() {
		if (spinnerA3 == null) {
			spinnerA3 = new JSpinner();
			JFormattedTextField tf = ((JSpinner.DefaultEditor) spinnerA3.getEditor()).getTextField();
			tf.setColumns(2);
		}
		return spinnerA3;
	}
	private JSpinner getSpinnerA1() {
		if (spinnerA1 == null) {
			spinnerA1 = new JSpinner();
			JFormattedTextField tf = ((JSpinner.DefaultEditor) spinnerA1.getEditor()).getTextField();
			tf.setColumns(2);
		}
		return spinnerA1;
	}
	private JSpinner getSpinnerA2() {
		if (spinnerA2 == null) {
			spinnerA2 = new JSpinner();
			JFormattedTextField tf = ((JSpinner.DefaultEditor) spinnerA2.getEditor()).getTextField();
			tf.setColumns(2);
		}
		return spinnerA2;
	}
	private JLabel getLblDieB() {
		if (lblDieB == null) {
			lblDieB = new JLabel("Die B");
		}
		return lblDieB;
	}
	private JLabel getLblDieC() {
		if (lblDieC == null) {
			lblDieC = new JLabel("Die C");
		}
		return lblDieC;
	}
	private JSpinner getSpinnerB1() {
		if (spinnerB1 == null) {
			spinnerB1 = new JSpinner();
			JFormattedTextField tf = ((JSpinner.DefaultEditor) spinnerB1.getEditor()).getTextField();
			tf.setColumns(2);
		}
		return spinnerB1;
	}
	private JSpinner getSpinnerB2() {
		if (spinnerB2 == null) {
			spinnerB2 = new JSpinner();
			JFormattedTextField tf = ((JSpinner.DefaultEditor) spinnerB2.getEditor()).getTextField();
			tf.setColumns(2);
		}
		return spinnerB2;
	}
	private JSpinner getSpinnerB3() {
		if (spinnerB3 == null) {
			spinnerB3 = new JSpinner();
			JFormattedTextField tf = ((JSpinner.DefaultEditor) spinnerB3.getEditor()).getTextField();
			tf.setColumns(2);
		}
		return spinnerB3;
	}
	private JSpinner getSpinnerC1() {
		if (spinnerC1 == null) {
			spinnerC1 = new JSpinner();
			JFormattedTextField tf = ((JSpinner.DefaultEditor) spinnerC1.getEditor()).getTextField();
			tf.setColumns(2);
		}
		return spinnerC1;
	}
	private JSpinner getSpinnerC2() {
		if (spinnerC2 == null) {
			spinnerC2 = new JSpinner();
			JFormattedTextField tf = ((JSpinner.DefaultEditor) spinnerC2.getEditor()).getTextField();
			tf.setColumns(2);
		}
		return spinnerC2;
	}
	private JSpinner getSpinnerC3() {
		if (spinnerC3 == null) {
			spinnerC3 = new JSpinner();
			JFormattedTextField tf = ((JSpinner.DefaultEditor) spinnerC3.getEditor()).getTextField();
			tf.setColumns(2);
		}
		return spinnerC3;
	}
	private JButton getBtnRoll() {
		if (btnRoll == null) {
			btnRoll = new JButton("ROLL");
			btnRoll.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					int A1 = (int) spinnerA1.getValue();
					int A2 = (int) spinnerA2.getValue();
					int A3 = (int) spinnerA3.getValue();

					int B1 = (int) spinnerB1.getValue();
					int B2 = (int) spinnerB2.getValue();
					int B3 = (int) spinnerB3.getValue();

					int C1 = (int) spinnerC1.getValue();
					int C2 = (int) spinnerC2.getValue();
					int C3 = (int) spinnerC3.getValue();

					if (A1<1||A2<1||A3 < 1
							|| B1 < 1|| B2<1||B3<1
							||C1 < 1||C2<1||C3<1){
						editorPane.setText("Wrong die value entered");
						return;
					}
					List <Integer> die1array = new ArrayList<Integer>();
					die1array.add(A1);
					die1array.add(A2);
					die1array.add(A3);

					List <Integer> die2array = new ArrayList<Integer>();
					die2array.add(B1);
					die2array.add(B2);
					die2array.add(B3);

					List <Integer> die3array = new ArrayList<Integer>();
					die3array.add(C1);
					die3array.add(C2);
					die3array.add(C3);



					List<List<Integer>> products = Solver.product(die1array, die2array, die3array);
					int aPos = 0, bPos = 1, cPos = 2;
					int prodLength = products.size();

					String result = "";
					result += Solver.printer("A vs B");
					int awins = Solver.wins(products,aPos,bPos);
					int bwins = prodLength - awins;
					result += "A: "+(new Fraction(awins, prodLength).simplify().toString())+"\n";
					result += "B: "+(new Fraction(bwins, prodLength).simplify().toString())+"\n";

					result += Solver.printer("B vs C");
					int cwins = Solver.wins(products,cPos,bPos);
					bwins = prodLength - cwins;
					result += "C: "+(new Fraction(cwins, prodLength).simplify().toString())+"\n";
					result += "B: "+(new Fraction(bwins, prodLength).simplify().toString())+"\n";

					result += Solver.printer("C vs A");
					cwins = Solver.wins(products,cPos,aPos);
					awins = prodLength - cwins;
					result += "C: "+(new Fraction(cwins, prodLength).simplify().toString())+"\n";
					result += "A: "+(new Fraction(awins, prodLength).simplify().toString())+"\n";

					editorPane.setText(result);

				}
			});
		}
		return btnRoll;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("Result:");
		}
		return lblResult;
	}
	private JEditorPane getEditorPane() {
		if (editorPane == null) {
			editorPane = new JEditorPane();
			editorPane.setPreferredSize(new Dimension(100,200));
		}
		return editorPane;
	}
	public static void main(String [] args){
		JFrame a = new Take2();
		a.setVisible(true);
	}
}
