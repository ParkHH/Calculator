package p1231.calc;

// �� �ڵ带 ����ϱ� ���ؼ��� String ���� ���ڸ� ǥ���ϴ� Component �� JTextField �� ������ ������ �Ǿ�� �Ѵ�.
// ���� Package ������ ���� Code ������ ����� �Ұ����ϴ�.
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
