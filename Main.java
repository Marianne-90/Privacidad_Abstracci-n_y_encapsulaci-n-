class Main {
  public static void main(String[] args) {
    Persona miPersona = new Persona();
    miPersona.setEdad(25);
    miPersona.setNombre("Marianne");
    miPersona.setTelefono("221-157-65-25");
                          
    int edad = miPersona.getEdad();
    String nombre = miPersona.getNombre();
    String telefono = miPersona.getTelefono();
    
    System.out.println("Hola mi nombre es " + nombre + " tengo " + edad + " años y mi teléfono es " + telefono);
  };
}

class Persona {
  
  private int edad;
  
  public void setEdad(int edad){
    this.edad = edad;
  }
  public int getEdad(){
    return this.edad;
  }

  
  private String telefono;

   public void setTelefono(String telefono){
    this.telefono = telefono;
  }
  public String getTelefono(){
    return this.telefono;
  }

  
  private String nombre;

     public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return this.nombre;
  }

  
};