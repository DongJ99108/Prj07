package ex01;

import java.util.Objects;

class Member {
	// Field
	private int num;
	private String name;
	private String tel;
	
	//Constructor
	public Member() {}

	public Member(int num, String name, String tel) {
		// super();
		this.num = num;
		this.name = name;
		this.tel = tel;
	}

	
	//Method
	//toString
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", tel=" + tel + "]";
	}

	// hashcode
	@Override
	public int hashCode() {
		return Objects.hash(name, num, tel);
	}

	// equals
	@Override
	public boolean equals(Object obj) {
		Member other = (Member) obj;
		return Objects.equals(name, other.name) 
				|| num == other.num;
	}
	
	
	
	
	
	
	
	
	
	
}

public class TestMemberArray {

	public static void main(String[] args) {
		// 여러면의 정보를 입력받아
		// 검색객체를 만들어서 해당 멤버를 찾는다
		/*
		Member m1 = new Member(1, "민지", "010-1234-5678");
		Member m2 = new Member(2, "원영", "010-2234-6678");
		Member m3 = new Member(3, "윈터", "010-3234-7678");
		Member m4 = new Member(4, "유진", ""); // 빈문자열
		Member m5 = new Member(5, "유나", "010-5234-9678");
		Member m6 = new Member(6, "닝닝", null); // null
		
		System.out.println( m1 ); // 저 위에 toString 함수가 없었으면 메모리속 정보 위치만 보였을거임
		System.out.println( m2 );
		System.out.println( m3 );
		System.out.println( m4 );
		System.out.println( m5 );
		System.out.println( m6 );
        */
		
		Member[] mArr = new Member[6];
		
		mArr[0] = new Member(1, "민지", "010-1234-5678");
		mArr[1] = new Member(2, "원영", "010-2234-6678");
		mArr[2] = new Member(3, "윈터", "010-3234-7678");
		mArr[3] = new Member(4, "유진", ""); // 빈문자열
		mArr[4] = new Member(5, "유나", "010-5234-9678");
		mArr[5] = new Member(6, "닝닝", null); // null
		
		System.out.println(mArr[4] + "4번");
		
		for (Member member : mArr) {
			System.out.println( member );
		}
		System.out.println("============================");
		
		// 찾을 사람의 정보
		Member mem = new Member(7, null, null);
		
		// == 주소비교로는 찾을 수 없다.
		// ㄴ> data 비교로 변경 : equals() 재정의
		boolean isFound = false;
		for (int i = 0; i < mArr.length; i++) {
			Member member = mArr[i];
			// System.out.println("member:" + member.hashCode());
			// System.out.println("mem:" + mem.hashCode());
			if( member.equals(mem) ) {
				System.out.println( member );
				isFound = true;
				break; // 반복문을 탈출
			}
		}
		
		// 못찾음
		if( !isFound )
			System.out.println("못찾았다 꾀꼬리");
		
		
	}// main

} // class TestMemberArray

























