
package Classes;

public class Dados {
    public boolean validaUsuarios(String usuario, String senha){
        if (usuario.equals("ti") && senha.equals("123")){
            return true;
        }else{
            return false;
        }
    }
    
}
