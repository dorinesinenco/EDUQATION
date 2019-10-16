package unsafe;

import java.util.ArrayList;
import java.util.Random;

public class BreadProvider extends Thread{
	private ArrayList<Bread> breads;  // storage can hold up to 10 breads
	private Integer total_breads; // how many bread was produced
	
	
	public BreadProvider() {
		super();
		breads = new ArrayList<>();
		this.total_breads = 0;
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
		Bread fresh_bread = new Bread("White");
		System.out.println( this + " PRODUCING > " + fresh_bread );
		breads.add( fresh_bread );
		total_breads++;
	}
	
	public Bread sellOneBread() {
		if( breads.size() > 0 ) {
			return breads.remove(0); // sell starting with the oldest
		} else {
			return null; // nothing to sell yet
		}
	}



	@Override
	public String toString() {
		return "BreadProvider (total: "+total_breads+" left: "+breads.size()+")";
	}
	
}

