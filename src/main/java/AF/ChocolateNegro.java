package AF;

/**
 *
 * @author edg-a
 */
public class ChocolateNegro implements SerValidar{

    @Override
    public String tipoChocolate() {
        if (validarInsumos().equals("Se cuenta con los insumos")){
            return "Se fabricara Chocolate Negro con Abstract Factory";
        } else {
            return "Lastima, no se podra";
        }
    }

    @Override
    public String validarInsumos() {
        if(true){ //Validar insumos
            return "Se cuenta con los insumos";
        }
        return "No se podra fabricar";
    }   
    
}
