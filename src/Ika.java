import java.util.Scanner;

public class Ika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int ika;
		
		System.out.println("Anna ikäsi: ");
		ika = in.nextInt();
		
		if (ika > 0 && ika < 18) 
		{ 
			System.out.println("Olet alaikäinen");  
			if (ika == 15) 
				{
					System.out.println("Saat ajaa mopoa"); 
				}
				if (ika >= 16)
				{
					System.out.println("Saat ajaa kevaria");
				}
		}
		else if (ika == 18)
		{
			System.out.println("Olet saavuttanut täysi-ikäisyyden. Saat ajaa autoa.");
		}
		else if (ika == 100)
		{
			System.out.println("Onnea!");
			System.out.println("Onnea!");
			System.out.println("Onnea!");
		}
		
		else if (ika >= 65) 
		{ 
			System.out.println("Olet eläkeläinen"); 
		} 
			if (ika == 65)
			{
				System.out.println("Hyviä eläkepäiviä!");
			}
		
		else 
		{ 
			System.out.println("Olet aikuinen"); 
		}
			if (ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60)
			{
				System.out.println("Tervetuloa uudelle vuosikymmenelle!");
			}
			if (ika == 58)
			{
				System.out.println("Voit jäädä varhaiseläkkeelle.");
			}
			if (ika >= 40 && ika <= 50)
			{
				System.out.println("Parasta keski-ikää!");
			}
		
		
	}

}
	
