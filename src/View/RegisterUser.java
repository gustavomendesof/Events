package View;

import java.util.Scanner;

public class RegisterUser {
    Scanner sc = new Scanner(System.in);

    private String user;
    private int password, phone, cpf;


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


}
