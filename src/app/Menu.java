package app;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    /*Instanciamento da classes do sistema e Scanner*/
    Scanner sc = new Scanner(System.in);
    RegisterUser registeruser = new RegisterUser();
    EventsConcert eventsConcert = new EventsConcert();
    EventsWedding eventsWedding = new EventsWedding();
    EventsLecture eventsLecture = new EventsLecture();

    /*Declaração da variavel*/
    int opcao = 0;

    /*Classe para a execução do Menu*/
    public void menuOpcao()  {
        do{
            List<RegisterEvents> events = new ArrayList<>();
            List<String> presentList = new ArrayList<>();

            /*Local do arquivo events.data*/
            File arquivo = new File("Events/src/events.data");


            System.out.println("Bem vindo ao sistema de eventos");
            System.out.println("Evento Marcado para os proximos dias");
            System.out.println("Menu");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Cadastrar evento");
            System.out.println("3 - Eventos Disponiveis");
            System.out.println("0 - Encerrar");
            opcao = sc.nextInt();
            /*Switch responsavel pela execução das opções do sistema*/
            switch (opcao) {
                case 1:
                    /*Chamada do metodo CadastrarUser que esta na clase registeruser, metodo responsavel por cadastrar usuraio */
                    registeruser.CadastrarUser();
                    break;
                case 2:
                    /*Declaração da variavel optionEvent, responsavel pelo andamento do laço de repetição do menu de opções de evento*/
                    int optionEvent;
                    do {
                        System.out.println("Qual o tipo do evento:");
                        System.out.println("1 - Shows");
                        System.out.println("2 - Casamentos");
                        System.out.println("3 - Palestras");
                        System.out.println("0 - Sair");
                        optionEvent = sc.nextInt();
                        /*If para seleção da variavel optionEvent*/
                        if (optionEvent == 1) {
                            /*Chamada do metodo RegisterEventsConcert da classe eventsConcert, responsalvel pelo cadastro do evento de shows e retorno de registrado com sucesso*/
                            eventsConcert.RegisterEventsConcert();
                            /*metodo para adicionar as informações ao sitema*/
                            events.add(new EventsConcert(
                                    eventsConcert.getNameEvent(),
                                    eventsConcert.getPlaceEvent(),
                                    eventsConcert.getInfo(),
                                    eventsConcert.getDate(),
                                    eventsConcert.getStartTime(),
                                    eventsConcert.getFinalTime(),
                                    eventsConcert.getCapacity(),
                                    eventsConcert.getSinger(),
                                    presentList
                            ));

                            /*Metodo para retorno de confirmação de registro*/
                            eventsConcert.RegisterSuccess();
                        } else if (optionEvent == 2) {
                            /*Chamada do metodo RegisterEventsWedding da classe eventsWedding, responsalvel pelo cadastro do evento de casamentos e retorno de registrado com sucesso*/
                            eventsWedding.RegisterEventsWedding();
                            /*metodo para adicionar as informações ao sitema*/
                            events.add(new EventsWedding(
                                    eventsWedding.getNameEvent(),
                                    eventsWedding.getPlaceEvent(),
                                    eventsWedding.getInfo(),
                                    eventsWedding.getDate(),
                                    eventsWedding.getStartTime(),
                                    eventsWedding.getFinalTime(),
                                    eventsWedding.getCapacity(),
                                    eventsWedding.getNameFiancee(),
                                    eventsWedding.getNameEngaged(),
                                    eventsWedding.getNameChurch(),
                                    eventsWedding.getNameChurch(),
                                    presentList
                            ));
                            /*Metodo para retorno de confirmação de registro*/
                            eventsWedding.RegisterSuccess();
                        } else if (optionEvent == 3) {
                            /*Chamada do metodo RegisterEventsLecture da classe eventsLecture, responsalvel pelo cadastro do evento de Palestras e retorno de registrado com sucesso*/
                            eventsLecture.RegisterEventsLecture();
                            /*metodo para adicionar as informações ao sitema*/
                            events.add(new EventsLecture(
                                    eventsLecture.getNameEvent(),
                                    eventsLecture.getPlaceEvent(),
                                    eventsLecture.getInfo(),
                                    eventsLecture.getDate(),
                                    eventsLecture.getStartTime(),
                                    eventsLecture.getFinalTime(),
                                    eventsLecture.getCapacity(),
                                    eventsLecture.getNameSpeaker(),
                                    presentList
                            ));
                            /*Metodo para retorno de confirmação de registro*/
                            eventsLecture.RegisterSuccess();
                        } else if(optionEvent != 0) {
                            /*Retorno caso o usaruio responda alguma opcao invalida*/
                            System.out.println("Digite uma opcao valida");
                        }

                    }while (optionEvent != 0);
                    /*Try de tentativa de criar o arquivo e excrever no txt*/
                    try {
                        FileWriter fileWriter = new FileWriter(arquivo,true);
                        PrintWriter printWriter = new PrintWriter(fileWriter);

                        for(RegisterEvents event : events) {
                            printWriter.println(event);
                        }

                        printWriter.flush();
                        printWriter.close();
                        /* Catch Caso ocorra um erro retorne a mensagem*/
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                case 3:
                    System.out.println("Eventos disponiveis:\n");
                    /*Leitura com retorno do eventos disponiveis */
                    try {
                        String line = "";
                        FileReader fileReader = new FileReader(arquivo);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        while ((line = bufferedReader.readLine() ) != null) {
                            System.out.println(line);
                        }
                        fileReader.close();
                        bufferedReader.close();
                        /* Catch Caso ocorra um erro retorne a mensagem*/
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                    /*Caso de saida do sistema*/
                case 0:
                    System.exit(0);
                    break;
                    /*Retorno caso o usuario escolhe nenhuma das opções*/
                default:
                    System.out.println("Numero errado");
                    break;
            }
        }while(opcao !=0);
    }
}
