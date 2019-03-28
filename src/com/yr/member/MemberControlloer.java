package com.yr.member;

import java.util.Scanner;

import com.yr.view.MemberView;

public class MemberControlloer {
	private Scanner sc;
	private Member[] members;
	private MemberInput mi;
	private MemberAdd ma;
	private MemberView mv;
	
	public MemberControlloer() {
		sc=new Scanner(System.in);
		members = new Member[0];
		mi = new MemberInput();
		ma = new MemberAdd();
		mv = new MemberView();
	}
	//start
	
	//1. 회원가입  2. 로그인   3. 회원정보 전체 출력   4. 프로그램 종료
	
	public void start() {
		
		boolean check = true;
		 
		
		while(check) {
			
			System.out.println("1.회원가입   2.로그인   3.회원 정보 전체 출력   4.프로그램 종료");
			System.out.println("선택하세요 : ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				Member m = mi.memberJoin();
				members = ma.add(members, m);
				break;
			case 2:
				Member member = mi.memberLogin(members);
				if(member !=null) {
					System.out.println(member.getId() + "님 로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
				break;
			case 3: 
				mv.view(members);
				break;
			case 4:
				check=!check;
				break;
			default : 
				System.out.println("잘못 입력하였습니다.");
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
}
