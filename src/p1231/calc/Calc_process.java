package p1231.calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;

public class Calc_process extends KeyAdapter  implements ActionListener{
	private Calc_Design calc_Design;
	private boolean dot_flag;
	private int num_length;
	boolean process_char_pressed_flag;

	
	// 변수 접근을 위한 Getter, setter method 의 정의
	public boolean isDot_flag() {
		return dot_flag;
	}

	public void setDot_flag(boolean dot_flag) {
		this.dot_flag = dot_flag;
	}

	public Calc_Design getCalc_Design() {
		return calc_Design;
	}

	public void setCalc_Design(Calc_Design calc_Design) {
		this.calc_Design = calc_Design;
	}
	
	
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*
	 * 버튼 클릭시 수행해야 하는 동작 1) text 에 누른 버튼값이 들어가게 동작 2) 기호 값에 따른 계산 처리 동작 -> 기호값이
	 * 안눌렸을때 숫자 입력시 이어서 연속입력 -> ac 를 제외한 기호값이 누르면 새로운 숫자 입력으로 진행, 이전 입력 숫자값 기억
	 */


	// 키가 눌렸을때 이벤트를 감지하여 관련 처리 동작을 수행
	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		//System.out.println(keycode);
		keypad_button_action(keycode);
		//num_comma();
	}

	// 키패트를 통한 버튼 제어 로직
	public void keypad_button_action(int keycode) {		
		if(keycode == KeyEvent.VK_NUMPAD0) {
			calc_Design.getText().append("0");
			calc_Design.getNum_insert_his().append("0");
			num_length++;
		}else if(keycode == KeyEvent.VK_NUMPAD1) {
			calc_Design.getText().append("1");
			calc_Design.getNum_insert_his().append("1");
			num_length++;
		}else if(keycode == KeyEvent.VK_NUMPAD2) {
			calc_Design.getText().append("2");
			calc_Design.getNum_insert_his().append("2");
			num_length++;
		}else if(keycode == KeyEvent.VK_NUMPAD3) {
			calc_Design.getText().append("3");
			calc_Design.getNum_insert_his().append("3");
			num_length++;
		}else if(keycode == KeyEvent.VK_NUMPAD4) {
			calc_Design.getText().append("4");
			calc_Design.getNum_insert_his().append("4");
			num_length++;
		}else if(keycode == KeyEvent.VK_NUMPAD5) {
			calc_Design.getText().append("5");
			calc_Design.getNum_insert_his().append("5");
			num_length++;
		}else if(keycode == KeyEvent.VK_NUMPAD6) {
			calc_Design.getText().append("6");
			calc_Design.getNum_insert_his().append("6");
			num_length++;
		}else if(keycode == KeyEvent.VK_NUMPAD7) {
			calc_Design.getText().append("7");
			calc_Design.getNum_insert_his().append("7");
			num_length++;
		}else if(keycode == KeyEvent.VK_NUMPAD8) {
			calc_Design.getText().append("8");
			calc_Design.getNum_insert_his().append("8");
			num_length++;
		}else if(keycode == KeyEvent.VK_NUMPAD9) {
			calc_Design.getText().append("9");
			calc_Design.getNum_insert_his().append("9");
			num_length++;
		}else if(keycode == 107) {
			process_char_pressed_flag=true;
			calc_Design.setCalculation_char("+");
			calc_Design.getNum_insert_his().append(" + ");
			getNum();
			clearText();
		}else if(keycode == 109) {
			process_char_pressed_flag=true;
			calc_Design.setCalculation_char("-");
			calc_Design.getNum_insert_his().append(" - ");
			getNum();
			clearText();
		}else if(keycode == KeyEvent.VK_MULTIPLY) {
			process_char_pressed_flag=true;
			calc_Design.setCalculation_char("*");
			calc_Design.getNum_insert_his().append(" * ");
			getNum();
			clearText();
		}else if(keycode == KeyEvent.VK_DIVIDE) {		
			process_char_pressed_flag=true;
			calc_Design.setCalculation_char("/");
			calc_Design.getNum_insert_his().append(" / ");
			getNum();
			clearText();
		}else if(keycode == 92){
			// remainder
			process_char_pressed_flag=true;
			calc_Design.setCalculation_char("%");
			calc_Design.getNum_insert_his().append(" % ");
			getNum();
			clearText();
		}else if(keycode == 110) {
			//System.out.println("VK_Dot");
			dot_flag = true;
			calc_Design.getText().append(".");
			calc_Design.getNum_insert_his().append(".");
		}else if(keycode == 10) {
			//System.out.println("vk_number_enter");
			getNum();
			getResult();
		}else if (keycode == 8) {
			//System.out.println("vk_ac");
			clearAll();
		}else if (keycode == 27) {
			clearAll();
		}
		
		
	}
	
	
	
	// 버튼이 클릭되었을때 알맞는 처리 동작을 수행
	@Override
	public void actionPerformed(ActionEvent e) {
		Object bt_value = (JButton) e.getSource();
		button_Action(bt_value);
	}
	
	// 버튼 동작 제어를 위한 Method
	public void button_Action(Object bt_value) {
		
		/*
		 * Debugging 을 위한 code System.out.println(bt_values2.contains(bt_value));
		 * System.out.println(bt_value); System.out.println(bt_values2.get(8));
		 */

		if (bt_value == calc_Design.getBt_9()) {
			calc_Design.getText().getText();
			calc_Design.getNum_insert_his().append("9");
			num_length++;
		} else if (bt_value == calc_Design.getBt_8()) {
			calc_Design.getText().append("8");
			calc_Design.getNum_insert_his().append("8");
			num_length++;
		} else if (bt_value == calc_Design.getBt_7()) {
			calc_Design.getText().append("7");
			calc_Design.getNum_insert_his().append("7");
			num_length++;
		} else if (bt_value == calc_Design.getBt_6()) {
			calc_Design.getText().append("6");
			calc_Design.getNum_insert_his().append("6");
			num_length++;
		} else if (bt_value == calc_Design.getBt_5()) {
			calc_Design.getText().append("5");
			calc_Design.getNum_insert_his().append("5");
			num_length++;
		} else if (bt_value == calc_Design.getBt_4()) {
			calc_Design.getText().append("4");
			calc_Design.getNum_insert_his().append("4");
			num_length++;
		} else if (bt_value == calc_Design.getBt_3()) {
			calc_Design.getText().append("3");
			calc_Design.getNum_insert_his().append("3");
			num_length++;
		} else if (bt_value == calc_Design.getBt_2()) {
			calc_Design.getText().append("2");
			calc_Design.getNum_insert_his().append("2");
			num_length++;
		} else if (bt_value == calc_Design.getBt_1()) {
			calc_Design.getText().append("1");
			calc_Design.getNum_insert_his().append("1");
			num_length++;
		} else if (bt_value == calc_Design.getBt_0()) {
			calc_Design.getText().append("0");
			calc_Design.getNum_insert_his().append("0");
			num_length++;
		} else if (bt_value == calc_Design.getBt_dot()) {
			dot_flag = true;
			calc_Design.getText().append(".");
			calc_Design.getNum_insert_his().append(".");
		} else if (bt_value == calc_Design.getAc()) {
			clearAll();
			
//			System.out.println("AC 누른 후 num1 값 : " + calc_Design.getNum1());
//			System.out.println("AC 누른 후 num2 값 : " + calc_Design.getNum2());
//			System.out.println("AC 누른 후 calculation_char 값 : " + calc_Design.getCalculation_char());
			
		} else if (bt_value == calc_Design.getPlus_minors()) {
		
			// 부호 전환 버튼 눌렀을 경우에 대한 Logic 은 길기 때문에 별도의 method 로 선언하였음
			changeSign();
			//System.out.println(calc_Design.getNum1());
			
			
			
		} else if (bt_value == calc_Design.getRemainder()) {
			process_char_pressed_flag=true;
			calc_Design.setCalculation_char("%");
			calc_Design.getNum_insert_his().append(" % ");
			getNum();
			clearText();


		} else if (bt_value == calc_Design.getDivide()) {
			process_char_pressed_flag=true;
			calc_Design.setCalculation_char("/");
			calc_Design.getNum_insert_his().append(" / ");
			getNum();
			clearText();
			// text.append(" / ");

		} else if (bt_value == calc_Design.getMultiplecation()) {
			process_char_pressed_flag=true;
			calc_Design.setCalculation_char("*");
			calc_Design.getNum_insert_his().append(" * ");
			getNum();
			clearText();
			// text.append(" * ");

		} else if (bt_value == calc_Design.getSubtraction()) {
			process_char_pressed_flag=true;
			calc_Design.setCalculation_char("-");
			calc_Design.getNum_insert_his().append(" - ");
			getNum();
			clearText();
			// text.append(" - ");

		} else if (bt_value == calc_Design.getPlus()) {
			process_char_pressed_flag=true;
			System.out.println(process_char_pressed_flag);
			calc_Design.setCalculation_char("+");
			calc_Design.getNum_insert_his().append(" + ");
			getNum();
			clearText();
			// text.append(" + ");

		} else if (bt_value == calc_Design.getResult()) {
			getNum();
			getResult();
			// text.setText(num2);
		}
		//System.out.println(num_length);
	}
	
	
	
	
	
	
	
	
	

	// AC 버튼을 눌렀을 경우 전체 초기화 기능을 갖는 Method
	public void clearAll() {
		calc_Design.setCalculation_char(null);
		calc_Design.setNum1(0.0);
		calc_Design.setNum2(0.0);
		calc_Design.getText().setText("");
		calc_Design.getNum_insert_his().setText("");
		num_length = 0;
	}
	
	
	
	
	
	
	
	

	// 연산 기호 입력시 동작한다, text 창을 한번 지우는 기능을 갖는 Method
	// text 창을 한번 지워줘야 num2 를 얻을 수 있다.
	public void clearText() {
		//calc_Design.getText().setText("");
		calc_Design.getText().selectAll();
		calc_Design.getText().replaceSelection("");
	}
	
	
	
	
	
	
	
	

	// 연산에 사용될 사용자가 입력한 숫자를 얻어 보관하는 기능을 갖는 Method
	public void getNum() {
		double num1 = 0.0;
		double num2 = 0.0;
		
		if(process_char_pressed_flag) {
			num1 = Double.parseDouble(calc_Design.getText().getText());
			calc_Design.setNum1(num1);
			process_char_pressed_flag=false;
		}else {
			num2 = Double.parseDouble(calc_Design.getText().getText());
			calc_Design.setNum2(num2);
			//getResult();
		}
	}

	
	
	
	
	
	
	
	// "=" 버튼을 눌러 연산처리를 사용자가 요청하였을시 연산 기호의 종류에 따라 연산을 처리하는 Method
	public void getResult() {
		String result = null;
		try {
			if (calc_Design.getCalculation_char().equals("%")) {
				if(dot_flag) {
					result = Double.toString(calc_Design.getNum1() % calc_Design.getNum2());
				}else {
					result = Integer.toString(((int)calc_Design.getNum1()) % ((int)calc_Design.getNum2()));
				}
				
			} else if (calc_Design.getCalculation_char().equals("/")) {
				if(dot_flag) {
					result = Double.toString(calc_Design.getNum1() / calc_Design.getNum2());
				}else {
					// 나눗셈의 경우에는 나누어 떨어지지 않는 수가 존재한다.
					// 따라서 num1 을 num2 로 나누었을 경우 나누어 떨어진다면 소수점 이하를 버린다.
					if((calc_Design.getNum1() % calc_Design.getNum2()) == 0) {
						result = Integer.toString((int)(calc_Design.getNum1() / calc_Design.getNum2()));

					// num1 을 num2 로 나눈 연산 결과가 나누어 떨어지지 않는 경우 실수형으로 결과값을 받아 소수점을 표시한다.
					}else {
						result = Double.toString(calc_Design.getNum1() / calc_Design.getNum2());
					}
				}

			} else if (calc_Design.getCalculation_char().equals("*")) {
				if(dot_flag) {
					result = Double.toString(calc_Design.getNum1() * calc_Design.getNum2());
				}else {
					result = Integer.toString((int)(calc_Design.getNum1() * calc_Design.getNum2()));
				}

			} else if (calc_Design.getCalculation_char().equals("-")) {
				if(dot_flag) {
					result = Double.toString(calc_Design.getNum1() - calc_Design.getNum2());
				}else {
					result = Integer.toString(((int)calc_Design.getNum1()) - ((int)calc_Design.getNum2()));
				}
			
			} else if (calc_Design.getCalculation_char().equals("+")) {
				if(dot_flag) {
					result = Double.toString(calc_Design.getNum1() + calc_Design.getNum2());
				}else {
					result = Integer.toString(((int)calc_Design.getNum1()) + ((int)calc_Design.getNum2()));
				}
			}

			calc_Design.getText().setText(result);
			calc_Design.setCalculation_char(null);
			dot_flag=false;
		} catch (Exception e) {
			System.out.println("연산에 실패하였습니다.");
			//e.printStackTrace();
		}
		
		// 아래 코드는 개선을 위해 시험중인 코드
		// num_insert_history 에 입력된 값으로 연산 결과 값을 도출하려고 함.
		// 이유는 text 에는 숫자 입력시 1000 단위로 ',' 를 입력하기 위함
		// 현재 연산에 진행되는 num1, num2 값은 text 에 입력된 값을 통해 얻어오기 때문에 ',' 추가시 숫자로 변환 불가
		
		//System.out.println(calc_process_char_index);
		//System.out.println(calc_Design.getNum_insert_his().getText().substring(calc_process_char_index+2));
	}
		
	
	
	
	// 천원 단위 comma (,) 표시
	public void num_comma() {
		if(num_length>1) {
			if(num_length%3==1) {
				calc_Design.getText().append(",");
			}
		}
	}
	
	
	
	
	
	
	// 부호 전환 버튼을 눌렀을 경우 동작하는 method
	// 현재 처음 입력 숫자 부호 전환에 대한 동작만 구현한 상태
	// 버그로는 음수 뺄셈의 결과값이 도출되지 않는다
	// -8 - 3 = -8		과 같이 계산됨
	public void changeSign() {
		String num = calc_Design.getText().getText();
		String changed_num = null;
		if(calc_Design.getNum1() == 0.0) {
			if(dot_flag) {
				calc_Design.getNum_insert_his().setText("");
				calc_Design.getText().setText(Double.toString((Double.parseDouble(num) - (2*Double.parseDouble(num)))));
				changed_num = calc_Design.getText().getText();
				calc_Design.setNum1(Double.parseDouble(changed_num));
				calc_Design.getNum_insert_his().setText(changed_num);
			}else {
				calc_Design.getNum_insert_his().setText("");
				calc_Design.getText().setText(Integer.toString((Integer.parseInt(num) - (2*Integer.parseInt(num)))));
				changed_num = calc_Design.getText().getText();
				calc_Design.setNum1(Integer.parseInt(changed_num));
				calc_Design.getNum_insert_his().setText(changed_num);
			}
		}
		
	}
	
	
	

}
