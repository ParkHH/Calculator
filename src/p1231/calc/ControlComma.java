package p1231.calc;

// 본 코드를 사용하기 위해서는 String 계산기 숫자를 표현하는 Component 가 JTextField 로 오른쪽 정렬이 되어야 한다.
// 현재 Package 내부의 계산기 Code 에서는 사용이 불가능하다.
public class ControlComma {
	public String controlComma(String data) {

		StringBuffer sb = new StringBuffer();
		int len=data.length();
		System.out.println(len);

		for(int i=len-1;i>=0;i--) {
			if(i>0) {
				if(i%3==0) {
					sb.append(data.charAt(i)+",");
				}else {
					sb.append(data.charAt(i));
				}
			}else {
				sb.append(data.charAt(i));
			}
		}
		return sb.toString();
	}


	public void setNum(String num) {
		stack.add(num);
		sb.delete(0, sb.length());
	
		for(int i=0;i<stack.size();i++) {
			sb.append(stack.get(i));
		}
		t_num.setText(controlComma(sb.toString()));
	}
}
