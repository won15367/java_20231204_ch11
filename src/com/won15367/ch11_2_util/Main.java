package com.won15367.ch11_2_util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		String nowTime = now.toString();
		System.out.println(nowTime);
		
		SimpleDateFormat sip = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sip.format(now));
		
		Calendar calendar = Calendar.getInstance();
		// Calendar 클래스는 추상 클래스라서 new연산자로 인스턴스화가 안된다.
		
		int nowYear = calendar.get(Calendar.YEAR);
		// 운영체제가 가지고 있는 시간을 가져온다.
		System.out.println(nowYear);
		
		

	}

}
