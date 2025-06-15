package Builder;

public class Director {
	Builder builder;
	
	public void constructCasa(Builder builder){
		builder.reset();
		builder.setPisos(2);
		builder.setVentanas(4);
	}
	
	public void constructEdificio(Builder builder){
		builder.reset();
		builder.setPisos(10);
		builder.setVentanas(30);
	}
}

