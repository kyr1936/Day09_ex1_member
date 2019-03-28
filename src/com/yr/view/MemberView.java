package com.yr.view;


import com.yr.member.Member;

public class MemberView {
	
	public void view (String message) {
		System.out.println(message);
	}
	
	//member 한 명의 정보를 출력하는 메서드
	public void view(Member member) {
		
		System.out.println("id : " + member.getId());
		System.out.println("pw : " + member.getPw());
		System.out.println("age : " + member.getAge());
		System.out.println("email : " + member.getEmail());
		System.out.println("phone : " + member.getPhone());
	}


	//member들 (배열) 의 정보를 출력하는 메서드
	public void view(Member[] members) {
		
		for(int i=0; i<members.length; i++) {
			Member member = members[i];
			this.view(member);
			
			/*
			System.out.println("id : " + member.getId());
			System.out.println("pw : " + member.getPw());
			System.out.println("age : " + member.getAge());
			System.out.println("email : " + member.getEmail());
			System.out.println("phone : " + member.getPhone());
			*/
			
			/*
			System.out.println("id : " + members[i].getId());
			System.out.println("pw : " + members[i].getPw());
			System.out.println("age : " + members[i].getAge());
			System.out.println("email : " + members[i].getEmail());
			System.out.println("phone : " + members[i].getPhone());
			*/
		}
	}
}
