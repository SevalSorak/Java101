package boks_oyunu;

public class Match { 
	
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) 
	{	
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	
	void run()
	{
		if(isCheck())
		{
			// İlk kimin dövüşe başlayacağını %50 olasılıkla belirle
			Fighter firstAttacker = (Math.random() < 0.5) ? f1 : f2;
			Fighter secondAttacker = (firstAttacker == f1) ? f2 : f1;
			while(this.f1.health > 0 && this.f2.health > 0)
			{
				System.out.println("======Yeni Round======");
				secondAttacker.health = firstAttacker.hit(secondAttacker);
				if(isWin())
				{
					break;
				}
				
				firstAttacker.health = secondAttacker.hit(firstAttacker);
				if(isWin())
				{
					break;
				}
				System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
				System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
			}
		}
		else
		{
			System.out.println("Sporcuların sikletleri uymuyor.");
		}
	}
	
	boolean isCheck()
	{
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}
	
	boolean isWin()
	{
		if(this.f1.health == 0)
		{
			System.out.println(this.f2.name + " kazandı!");
			return true;
		}
		if(this.f2.health == 0)
		{
			System.out.println(this.f1.name + " kazandı!");
			return true;
		}
		return false;
	}
	
}
