package dngky;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 123456789;
		System.out.printf("%d%n", n);
		System.out.format("%012d%n", n);
		System.out.format("%+9d%n", n);
		System.out.format("%,9d%n", n);
		System.out.format("%+,9d%n%n", n);
		
		double pi = 3.1415926;
		System.out.format("%f%n", pi);
		System.out.format("%.2f%n", pi);
		System.out.format("%-12.3f%n", pi);
		System.out.format("%12.3f%n", pi);
		
		String name = "Can";
		String lang = "java";
		String value = String.format("%s %s", name, lang);
		System.out.println(value);
		
		//DecimalFormat 클래스는 new 연산자를 사용하여 객체를 생성
		//format 메소드를 사용하여 특정 패턴으로 값을 포맷 지정
		//지정할 수 있는 패턴 형식은 '0' 과 '#'을 사용하여 지정
		double value2 = 123456.78925;
		String pattern = "###,###.#####";
		
		DecimalFormat fmt = new DecimalFormat(pattern);
		String output = fmt.format(value2);
		System.out.println(value2 + " + " + pattern + " = " + output);
		
		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		System.out.println(format.format(now));
		
		format = new SimpleDateFormat("E MMM dd HH:mm:ss",Locale.UK);
		System.out.println(format.format(now));
		
		Calendar c = Calendar.getInstance();
		//년(전체): %tY, 년(두자리):%ty, 달 %tB,
		//달(전체)%tB %tb(약어), 달수(%m)
		//일(전체이름):%tA,(약어)%ta, (mm/dd/yy)%td
		//현재일 %te
		System.out.printf("%tY %tB %te %n", c,c,c);
		
		//AM/PM: %p, 시(24시간): %, (12시간): %i
		System.out.printf("%tp %tl:%tM:%tS %n", c, c, c, c);
		System.out.printf("%tD", c);
		
	}

}
