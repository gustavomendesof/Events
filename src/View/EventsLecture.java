package View;

import java.util.List;

public class EventsLecture extends RegisterEvents {
    public EventsLecture() {}

    public EventsLecture(String nameEvent, String placeEvent, String info, String startTime, String finalTime, int capacity, String nameSpeaker, List<String> presentList) {
        super(nameEvent, placeEvent, info, startTime, finalTime, capacity, presentList);
        this.nameSpeaker = nameSpeaker;
    }

    private String nameSpeaker;

    public String getNameSpeaker() {
        return nameSpeaker;
    }

    public void setNameSpeaker(String nameSpeaker) {
        this.nameSpeaker = nameSpeaker;
    }

    public void RegisterEventsLecture() {
        System.out.println("Digite o nome da Palestra:");
        setNameEvent(sc.nextLine());

        System.out.println("Digite o local da Palestra:");
        setPlaceEvent(sc.nextLine());

        System.out.println("Digite o nome do Palestrante:");
        setNameSpeaker(sc.nextLine());

        System.out.println("Digite o assunto da palestra:");
        setInfo(sc.nextLine());

        System.out.println("Digite o horario de inicio da palestra:");
        setStartTime(sc.nextLine());

        System.out.println("Digite o horario final da palestra:");
        setFinalTime(sc.nextLine());

        System.out.println("Digite a capacidade de pessoas:");
        setCapacity(sc.nextInt());

    }

    @Override
    public String toString() {
        return "Palestra: " + getNameEvent()
                +"| Palestrante: " + getNameSpeaker()
                +"| Assunto da Palestra: " + getInfo()
                +"| Local da Palestra: " +getPlaceEvent()
                +"| Comeca as: " + getStartTime()
                +"| Termina as:" + getFinalTime()
                +"| Capacidade: " + getCapacity();
    }

    public void RegisterSuccess(){
        System.out.println("Evento Registrado com sucesso"
                +"\nNome do evento: " + getNameEvent()
                +"\nLocal da Festa: " + getPlaceEvent()
                +"\nNome do palestrante: " + getNameSpeaker()
                +"\nAssunto da palestra" + getInfo()
                +"\nComeça as: " + getStartTime()
                +"\nTermina as:" + getFinalTime()
                +"\nCapacidade: " + getCapacity());

    }

}
