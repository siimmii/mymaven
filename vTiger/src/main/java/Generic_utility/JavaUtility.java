package Generic_utility;

import java.util.Random;

public class JavaUtility {
	/**
	 * This method is used for avoiding duplicates
	 * @return
	 * @author akhil
	 */
	public int getRandomNum()
	{
		Random r= new Random();
		int RanNum=r.nextInt();
		return RanNum;
	}
}
