package chung;

/* 6-1
 * 1. 1) O 2) O 3) x 4)O
 * 2. 1)메소드:객체의 동작 부분으로 실행코드를 가지고 있는 블록이다
 * 	  2)필드:객체의 데이터를 저장한다
 *    3)생성자:객체의 초기화를 담당한다 
 * 3. 필드/생성자/메서드
 * 
 * 6-2
 * 1. 1)O 2)o 3)x 4)O
 * 2. String name / String id / String password / int age
 * 3. new Member();   /  member.name  /memeber.age
 * 
 * 6-3
 * 1. 1)x 2)o 3)o 4)o 
 * 2.
 * 
*/
//2번문제 
class Member {
	String name;
	String id;
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
}

//3번 문제 
class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	Board(String title,String content){
		this(title,content,"로그인한 회원 아이디","현재 컴퓨터 날씨",0);
	}
	Board(String title,String content,String writer){
		this(title,content,writer,"현재 컴퓨터 날씨",0);
	}
	Board(String title, String content, String writer,String date){
		this(title,content,writer,date,0);
	}
	Board(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer=writer;
		this.date =date;
		this.hitcount = hitcount;
	}
}

public class Ch06_First {

}
