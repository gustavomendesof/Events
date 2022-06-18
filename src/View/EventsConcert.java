package View;

public class EventsConcert extends RegisterEvents {
    private String Singer;

    public EventsConcert() {}

    public EventsConcert(String nameEvent, String placeEvent, String info, String startTime, String finalTime, int capacity, String singer) {
        super(nameEvent, placeEvent, info, startTime, finalTime, capacity);
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
        setNameEvent(sc.next());

        System.out.println("Digite o local do show:");
        setPlaceEvent(sc.next());

        System.out.println("Digite o cantor do show:");
        setSinger(sc.next());

        System.out.println("Digite a capacidade do show:");
        setCapacity(sc.nextInt());

        System.out.println("Digite o horario de inicio do show");
        setStartTime(sc.next());

        System.out.println("Digite o horario de encerramento do show");
        setFinalTime(sc.next());

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
}
