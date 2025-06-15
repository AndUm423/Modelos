package FM;

public class CremaChocolatee implements FabChocolate{

    @Override
    public String tipoChocolate() {
        if (validarInsumos().equals("Se cuenta con los insumos")){
            return "Se fabricara Crema de Chocolate con Factory Method.";
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
