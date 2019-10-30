package chung;
/* ch6.4~6.6 
 * 
 * 1.1)void 2)return 3)배열(???) 4)오버로딩
 * 2.1)o 2)x 3)o 4)o 
 * 3.
 *
 */
///3
class MemberService {
	String id;
	String password;
	
	boolean login(String id, String password) {
		if(id.equals("hong")&&(password.equals("12345"))) {
			return true;
		}
		return false;
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
//4.
class Printer{
	void println(int value){
		System.out.println(value);
	}
	void println(boolean value){
		System.out.println(value);
	}
	void println(double value){
		System.out.println(value);
	}
	void println(String value){
		System.out.println(value);
	}
}
/* 6.5 
 * 1. 1) 2) 3) 4)
 * 2. 2
 * */
public class Ch06_Second {

}
