package app;

import java.util.Scanner;

/*Classe para Registro de usuario*/
public class RegisterUser {
	/*Istanciamento da classe scanner*/
    Scanner sc = new Scanner(System.in);
    
    /*Declaração dos atributos da classe*/
    private String user;
    private int password, phone, cpf;

    /*Getter e Setter da classe*/
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /*Metodo para o registro do usuario*/
    public void CadastrarUser(){
        System.out.println("Digite seu usuario: ");
        setUser(sc.nextLine());

        System.out.println("Digite uma senha de ate 4 numeros: ");
        setPassword(sc.nextInt());
        

        System.out.println("Digite seu telefone: ");
        setPhone(sc.nextInt());

        System.out.println("Digite seu cpf sem caracteres especiais: ");
        setCpf(sc.nextInt());
    }
    
    
    /*Metodo para o retorno de confirmação de registro*/
    public void RegisterSuccess(){
        System.out.println("Registrado com sucesso"
                +"\n Nome de usuario: " + getUser()
                +"\n Senha: " + getPassword()
                +"\n Telefone: " + getPhone()
                +"\n Cpf: " + getCpf());
    }
}
