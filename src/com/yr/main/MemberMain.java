package com.yr.main;

import com.yr.member.Member;
import com.yr.member.MemberControlloer;
import com.yr.member.MemberInput;
import com.yr.view.MemberView;

public class MemberMain {

	public static void main(String[] args) {
		MemberControlloer mc = new MemberControlloer();
		mc.start();
		
		
		/*
		// 문자열 비교
		String d1 ="test";
		String d2 = "test";
		System.out.println(d1.equals(d2));  

		
		// 프로그램 시작 , 테스트 목적
		MemberInput mi = new MemberInput();
		MemberView mv = new MemberView();
		
		
		//Member m = mi.memberJoin();
		//mv.view(m);
		
		Member[] members = new Member[100];
		for(int i=0; i<members.length; i++) {
			Member member = new Member();
			member.setId("id"+i);
			member.setPw("pw"+i);
			members[i]=member;
		}
		
		
		
		
		Member m =mi.memberLogin(members);
		System.out.println(m);
		
		*/
	}

}
