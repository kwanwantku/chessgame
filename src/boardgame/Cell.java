package boardgame;
/**
 * Created by pranger54 on 5/20/2017 AD.
 */
public class Cell {
	
	private Item item;
	public Item push(Item item) {
		Item tmp = this.item;
		this.item = item;
		return tmp;
		
	}
	
	public Item getItem() {
		return this.item;
	}
}
