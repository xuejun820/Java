package observe;

import java.util.Observable;

public class ObserveDemo {

}


class House extends Observable
{
	private float price;

	public House(float price) {
		super();
		this.price = price;
	}
	
	public void setPrice(float price)
	{
		super.setChanged();
		super.notifyObservers(price);
		this.price=price;
	}
	
	public String toString()
	{
		return "房子的价格是： "+this.price;
	}



	public float getPrice()
	{
		return price;
	}
	
	
}
