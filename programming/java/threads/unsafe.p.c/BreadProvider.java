package unsafe;

import java.util.ArrayList;
import java.util.Random;

public class BreadProvider extends Thread{
	private ArrayList<Bread> breads;  // storage can hold up to 10 breads
	private Integer breads_sold; // how many bread were sold
	private Integer bread_id;
	
	public BreadProvider() {
		super();
		breads = new ArrayList<>();
		this.breads_sold = 0;
		this.bread_id = 0;
	}



	@Override
	public void run() {
		while(true) {
			if(breads.size()<10) {
				produceOneBread();
			}
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void produceOneBread() {             // why is this private?
		Bread fresh_bread = new Bread("White",++bread_id);
		System.out.println( this + " PRODUCING > " + fresh_bread );
		breads.add( fresh_bread );
	}
	
	public Bread sellOneBread() {
		if( breads.size() > 0 ) {
			breads_sold++;
			return breads.remove(0); // sell starting with the oldest
		} else {
			return null; // nothing to sell yet
		}
	}



	@Override
	public String toString() {
		return "BreadProvider (sold: "+breads_sold+" left: "+breads.size()+")";
	}
	
}

