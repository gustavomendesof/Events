package app;

public class EventsLecture extends CadastrarEvents{

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

        System.out.println("Digite a capacidade de pessoas:");
        setCapacity(sc.nextInt());

        System.out.println("Digite o horario de inicio da palestra:");
        setStartTime(sc.nextDouble());

        System.out.println("Digite o horario final da palestra:");
        setFinalTime(sc.nextDouble());
    }

    @Override
    public String toString() {
        return "Palestra: " + getNameEvent()
                +"\nPalestrante: " + getNameSpeaker()
                +"\nAssunto da Palestra: " + getInfo()
                +"\nLocal da Palestra: " + getPlaceEvent()
                +"\nComeça as: " + getStartTime()
                +"\nTermina as:" + getFinalTime()
                +"\n Capacidade: " + getCapacity();
    }
}
