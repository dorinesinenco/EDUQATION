package unsafe;

public class BreadConsumer extends Thread{
	
	private String name;
	private Integer total_breads;  // how many bread was consumed
	private Bread bread_reserve;       // has only one bread as reserve
	private BreadProvider provider;
	
	public BreadConsumer(String name, BreadProvider provider) {
		super();
		this.name = name;
		this.provider = provider;
		this.total_breads = 0; 
	}
	
	public void consumeOneBread() {
		if( bread_reserve != null ) {
			total_breads++;
			System.out.println( this + " CONSUMING < " + bread_reserve );
			bread_reserve = null;
		}
	}
	
	public void buyOneBread() {
		Bread fresh_bread = provider.sellOneBread(); 
		if( fresh_bread != null ) {
			System.out.println( this + " BUYING < " + fresh_bread );
			bread_reserve = fresh_bread;
		}
	}

	@Override
	public void run() {
		while(true) {
			if(bread_reserve == null) {  // if there is no bread
				buyOneBread();
			}
			consumeOneBread();
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		return "           BreadConsumer (total: "+total_breads+") [name=" + name + "]";
	}
	
	
	
	
	
}
