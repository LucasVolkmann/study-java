public class Tecnico extends Aluno{

    private String registro;

    public void praticar(){
        System.out.println("Praticando...");
    }

    public void setRegistro(String registro){
        this.registro = registro;
    }
    public String getRegistro(){
        return registro;
    }
    
}
