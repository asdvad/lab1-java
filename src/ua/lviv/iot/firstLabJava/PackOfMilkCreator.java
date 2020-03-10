package ua.lviv.iot.firstLabJava;

public class PackOfMilkCreator {
	public static void main(String[] args) {
		{

			PackOfMilk firstPackOfMilk = new PackOfMilk();
			PackOfMilk secondPackOfMilk = new PackOfMilk("Dobriana", 8, 500, 1100);
			PackOfMilk thirdPackOfMilk = new PackOfMilk("MilkLTD", 6, 750, 800, "Tetra-Pack", 60, true, "Ukraine",
					"Very Tasty!");

			System.out.println("*****FirstPackOfMilk********");
			System.out.println(firstPackOfMilk);
			System.out.println("*****SecondPackOfMilk********");

			System.out.println(secondPackOfMilk);
			System.out.println("*****ThirdPackOfMilk********");

			System.out.println(thirdPackOfMilk);
			System.out.println("*******");

			System.out.println();
			System.out.println(thirdPackOfMilk.printExistanceOfCap());
			System.out.println(PackOfMilk.printStaticExistanceOfCap());
			System.out.println("*******Cycles********");

			PackOfMilk[] arrayOfPacksOfMilk = new PackOfMilk[4];
			int iterator = 0;
			/*
			 * while (iterator < 4) { arrayOfPacksOfMilk[iterator] = new PackOfMilk();
			 * iterator++; }
			 */

			for (int itrator = 0; itrator < 4; itrator++) {
				arrayOfPacksOfMilk[itrator] = new PackOfMilk();
			}

			iterator = 1;
			for (PackOfMilk itPackOfMilk : arrayOfPacksOfMilk) {
				System.out.println(iterator + " PackOfMilk:");
				System.out.println(itPackOfMilk);
				iterator++;
			}
		}
	}
}
