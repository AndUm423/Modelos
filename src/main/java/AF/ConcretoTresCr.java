package AF;

import AF.CremaChocolate;

public class ConcretoTresCr implements ServFabricar{

    @Override
    public SerValidar Fabricar() {
	return new CremaChocolate();
    }
    
}
