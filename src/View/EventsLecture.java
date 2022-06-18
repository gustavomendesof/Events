package View;

public class EventsLecture extends RegisterEvents {
    public EventsLecture() {}

    public EventsLecture(String nameEvent, String placeEvent, String info, String startTime, String finalTime, int capacity, String nameSpeaker) {
        super(nameEvent, placeEvent, info, startTime, finalTime, capacity);
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
        setNameEvent(sc.next());

        System.out.println("Digite o local da Palestra:");
        setPlaceEvent(sc.next());

        System.out.println("Digite o nome do Palestrante:");
        setNameSpeaker(sc.next());

        System.out.println("Digite o assunto da palestra:");
        setInfo(sc.next());

        System.out.println("Digite a capacidade de pessoas:");
        setCapacity(sc.nextInt());

        System.out.println("Digite o horario de inicio da palestra:");
        setStartTime(sc.next());

        System.out.println("Digite o horario final da palestra:");
        setFinalTime(sc.next());
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
}
