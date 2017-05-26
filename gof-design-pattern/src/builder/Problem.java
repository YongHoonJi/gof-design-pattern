package builder;

public class Problem {
	
	public static void main(String[] args) {
		
		String type = "hwaii";
		Problem p = new Problem();
		
		System.out.println(p.getPizza(type).toString());
	}
	
	private Pizza getPizza(String type){
		
		Pizza p = new Pizza();
		if(type.equals("hwaii")){
			p.setDough("cross");
			p.setSauce("mild");
			p.setTopping("ham+pineapple");
		}else{
			p.setDough("pan baked");
			p.setSauce("hot");
			p.setTopping("pepperoni+salami");
		}
		return p;
	}

}
