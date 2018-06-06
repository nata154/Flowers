package taskFlowers.run;

import taskFlowers.entity.assesories.Assesories;
import taskFlowers.entity.assesories.typeAssesories.Lenta;
import taskFlowers.entity.assesories.typeAssesories.Paket;
import taskFlowers.entity.byket.Byket;
import taskFlowers.entity.flowers.Flower;
import taskFlowers.entity.flowers.typeFlower.Landish;
import taskFlowers.entity.flowers.typeFlower.Podsnegnik;

//Определить иерархию цветов. Создать несколько объек-
//тов-цветов. Собрать букет (используя аксессуары) с определением его
//стоимости. Провести сортировку цветов в букете на основе уровня све-
//жести. Найти цветок в букете, соответствующий заданному диапазону
//длин стеблей.

public class Run{
	public static void main (String[] args) {
		Landish landish1=new Landish("RB", "belii", 15, 1, 3, true);
		Podsnegnik podsnegnik1=new Podsnegnik("RB", "belii", 10, 2, 4, false);
		Flower [] myFlowers= {landish1, podsnegnik1};
		
		Lenta lenta1= new Lenta("RB", 3, 15, "rozovii");
		Paket paket1= new Paket("RB", 1, "rozovii");
		Assesories [] myAccessories={lenta1, paket1};
		
		Byket myByket=new Byket(myFlowers, myAccessories);
		
		double priceForMyByket=myByket.getCost();
		Flower flowerByLengthRange=myByket.getFlowerByLengthRange(1, 14);
		
		System.out.println("Price For My Byket: " +priceForMyByket+" $.");
		System.out.println("Flower By Length Range: " +flowerByLengthRange);
	}


	}


