package View;

import java.util.List;

public class EventsConcert extends RegisterEvents {
    private String Singer;

    public EventsConcert() {}

    public EventsConcert(String nameEvent, String placeEvent, String info, String startTime, String finalTime, int capacity, String singer, List<String> presentList) {
        super(nameEvent, placeEvent, info, startTime, finalTime, capacity, presentList);
        Singer = singer;
    }
    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public void RegisterEventsConcert() {
        System.out.println("Digite nome do show: ");
        setNameEvent(sc.nextLine());

        System.out.println("Digite o local do show:");
        setPlaceEvent(sc.nextLine());

        System.out.println("Digite o cantor do show:");
        setSinger(sc.nextLine());

        System.out.println("Digite o horario de inicio do show");
        setStartTime(sc.nextLine());

        System.out.println("Digite o horario de encerramento do show");
        setFinalTime(sc.nextLine());

        System.out.println("Digite a capacidade do show:");
        setCapacity(sc.nextInt());

    }

    @Override
    public String toString() {
        return "Show"
                +"| Nome do show: " + getNameEvent()
                +"| Local do show: " + getPlaceEvent()
                +"| Cantor: " + getSinger()
                +"| Capacidade do show: " + getCapacity()
                +"| Inicia as: " + getStartTime()
                +"| Termina as: " + getFinalTime();
    }

    public void RegisterSuccess(){
        System.out.println("Evento Registrado com sucesso"
                +"\nNome do evento: " + getNameEvent()
                +"\nLocal da Festa: " + getPlaceEvent()
                +"\nCanto do show" + getSinger()
                +"\nComeça as: " + getStartTime()
                +"\nTermina as:" + getFinalTime()
                +"\nCapacidade: " + getCapacity());

    }
}
