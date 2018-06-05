package taskFlowers.run;

import taskFlowers.entity.assesories.Assesories;
import taskFlowers.entity.byket.Byket;
import taskFlowers.entity.flowers.TypeFlower;

//Определить иерархию цветов. Создать несколько объек-
//тов-цветов. Собрать букет (используя аксессуары) с определением его
//стоимости. Провести сортировку цветов в букете на основе уровня све-
//жести. Найти цветок в букете, соответствующий заданному диапазону
//длин стеблей.

public class CoupleOfFlowers{

	private static TypeFlower[] MyFlower;
	private static Assesories[] MyAssesories;


	public static void main(String[] args) {
		
		TypeFlower podsnegnik=new TypeFlower("Podsnegnik", 1, 9);
		TypeFlower landish=new TypeFlower("Landish", 1, 10.1);
		TypeFlower listok=new TypeFlower("Listok", 2, 8);
		
		System.out.println();
		
		Assesories lenta=new Assesories ("Lenta", "Rozovii", 2.2);
		Assesories plenka=new Assesories ("Plenka", "Prozrachniy", 3.2);
		Assesories topper=new Assesories ("Topper", "Derevo", 7.2);
		
		System.out.println();
		
		TypeFlower [] MyFlower=new TypeFlower [3];
		Assesories [] MyAssesories=new Assesories [3];
		
		MyFlower[0]=podsnegnik;
		MyFlower[1]=landish;
		MyFlower[2]=listok;
		
		MyAssesories[0]=lenta;
		MyAssesories[1]=plenka;
		MyAssesories[2]=topper;	
		
		Byket myByket=new Byket (MyFlower, MyAssesories);


		System.out.println();
		
		
//		CoupleOfFlowers COF= new CoupleOfFlowers(Object MyFlower, Object MyAssesories);
		
//		CoupleOfFlowers[] COF= new CoupleOfFlowers[6] {
//				CoupleOfFlowers.MyFlower[0]=podsnegnik,
//				CoupleOfFlowers.MyFlower[1]=landish,
//				CoupleOfFlowers.MyFlower[2]=listok,
//				
//				CoupleOfFlowers.MyAssesories[0]=lenta,
//				CoupleOfFlowers.MyAssesories[1]=plenka,
//				CoupleOfFlowers.MyAssesories[2]=topper
//		};
//		
		
		
//		
//		CoupleOfFlowers [] COF= new CoupleOfFlowers[6];
//		
//		CoupleOfFlowers.MyFlower=new TypeFlower [3];
//		CoupleOfFlowers.MyAssesories=new Assesories [3];
//		System.out.println();
//		
//		CoupleOfFlowers.MyFlower[0]=podsnegnik;
//		CoupleOfFlowers.MyFlower[1]=landish;
//		CoupleOfFlowers.MyFlower[2]=listok;
//		System.out.println();
//		
//		CoupleOfFlowers.MyAssesories[0]=lenta;
//		CoupleOfFlowers.MyAssesories[1]=plenka;
//		CoupleOfFlowers.MyAssesories[2]=topper;
//		System.out.println();
//		
//		Byket myByket=new Byket (MyFlower, MyAssesories);
//		
//		Byket  myByket= new (CoupleOfFlowers.MyFlower[], CoupleOfFlowers.MyAssesories[]);
//		Букет майБукет = new Букет(МоиЦветы, МоиАксесуары);
//		
//		int numbers[] = new int[100];
//		
//		for (int i = 0, j = 1; i < numbers.length; i++, j++) {
//			numbers[i] = j;
//		}
//		
//		for (int i = 0 ; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}

	} 
//		double symma;
//		for (int i=1; i<COF.length; i++) {
//		symma+=CoupleOfFlowers.TypeFlower.getCost();
//		}
//		System.out.println(COF);

	}


