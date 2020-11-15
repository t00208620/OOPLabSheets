package labsheet10.exercise1;

//TestInterface.java
/*A driver program that tests the functionality of the Student, UnderGraduate and
PostGraduate classes as well as the Person interface*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestInterface {
	public static void main(String args[]) {
		//System.out.println("Testing the UnderGraduate no-arg constructor: ");
		UnderGraduate u1 = new UnderGraduate();
		//System.out.println(u1);

		//System.out.println("\n\nTesting the UnderGraduate multi-arg constructor: ");
		UnderGraduate u2 = new UnderGraduate("Tommy Tiernan", "Galway", new GregorianCalendar(1970,5,22),"t123456","Comedy",3.12);
		//System.out.println(u2);

		//System.out.println("\n\nTesting the PostGraduate no-arg constructor: ");
		PostGraduate p1 = new PostGraduate();
		//System.out.println(p1);

		//System.out.println("\n\nTesting the PostGraduate multi-arg constructor: ");
		PostGraduate p2 = new PostGraduate("Eddie Murphy", "USA", new GregorianCalendar(1961,7,10), "t234567", "Comedy", "Frank Carson");
		//System.out.println(p2);

		//System.out.println("\n\nTesting the PermanentLecturer multi-arg constructor: ");

		PermanentLecturer pl1 = new PermanentLecturer("Thomas Aquinas","Dublin",new GregorianCalendar(1984,11,31),"52673",
				new String[]{"Economics 101","Media Presentation","Political Debate"},new GregorianCalendar(2003, 5,23),
				"Lots and lots of Pension Entitlements :-)","Full-time Professorship");

		PermanentLecturer pl2 = new PermanentLecturer("Uncle Bob Martin","Philadelpia, USA",new GregorianCalendar(1952,3,19),"t0044356",
				new String[]{"Agile Methods","OO Analysis & Design","Design Patterns"},new GregorianCalendar(1986,2,18),
				"Oodles of Pension Entitlements :-)","Part-time Senior Research Fellow");

		//System.out.println(pl1 + "\n\n" + pl2);

		//System.out.println("\n\nTesting the TemporaryLecturer multi-arg constructor: ");

		TemporaryLecturer tl1 = new TemporaryLecturer("Richard O' Neill","Tallaght, Dublin",new GregorianCalendar(1985,2,4),"3536278b",
				new String[]{"Applied Biology","Microbiology"},new GregorianCalendar(2018,3,15),762);

		//System.out.println(tl1);

		TemporaryLecturer tl2 = new TemporaryLecturer("Mary McKenzie","Bundoran, Donegal",new GregorianCalendar(1971,5,13),"647382",
				new String[]{"Fractal Geometry","Tensors"},new GregorianCalendar(2016,2,8),1342);

		Person[] allPersons = {u1,u2,p1,p2,pl1,pl2,tl1,tl2};

		System.out.println("\n\nTesting the functionality of PermanentLecturer and TemporaryLecturer, as well as UnderGraduate and PostGraduate,\n" +
				"by displaying object state of all four concrete classes polymorphically, using a loop and the interface Person as a reference\n\n");

		for(int i=0;i<allPersons.length;i++)
			System.out.println(allPersons[i] + "\n\n");



	}
}