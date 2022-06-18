package View;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    int opcao = 0;
    RegisterUser registeruser = new RegisterUser();
    EventsConcert eventsConcert = new EventsConcert();
    EventsWedding eventsWedding = new EventsWedding();
    EventsLecture eventsLecture = new EventsLecture();
    PresentList presentList = new PresentList();
    Notification notification = new Notification();


    public void menuOpcao()  {
        do{
            List<RegisterEvents> events = new ArrayList<>();
            File arquivo = new File("Events/src/events.data");

            try {
                String eventos = "";
                FileReader fileReader = new FileReader(arquivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ( ( eventos = bufferedReader.readLine() ) != null) {
                    System.out.println(eventos);
                }
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Bem vindo ao sistema de eventos");
            System.out.println("Evento Marcado para os proximos dias");
            System.out.println("Menu");
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
                        System.out.println("0 - Sair");
                        optionEvent = sc.nextInt();

                        if (optionEvent == 1) {
                            eventsConcert.RegisterEventsConcert();
                            events.add(new EventsConcert(
                                    eventsConcert.getNameEvent(),
                                    eventsConcert.getPlaceEvent(),
                                    eventsConcert.getInfo(),
                                    eventsConcert.getStartTime(),
                                    eventsConcert.getFinalTime(),
                                    eventsConcert.getCapacity(),
                                    eventsConcert.getSinger()
                            ));
                        } else if (optionEvent == 2) {
                            eventsWedding.RegisterEventsWedding();
                            events.add(new EventsWedding(
                                    eventsWedding.getNameEvent(),
                                    eventsWedding.getPlaceEvent(),
                                    eventsWedding.getInfo(),
                                    eventsWedding.getStartTime(),
                                    eventsWedding.getFinalTime(),
                                    eventsWedding.getCapacity(),
                                    eventsWedding.getNameFiancee(),
                                    eventsWedding.getNameEngaged(),
                                    eventsWedding.getNameChurch(),
                                    eventsWedding.getNameChurch()
                            ));
                        } else if (optionEvent == 3) {
                            eventsLecture.RegisterEventsLecture();
                            events.add(new EventsLecture(
                                    eventsLecture.getNameEvent(),
                                    eventsLecture.getPlaceEvent(),
                                    eventsLecture.getInfo(),
                                    eventsLecture.getStartTime(),
                                    eventsLecture.getFinalTime(),
                                    eventsLecture.getCapacity(),
                                    eventsLecture.getNameSpeaker())
                            );
                        } else {
                            System.out.println("Digite uma opção valida");
                        }
                        notification.notificationEvents();
                    }while (optionEvent != 0);
                case 3:
                    break;
                default:
                    System.out.println("Numero errado");
                    break;
            }
            try {
                FileWriter fileWriter = new FileWriter(arquivo,false);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.println(events);
                printWriter.flush();
                printWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }while(opcao !=0);
    }
}
