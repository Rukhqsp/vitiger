
	package com.vtiger.genericlib;
	/**
	 * This method is used for reusable of java programs 
	 */

	import java.util.Date;
	import java.util.Random;

	import org.testng.annotations.Test;

	public final class JavaUtility {
		
		
		/**
		 * This method is used to generate the random number and avoid any duplicate value to form
		 * @return
		 */
		public int generateRandom(int num)
		{
		
		Random r = new Random();
		return r.nextInt(num);
		}
		/**
		 * This method is used to set the date and time format at the time of screenshot
		 * @return 
		 */
		public String generateDateTimeFormate()
		{
			Date d = new Date();
			//d.toString();
			String[] s1=  d.toString().split(" ");
			String currentdate=s1[2]+"_"+s1[1]+"_"+s1[5]+"--"+s1[3];
			return currentdate;

		}
		@Test
		public void m1()
		{
			System.out.println(generateDateTimeFormate());
		}

	}



