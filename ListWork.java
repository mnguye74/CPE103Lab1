/*	Karthik Jayakumar
	Tri Minh Nguyen
*/

// Class Imports
import java.util.*;

// Class Definition
class ListWork
{
	/**
	 * Simple generic method to search an array for a specified target element.
	 * If target is found in the array, returns true otherwise returns false
	 * @param  arr    Array to search for target
	 * @param  target Type of object to search for
	 * @return        Returns true if target is found within array, false if not
	 */
	public static <E> boolean search (E[] arr, E target)
	{
		boolean isThere = false;
		for (int i=0; i < arr.length; i++)
		{
			if (target == arr[i])
			{
				isThere = true;
			}
		}
		return isThere;
	}
	/**
	 * Simple generic method that prints out the specified array values.
	 * @param  arr The target array to print out values from
	 * @return     Void
	 */
	public static <E> void print(E[] arr)
	{
		for (int i = 0; i<arr.length; i++)
		{
			System.out.println("Index: " + i + " Value: " + arr[i]);
		}
	}

	public static void main (String args[])
	{
		Integer numbers[] = new Integer[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 integers:");
		int counter = 0;
		boolean exit = false;
		String check;
		while (counter < numbers.length)
		{
			try
			{
				numbers[counter] = input.nextInt();
				counter++;
			}
			catch (InputMismatchException e)
			{
				// input.close();
				input = new Scanner(System.in);
			}
		}
		while(!exit)
		{
			System.out.println("Do you wish to search array y/n?");
			check = input.next();
			if (null != check)
				switch (check)
				{
					case "y":
                    System.out.print("Please enter a target to search array for: ");
                    try
                    {
                    	if (search(numbers, input.nextInt()))
                    		System.out.println("Yes, the element exists!");
                    	else
                    		System.out.println("No, the element doesn't exist");
                    }
                    catch (InputMismatchException e)
                    {
                    	System.out.println("Incorrect type entered, please enter correct type next time!");
                    	input = new Scanner(System.in);
                    }
                    break;
                    case "n":
                    System.out.println("Printing List:");
                    print(numbers);
                    exit = true;
                    break;
                    default:
                    System.out.println("Please only type y/n !");
                    break;
                }
		}
	}
}
