package Builder;

public class BuilderEdificio implements Builder{
	public Edificio e;

	public BuilderEdificio(){
		this.reset();
	}
	
	@Override
	public void reset() {
		this.e = new Edificio();
		
	}

	@Override
	public void setPisos(int p) {
		this.e.setPisos(p);
	}

	@Override
	public void setVentanas(int v) {
		this.e.setVentanas(v);
	}
	
	public Edificio getEdificio() {
		Edificio edif = this.e;
		
		return edif;
	}
}
