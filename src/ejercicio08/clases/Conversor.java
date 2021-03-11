package ejercicio08.clases;

public class Conversor {
    private String hexadecimal;
    private Integer decimal;

    public Conversor(String hexadecimal) {
        this.setHexadecimal(hexadecimal);
    }

    public Integer getDecimal() {
        return decimal;
    }
    public void setDecimal(Integer decimal) {
        this.decimal = decimal;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }
    public void setHexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    public void mostrarDatos(){
        System.out.println("El número hexadecimal: " + this.getHexadecimal());
        System.out.println("El número en decimal es: " + this.getDecimal());
    }

    public Boolean convertirNúmero() throws InvalidNumberException{
        try{
            this.setDecimal(Integer.parseInt(this.getHexadecimal(),16));
            return true;
        }
        catch(NumberFormatException e){
            var error = new InvalidNumberException("Número hexadecimal inválido.");
            throw error;
        }
    }
}