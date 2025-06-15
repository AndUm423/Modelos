package FM;

/**
 *
 * @author edg-a
 */
public class ChocolateNegro implements FabChocolate{

    @Override
    public String tipoChocolate() {
        if (validarInsumos().equals("Se cuenta con los insumos")){
            return "Se fabricara Chocolate Negro con Factory Method";
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
