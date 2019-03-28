package com.yr.member;

import java.util.Scanner;

public class MemberInput {
	private Scanner sc;
	
	public MemberInput() {
		sc = new Scanner(System.in);
	}
	//memberLogin
	//매개변수로 Member[] 받아서 
	//Login 성공 - member 리턴 (id,pw 일치하는) /  못찾으면 null 리턴 
	// 
	public Member memberLogin(Member[] members) {
		
		Member member = null; // 리턴 해야하는 객체를 생성함
		System.out.println("id를 입력하세요");
		String id = sc.next();
		System.out.println("pw를 입력하세요");
		String pw = sc.next();
		
		
		for(int i=0; i<members.length;i++) {
			if(id.equals(members[i].getId()) && pw.equals(members[i].getPw())) {
				// System.out.println("로그인 성공");	-- 이 메서드에서 실행 xxx
				member = members[i];
				break;
			}
		}	
			return member;
		
	}
	
	
	
	
	//memberJoin 메서드명 
	//id, pw, age, email, phone 입력받기
	//member 리턴

	public Member memberJoin() {
		
		Member member = new Member();
		System.out.println("id를 입력하세요");
		member.setId(sc.next());
		/*
		 String id = sc.next(); 
		 member.setId(id);
		 */   // id 라는 변수로 무언가를 할 때 필요한 코드
		
		System.out.println("pw를 입력하세요");
		member.setPw(sc.next());
		System.out.println("age를 입력하세요");
		member.setAge(sc.nextInt());
		System.out.println("email을 입력하세요");
		member.setEmail(sc.next());
		System.out.println("phone을 입력하세요");
		member.setPhone(sc.next());

		return member;
	}





}
