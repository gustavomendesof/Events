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
    Notification notification = new Notification();


    public void menuOpcao()  {
        do{
            List<RegisterEvents> events = new ArrayList<>();
            List<String> presentList = new ArrayList<>();

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
            System.out.println("3 - Marcar Presenca");
            System.out.println("0 - Encerrar");
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
                                    eventsConcert.getSinger(),
                                    presentList
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
                                    eventsWedding.getNameChurch(),
                                    presentList
                            ));
                            eventsWedding.RegisterSuccess();
                        } else if (optionEvent == 3) {
                            eventsLecture.RegisterEventsLecture();
                            events.add(new EventsLecture(
                                    eventsLecture.getNameEvent(),
                                    eventsLecture.getPlaceEvent(),
                                    eventsLecture.getInfo(),
                                    eventsLecture.getStartTime(),
                                    eventsLecture.getFinalTime(),
                                    eventsLecture.getCapacity(),
                                    eventsLecture.getNameSpeaker(),
                                    presentList
                            ));
                            eventsLecture.RegisterSuccess();
                        } else if(optionEvent != 0) {
                            System.out.println("Digite uma opcao valida");
                        }
                        notification.notificationEvents();
                    }while (optionEvent != 0);
                    try {
                        FileWriter fileWriter = new FileWriter(arquivo,false);
                        PrintWriter printWriter = new PrintWriter(fileWriter);
                        printWriter.println(events);
                        printWriter.flush();
                        printWriter.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 3:
                    try {
                        String line = "";
                        FileReader fileReader = new FileReader(arquivo);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        while ((line = bufferedReader.readLine() ) != null) {
                            System.out.println(line);
                        }
                        fileReader.close();
                        bufferedReader.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Numero errado");
                    break;
            }
        }while(opcao !=0);
    }
}
