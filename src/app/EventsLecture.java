package app;

import java.util.List;

public class EventsLecture extends RegisterEvents {
    public EventsLecture() {}

    /*Contrutor da classe*/
    public EventsLecture(String nameEvent, String placeEvent, String info, String startTime, String finalTime, String date, int capacity, String nameSpeaker, List<String> presentList) {
        super(nameEvent, placeEvent, info, startTime, finalTime, date, capacity, presentList);
        this.nameSpeaker = nameSpeaker;
    }
    
    /*Declara��o dos atributos da classe*/
    private String nameSpeaker;
    
    /*Getter e Setter da classe*/
    public String getNameSpeaker() {
        return nameSpeaker;
    }

    public void setNameSpeaker(String nameSpeaker) {
        this.nameSpeaker = nameSpeaker;
    }
    
    /*Metodo para o registro do evento de Palestra*/
    public void RegisterEventsLecture() {
        System.out.println("Digite o nome da Palestra:");
        setNameEvent(sc.nextLine());

        System.out.println("Digite o local da Palestra:");
        setPlaceEvent(sc.nextLine());

        System.out.println("Digite o nome do Palestrante:");
        setNameSpeaker(sc.nextLine());

        System.out.println("Digite o assunto da palestra:");
        setInfo(sc.nextLine());

        System.out.println("Digite da data do evento");
        setDate(sc.nextLine());

        System.out.println("Digite o horario de inicio da palestra:");
        setStartTime(sc.nextLine());

        System.out.println("Digite o horario final da palestra:");
        setFinalTime(sc.nextLine());

        System.out.println("Digite a capacidade de pessoas:");
        setCapacity(sc.nextInt());

        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Palestra "
                +"| Palestrante: " + getNameSpeaker()
                +"| Assunto da palestra: " + getInfo()
                +"| Local da palestra: " +getPlaceEvent()
                +"| Data da palestra:" + getDate()
                +"| Comeca as: " + getStartTime()
                +"| Termina as:" + getFinalTime()
                +"| Capacidade: " + getCapacity();
    }

    
    /*Metodo para o retorno de confirma��o de registro*/
    public void RegisterSuccess(){
        System.out.println("Palestra "
                +"| Palestrante: " + getNameSpeaker()
                +"| Assunto da Palestra: " + getInfo()
                +"| Local da Palestra: " +getPlaceEvent()
                +"| Data do evento: " + getDate()
                +"| Comeca as: " + getStartTime()
                +"| Termina as:" + getFinalTime()
                +"| Capacidade: " + getCapacity()
        		+"\nEvento Registrado com sucesso");
    }
}
