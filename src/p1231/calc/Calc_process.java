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

	
	// ���� ������ ���� Getter, setter method �� ����
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
	 * ��ư Ŭ���� �����ؾ� �ϴ� ���� 1) text �� ���� ��ư���� ���� ���� 2) ��ȣ ���� ���� ��� ó�� ���� -> ��ȣ����
	 * �ȴ������� ���� �Է½� �̾ �����Է� -> ac �� ������ ��ȣ���� ������ ���ο� ���� �Է����� ����, ���� �Է� ���ڰ� ���
	 */


	// Ű�� �������� �̺�Ʈ�� �����Ͽ� ���� ó�� ������ ����
	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		//System.out.println(keycode);
		keypad_button_action(keycode);
		//num_comma();
	}

	// Ű��Ʈ�� ���� ��ư ���� ����
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
	
	
	
	// ��ư�� Ŭ���Ǿ����� �˸´� ó�� ������ ����
	@Override
	public void actionPerformed(ActionEvent e) {
		Object bt_value = (JButton) e.getSource();
		button_Action(bt_value);
	}
	
	// ��ư ���� ��� ���� Method
	public void button_Action(Object bt_value) {
		
		/*
		 * Debugging �� ���� code System.out.println(bt_values2.contains(bt_value));
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
			
//			System.out.println("AC ���� �� num1 �� : " + calc_Design.getNum1());
//			System.out.println("AC ���� �� num2 �� : " + calc_Design.getNum2());
//			System.out.println("AC ���� �� calculation_char �� : " + calc_Design.getCalculation_char());
			
		} else if (bt_value == calc_Design.getPlus_minors()) {
		
			// ��ȣ ��ȯ ��ư ������ ��쿡 ���� Logic �� ��� ������ ������ method �� �����Ͽ���
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
	
	
	
	
	
	
	
	
	

	// AC ��ư�� ������ ��� ��ü �ʱ�ȭ ����� ���� Method
	public void clearAll() {
		calc_Design.setCalculation_char(null);
		calc_Design.setNum1(0.0);
		calc_Design.setNum2(0.0);
		calc_Design.getText().setText("");
		calc_Design.getNum_insert_his().setText("");
		num_length = 0;
	}
	
	
	
	
	
	
	
	

	// ���� ��ȣ �Է½� �����Ѵ�, text â�� �ѹ� ����� ����� ���� Method
	// text â�� �ѹ� ������� num2 �� ���� �� �ִ�.
	public void clearText() {
		//calc_Design.getText().setText("");
		calc_Design.getText().selectAll();
		calc_Design.getText().replaceSelection("");
	}
	
	
	
	
	
	
	
	

	// ���꿡 ���� ����ڰ� �Է��� ���ڸ� ��� �����ϴ� ����� ���� Method
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

	
	
	
	
	
	
	
	// "=" ��ư�� ���� ����ó���� ����ڰ� ��û�Ͽ����� ���� ��ȣ�� ������ ���� ������ ó���ϴ� Method
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
					// �������� ��쿡�� ������ �������� �ʴ� ���� �����Ѵ�.
					// ���� num1 �� num2 �� �������� ��� ������ �������ٸ� �Ҽ��� ���ϸ� ������.
					if((calc_Design.getNum1() % calc_Design.getNum2()) == 0) {
						result = Integer.toString((int)(calc_Design.getNum1() / calc_Design.getNum2()));

					// num1 �� num2 �� ���� ���� ����� ������ �������� �ʴ� ��� �Ǽ������� ������� �޾� �Ҽ����� ǥ���Ѵ�.
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
			System.out.println("���꿡 �����Ͽ����ϴ�.");
			//e.printStackTrace();
		}
		
		// �Ʒ� �ڵ�� ������ ���� �������� �ڵ�
		// num_insert_history �� �Էµ� ������ ���� ��� ���� �����Ϸ��� ��.
		// ������ text ���� ���� �Է½� 1000 ������ ',' �� �Է��ϱ� ����
		// ���� ���꿡 ����Ǵ� num1, num2 ���� text �� �Էµ� ���� ���� ������ ������ ',' �߰��� ���ڷ� ��ȯ �Ұ�
		
		//System.out.println(calc_process_char_index);
		//System.out.println(calc_Design.getNum_insert_his().getText().substring(calc_process_char_index+2));
	}
		
	
	
	
	// õ�� ���� comma (,) ǥ��
	public void num_comma() {
		if(num_length>1) {
			if(num_length%3==1) {
				calc_Design.getText().append(",");
			}
		}
	}
	
	
	
	
	
	
	// ��ȣ ��ȯ ��ư�� ������ ��� �����ϴ� method
	// ���� ó�� �Է� ���� ��ȣ ��ȯ�� ���� ���۸� ������ ����
	// ���׷δ� ���� ������ ������� ������� �ʴ´�
	// -8 - 3 = -8		�� ���� ����
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
