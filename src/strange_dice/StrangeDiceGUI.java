package strange_dice;

import static javax.swing.GroupLayout.Alignment.BASELINE;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Group;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class StrangeDiceGUI extends JFrame{
	private static String die1num1String;
	private static String die1num2String;
	private static String die1num3String;
	private static String die2num1String;
	private static String die2num2String;
	private static String die2num3String;
	private static String die3num1String;
	private static String die3num2String;
	private static String die3num3String;
	public static ArrayList<Integer> die1array;
	public static ArrayList<Integer> die2array;
	public static ArrayList<Integer> die3array;
	private static int die1num1Int;
	private static int die1num2Int;
	private static int die1num3Int;
	private static int die2num1Int;
	private static int die2num2Int;
	private static int die2num3Int;
	private static int die3num1Int;
	private static int die3num2Int;
	private static int die3num3Int;

	private final JLabel die1Text;
	private final JLabel die2Text;
	private final JLabel die3Text;
	private final JTextField die1num1;
	private final JTextField die1num2;
	private final JTextField die1num3;
	private final JTextField die2num1;
	private final JTextField die2num2;
	private final JTextField die2num3;
	private final JTextField die3num1;
	private final JTextField die3num2;
	private final JTextField die3num3;
	private final JButton rollButton;
	private final JTable resultsTable;

	private final DefaultTableModel tableModel;

	//The following are used for organizing the layout.
	private final Group horizontal;
	private final Group vertical;

	private final Group firstRow;
	private final Group secondRow;
	private final Group thirdRow;
	private final Group fourthRow;
	private final Group fifthRow;

	private final Group firstVertical;
	private final Group secondVertical;
	private final Group thirdVertical;
	private final Group fourthVertical;
	private final Group fifthVertical;

	public StrangeDiceGUI() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		rollButton = new JButton();
		rollButton.setName("rollButton");

		die1array = new ArrayList<Integer>();
		die2array = new ArrayList<Integer>();
		die3array = new ArrayList<Integer>();

		die1num1 = new JTextField(20);
		die1num1.setName("die1num1");
		die1num2 = new JTextField(20);
		die1num2.setName("die1num2");
		die1num3 = new JTextField(20);
		die1num3.setName("die1num3");

		die2num1 = new JTextField(20);
		die2num1.setName("die2num1");
		die2num2 = new JTextField(20);
		die2num2.setName("die2num2");
		die2num3 = new JTextField(20);
		die2num3.setName("die2num3");

		die3num1 = new JTextField(20);
		die3num1.setName("die3num1");
		die3num2 = new JTextField(20);
		die3num2.setName("die3num2");
		die3num3 = new JTextField(20);
		die3num3.setName("die3num3");

		die1Text = new JLabel();
		die1Text.setName("die1Text");
		die2Text = new JLabel();
		die2Text.setName("die2Text");
		die3Text = new JLabel();
		die3Text.setName("die3Text");
		resultsTable = new JTable(0,1);
		resultsTable.setName("resultsTable");

		//Create table model
		tableModel = (DefaultTableModel) resultsTable.getModel();

		//die 1 text
		die1Text.setText("Die A");

		//die 2 text
		die2Text.setText("Die B");

		//die 3 text
		die3Text.setText("Die C");

		//roll button text
		rollButton.setText("Roll");

		//set up layout
		Container panel = this.getContentPane();
		GroupLayout layout = new GroupLayout(panel);
		panel.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		//Arrange horizontal
		firstRow = layout.createSequentialGroup();
		firstRow.addComponent(die1Text);
		firstRow.addComponent(die1num1);
		firstRow.addComponent(die1num2);
		firstRow.addComponent(die1num3);

		secondRow = layout.createSequentialGroup();
		secondRow.addComponent(die2Text);
		secondRow.addComponent(die2num1);
		secondRow.addComponent(die2num2);
		secondRow.addComponent(die2num3);

		thirdRow = layout.createSequentialGroup();
		thirdRow.addComponent(die3Text);
		thirdRow.addComponent(die3num1);
		thirdRow.addComponent(die3num2);
		thirdRow.addComponent(die3num3);

		fourthRow = layout.createSequentialGroup();
		fourthRow.addComponent(rollButton);

		fifthRow = layout.createSequentialGroup();
		fifthRow.addComponent(resultsTable);

		horizontal = layout.createParallelGroup();
		horizontal.addGroup(firstRow);
		horizontal.addGroup(secondRow);
		horizontal.addGroup(thirdRow);
		horizontal.addGroup(fourthRow);
		horizontal.addGroup(fifthRow);
		layout.setHorizontalGroup(horizontal);

		//Arrange vertical
		firstVertical = layout.createParallelGroup(BASELINE);
		firstVertical.addComponent(die1Text);
		firstVertical.addComponent(die1num1);
		firstVertical.addComponent(die1num2);
		firstVertical.addComponent(die1num3);

		secondVertical = layout.createParallelGroup(BASELINE);
		secondVertical.addComponent(die2Text);
		secondVertical.addComponent(die2num1);
		secondVertical.addComponent(die2num2);
		secondVertical.addComponent(die2num3);

		thirdVertical = layout.createParallelGroup(BASELINE);
		thirdVertical.addComponent(die3Text);
		thirdVertical.addComponent(die3num1);
		thirdVertical.addComponent(die3num2);
		thirdVertical.addComponent(die3num3);

		fourthVertical = layout.createParallelGroup(BASELINE);
		//Listen for action from the roll Button
		rollButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				newRollAction();
			};
		});
		fourthVertical.addComponent(rollButton);

		fifthVertical = layout.createParallelGroup(BASELINE);
		fifthVertical.addComponent(resultsTable);

		vertical = layout.createSequentialGroup();
		vertical.addGroup(firstVertical);
		vertical.addGroup(secondVertical);
		vertical.addGroup(thirdVertical);
		vertical.addGroup(fourthVertical);
		vertical.addGroup(fifthVertical);
		layout.setVerticalGroup(vertical);

		//Add Title Row to Table
		String [] row0Data = new String[3];
		row0Data[0] = "Result";
		tableModel.addRow(row0Data);

		String [] row1Data = {""};
		tableModel.addRow(row1Data);

		this.pack();

	}

	@SuppressWarnings("serial")
	private void newRollAction(){
		die1num1String = die1num1.getText();
		die1num2String = die1num2.getText();
		die1num3String = die1num3.getText();

		die2num1String = die2num1.getText();
		die2num2String = die2num2.getText();
		die2num3String = die2num3.getText();

		die3num1String = die3num1.getText();
		die3num2String = die3num2.getText();
		die3num3String = die3num3.getText();

		String[] arr=new String[]{
				die1num1String,
				die1num2String,
				die1num3String,

				die2num1String,
				die2num2String,
				die2num3String,

				die3num1String,
				die3num2String,
				die3num3String,	};

		for (String str : arr) {
			if (str==null||str.isEmpty()) {
				//bad info
				tableModel.setValueAt("Invalid die entry", 1, 0);
				this.pack();
				return;
			}
		}

		die1num1Int = Integer.parseInt(die1num1String);
		die1array.add(die1num1Int);
		die1num2Int = Integer.parseInt(die1num2String);
		die1array.add(die1num2Int);
		die1num3Int = Integer.parseInt(die1num3String);
		die1array.add(die1num3Int);

		die2num1Int = Integer.parseInt(die2num1String);
		die2array.add(die2num1Int);
		die2num2Int = Integer.parseInt(die2num2String);
		die2array.add(die2num2Int);
		die2num3Int = Integer.parseInt(die2num3String);
		die2array.add(die2num3Int);

		die3num1Int = Integer.parseInt(die3num1String);
		die3array.add(die3num1Int);
		die3num2Int = Integer.parseInt(die3num2String);
		die3array.add(die3num2Int);
		die3num3Int = Integer.parseInt(die3num3String);
		die3array.add(die3num3Int);

		String result = "";

		ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();
		listOfLists.add(die1array);
		listOfLists.add(die2array);
		listOfLists.add(die3array);

		List<List<Integer>> products = Solver.product(die1array, die2array, die3array);
		int aPos = 0, bPos = 1, cPos = 2;
		int prodLength = products.size();

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

		tableModel.setValueAt(result, 1, 0);
		this.pack();
	}

	public static void main(final String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				StrangeDiceGUI main = new StrangeDiceGUI();

				main.setVisible(true);
			}
		});
	}
}
