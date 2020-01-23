
package Classes;

public class Dados {
    public boolean validaUsuarios(String usuario, String senha){
        if (usuario.equals("") && senha.equals("")){
            return true;
        }else{
            return false;
        }
    }
    
}
