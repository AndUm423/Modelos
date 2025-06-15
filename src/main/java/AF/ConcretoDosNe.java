package AF;

import AF.ChocolateNegro;

public class ConcretoDosNe implements ServFabricar{
    
    @Override
    public SerValidar Fabricar() {
	return new ChocolateNegro();
    }
    
}
