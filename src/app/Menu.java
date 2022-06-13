package app;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    int opcao = 0;

    CadastrarUsuario registeruser = new CadastrarUsuario();
    EventsConcert eventsConcert = new EventsConcert();
    EventsWedding eventswedding = new EventsWedding();
    EventsLecture eventsLecture = new EventsLecture();
    PresentList presentList = new PresentList();


    public void menuOpcao() {

        do{
            System.out.println("Bem vindo ao sistema de eventos");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Cadastrar evento");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    registeruser.CadastrarUser();
                    break;
                case 2:
                    int optionEvent;
                    do {
                        System.out.println("Qual o tipo do evento:");
                        System.out.println("1 - Shows");
                        System.out.println("2 - Casamentos");
                        System.out.println("3 - Palestras");
                        optionEvent = sc.nextInt();
                        if (optionEvent == 1) {
                            eventsConcert.RegisterEventsConcert();
                        } else if (optionEvent == 2) {
                            eventswedding.RegisterEventsWedding();
                        } else if (optionEvent == 3){
                            eventsLecture.RegisterEventsLecture();
                        }else{
                            System.out.println("Digite uma opção valida");
                        }
                    }while (optionEvent != 0);
                case 3:

                    break;
                default:
                    System.out.println("Numero errado");
                    break;
            }
        }while(opcao !=0);
    }
}
