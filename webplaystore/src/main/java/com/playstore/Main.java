import classes.Usuario;

import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Usuario usuario = new Usuario("Patricia", "patriciareghine@gmail.com",2006-02-02);

        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Senha: " + usuario.getSenha());
    }

}