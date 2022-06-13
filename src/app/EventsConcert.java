package app;

public class EventsConcert extends CadastrarEvents{
    private String Singer;

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

        System.out.println("Digite a capacidade do show:");
        setCapacity(sc.nextInt());

        System.out.println("Digite o horario de inicio do show");
        setStartTime(sc.nextDouble());

        System.out.println("Digite o horario de encerramento do show");
        setFinalTime(sc.nextDouble());

    }


}
