package p1231.calc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Calc_Design extends JFrame{
	
	private Calc_process calc_process;		// 입력한 수에 대한 연산 code 를 갖고 있는 변수
	
	
	private JButton ac;						// 계산기 초기화
	private JButton plus_minors;		// 부호바꾸기
	private JButton remainder;			// 나머지
	private JButton divide;				// 나누기
	private JButton multiplecation;	// 곱하기
	private JButton subtraction;		// 빼기
	private JButton plus;					// 더하기
	private JButton result;				// 결과
	private JButton bt_9;					// 9
	private JButton bt_8;					// 8
	private JButton bt_7;					// 7
	private JButton bt_6;					// 6
	private JButton bt_5;					// 5
	private JButton bt_4;					// 4
	private JButton bt_3;					// 3
	private JButton bt_2;					// 2
	private JButton bt_1;					// 1
	private JButton bt_0;					// 0
	private JButton bt_dot;				// .

	private JTextArea num_insert_his;
	private JTextArea text;				// text 표시창

	private JPanel panel_1;				// text 담을 panel
	private JPanel panel_2;				
	private JPanel panel_3;

	//String[] bt_values1 = {"AC", "+/-", "%", "/", "*", "-", "+", "=", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0", "."};
	private ArrayList<Object> bt_values2;

	private double num1;					// 연산 진행시 사용할 숫자 1
	private double num2;					// 연산 진행시 사용할 숫자 2
	private ArrayList list;
	private String calculation_char;	// 연산 기호 클릭시 연산기호를 기억해놓는 변수
		
	public Calc_Design(String title){
		super(title);
		list  = new ArrayList();
		calc_process = new Calc_process();
		calc_process.setCalc_Design(this);
		
		// 사용할 요소들을 메모리에 생성합니다.
			ac = new JButton("AC");
			plus_minors = new JButton("+/-");
			remainder = new JButton("%");
			divide = new JButton("/");
			multiplecation = new JButton("*");
			subtraction = new JButton("-");
			plus = new JButton("+");
			result = new JButton("=");

			Dimension bt_size = new Dimension(99, 50);
			Font bt_font_style = new Font("휴먼매직체", Font.BOLD, 30);
			
			bt_9 = new JButton("9");
			bt_8 = new JButton("8");
			bt_7 = new JButton("7");
			bt_6 = new JButton("6");
			bt_5 = new JButton("5");
			bt_4 = new JButton("4");
			bt_3 = new JButton("3");
			bt_2 = new JButton("2");
			bt_1 = new JButton("1");
			bt_0 = new JButton("0");
			bt_dot = new JButton(".");
			

			bt_values2 = new ArrayList<Object>();			// 버튼들을 담을 ArrayList
				bt_values2.add(ac);
				bt_values2.add(plus_minors);
				bt_values2.add(remainder);
				bt_values2.add(divide);
				bt_values2.add(multiplecation);
				bt_values2.add(subtraction);
				bt_values2.add(plus);
				bt_values2.add(result);
				bt_values2.add(bt_9);
				bt_values2.add(bt_8);
				bt_values2.add(bt_7);
				bt_values2.add(bt_6);
				bt_values2.add(bt_5);
				bt_values2.add(bt_4);
				bt_values2.add(bt_3);
				bt_values2.add(bt_2);
				bt_values2.add(bt_1);
				bt_values2.add(bt_0);
				bt_values2.add(bt_dot);
				
				
				
			// 버튼들의 font style 을 설정	
			for(int i=0; i<bt_values2.size(); i++) {
				 	JButton buttons = (JButton) bt_values2.get(i);
				 	buttons.setFont(bt_font_style);
				 	buttons.addKeyListener(calc_process);
				 	buttons.setBackground(Color.WHITE);
			}
			
			
			// '0', '.', '=' 버튼들의 크기를 지정
			result.setPreferredSize(bt_size);
			bt_0.setPreferredSize(new Dimension(196, 50));
			bt_dot.setPreferredSize(bt_size);



			
			
			panel_1 = new JPanel();
				panel_1.setPreferredSize(new Dimension(300,200));
				panel_1.setLayout(new BorderLayout());
				//panel_1.setBackground(Color.BLACK);
					text = new JTextArea();
					text.setAlignmentX(SwingConstants.RIGHT);
					text.setEditable(false);
					text.setPreferredSize(new Dimension(380,150));
					text.setFont(new Font("휴먼매직체", Font.BOLD, 35));
					
					
					num_insert_his = new JTextArea();
					num_insert_his.setEditable(false);
					num_insert_his.setPreferredSize(new Dimension(380, 50));
					num_insert_his.setBackground(new Color(250, 250, 250));
					num_insert_his.setFont(new Font("휴먼매직체", Font.BOLD, 25));
					
					
			panel_2 = new JPanel();
				panel_2.setPreferredSize(new Dimension(150, 20));
				//panel_2.setBackground(Color.RED);
				panel_2.setLayout(new GridLayout(4 ,4));
				
				
		// panel3 는 0버튼의 크기가 다른 버튼들과 다르기 때문에 선언한것.
			panel_3 = new JPanel();
				panel_3.setPreferredSize(new Dimension(300, 50));
				//panel_3.setBackground(Color.BLUE);
				FlowLayout lm_panel3 = new FlowLayout();
				
				// FlowLayout 에서 발생하는 Component 간 gap 을 없애준다.
				lm_panel3.setHgap(0);
				lm_panel3.setVgap(0);
				panel_3.setLayout(lm_panel3);
			
			

		// 요소들을 알맞는 panel 에 부착한다.
			// 1번 panel 에는 text 상자만
				panel_1.add(num_insert_his);
				panel_1.add(text, BorderLayout.SOUTH);
			
			// 2번 panel 에 붙힐 버튼요소들
				panel_2.add(ac);
				panel_2.add(plus_minors);
				panel_2.add(remainder);
				panel_2.add(divide);
				
				panel_2.add(bt_7);
				panel_2.add(bt_8);
				panel_2.add(bt_9);
				panel_2.add(multiplecation);
				
				panel_2.add(bt_4);
				panel_2.add(bt_5);
				panel_2.add(bt_6);
				panel_2.add(subtraction);
				
				panel_2.add(bt_1);
				panel_2.add(bt_2);
				panel_2.add(bt_3);
				panel_2.add(plus);
				
			// 0 버튼이 크기가 다르므로 panel 을 따로 설정하여 조정한다.
				panel_3.add(bt_0);
				panel_3.add(bt_dot);
				panel_3.add(result);

		
			
			

		// panel 을 JFrame 에 붙힘
			this.add(panel_1, BorderLayout.NORTH);
			this.add(panel_2, BorderLayout.CENTER);
			this.add(panel_3, BorderLayout.SOUTH);
			

		// 발생 이벤트를 리스너 대상과 연결시킴
			ac.addActionListener(calc_process);
			plus_minors.addActionListener(calc_process);
			remainder.addActionListener(calc_process);
			divide.addActionListener(calc_process);
			multiplecation.addActionListener(calc_process);
			subtraction.addActionListener(calc_process);
			plus.addActionListener(calc_process);
			result.addActionListener(calc_process);

			bt_9.addActionListener(calc_process);
			bt_8.addActionListener(calc_process);
			bt_7.addActionListener(calc_process);
			bt_6.addActionListener(calc_process);
			bt_5.addActionListener(calc_process);
			bt_4.addActionListener(calc_process);
			bt_3.addActionListener(calc_process);
			bt_2.addActionListener(calc_process);
			bt_1.addActionListener(calc_process);
			bt_0.addActionListener(calc_process);

			bt_dot.addActionListener(calc_process);


		// bt_values1 의 모든 요소를 ArrayList bt_values2 에 담는다.
		/*
		for(int i=0; i<bt_values2.size(); i++){
			System.out.println(bt_values2.get(i));
			//System.out.println(bt_values2.size());
		}
		*/


		this.setVisible(true);
		this.setSize(400,500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	


	public Calc_process getCalc_process() {
		return calc_process;
	}



	public void setCalc_process(Calc_process calc_process) {
		this.calc_process = calc_process;
	}



	public JButton getAc() {
		return ac;
	}



	public void setAc(JButton ac) {
		this.ac = ac;
	}



	public JButton getPlus_minors() {
		return plus_minors;
	}



	public void setPlus_minors(JButton plus_minors) {
		this.plus_minors = plus_minors;
	}



	public JButton getRemainder() {
		return remainder;
	}



	public void setRemainder(JButton remainder) {
		this.remainder = remainder;
	}



	public JButton getDivide() {
		return divide;
	}



	public void setDivide(JButton divide) {
		this.divide = divide;
	}



	public JButton getMultiplecation() {
		return multiplecation;
	}



	public void setMultiplecation(JButton multiplecation) {
		this.multiplecation = multiplecation;
	}



	public JButton getSubtraction() {
		return subtraction;
	}



	public void setSubtraction(JButton subtraction) {
		this.subtraction = subtraction;
	}



	public JButton getPlus() {
		return plus;
	}



	public void setPlus(JButton plus) {
		this.plus = plus;
	}



	public JButton getResult() {
		return result;
	}



	public void setResult(JButton result) {
		this.result = result;
	}



	public JButton getBt_9() {
		return bt_9;
	}



	public void setBt_9(JButton bt_9) {
		this.bt_9 = bt_9;
	}



	public JButton getBt_8() {
		return bt_8;
	}



	public void setBt_8(JButton bt_8) {
		this.bt_8 = bt_8;
	}



	public JButton getBt_7() {
		return bt_7;
	}



	public void setBt_7(JButton bt_7) {
		this.bt_7 = bt_7;
	}



	public JButton getBt_6() {
		return bt_6;
	}



	public void setBt_6(JButton bt_6) {
		this.bt_6 = bt_6;
	}



	public JButton getBt_5() {
		return bt_5;
	}



	public void setBt_5(JButton bt_5) {
		this.bt_5 = bt_5;
	}



	public JButton getBt_4() {
		return bt_4;
	}



	public void setBt_4(JButton bt_4) {
		this.bt_4 = bt_4;
	}



	public JButton getBt_3() {
		return bt_3;
	}



	public void setBt_3(JButton bt_3) {
		this.bt_3 = bt_3;
	}



	public JButton getBt_2() {
		return bt_2;
	}



	public void setBt_2(JButton bt_2) {
		this.bt_2 = bt_2;
	}



	public JButton getBt_1() {
		return bt_1;
	}



	public void setBt_1(JButton bt_1) {
		this.bt_1 = bt_1;
	}



	public JButton getBt_0() {
		return bt_0;
	}



	public void setBt_0(JButton bt_0) {
		this.bt_0 = bt_0;
	}



	public JButton getBt_dot() {
		return bt_dot;
	}



	public void setBt_dot(JButton bt_dot) {
		this.bt_dot = bt_dot;
	}



	public JTextArea getText() {
		return text;
	}



	public void setText(JTextArea text) {
		this.text = text;
	}



	public JPanel getPanel_1() {
		return panel_1;
	}



	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}



	public JPanel getPanel_2() {
		return panel_2;
	}



	public void setPanel_2(JPanel panel_2) {
		this.panel_2 = panel_2;
	}



	public ArrayList<Object> getBt_values2() {
		return bt_values2;
	}



	public void setBt_values2(ArrayList<Object> bt_values2) {
		this.bt_values2 = bt_values2;
	}



	public double getNum1() {
		return num1;
	}



	public void setNum1(double num1) {
		this.num1 = num1;
	}



	public JTextArea getNum_insert_his() {
		return num_insert_his;
	}



	public void setNum_insert_his(JTextArea num_insert_his) {
		this.num_insert_his = num_insert_his;
	}



	public JPanel getPanel_3() {
		return panel_3;
	}



	public void setPanel_3(JPanel panel_3) {
		this.panel_3 = panel_3;
	}



	public double getNum2() {
		return num2;
	}



	public void setNum2(double num2) {
		this.num2 = num2;
	}



	public String getCalculation_char() {
		return calculation_char;
	}



	public void setCalculation_char(String calculation_char) {
		this.calculation_char = calculation_char;
	}



	public static void main(String[] args){
		new Calc_Design("Calculator");
	}
}