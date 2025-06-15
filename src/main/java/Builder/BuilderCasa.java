package Builder;

public class BuilderCasa implements Builder{
	public Casa c;
	
	public BuilderCasa(){
		this.reset();
	}
	
	@Override
	public void reset() {
		this.c = new Casa();
		
	}

	@Override
	public void setPisos(int p) {
		this.c.setPisos(p);
		
	}

	@Override
	public void setVentanas(int v) {
		this.c.setVentanas(v);
	}

	public Casa getCasa() {
		// TODO Auto-generated method stub
		Casa casa = this.c;
		
		return casa;
	}

}
