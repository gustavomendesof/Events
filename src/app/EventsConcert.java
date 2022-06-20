package app;

import java.util.List;

public class EventsConcert extends RegisterEvents {
    

    public EventsConcert() {}

    
    /*Contrutor da classe*/
    public EventsConcert(String nameEvent, String placeEvent, String info, String startTime, String finalTime, String date, int capacity, String singer, List<String> presentList) {
        super(nameEvent, placeEvent, info, startTime, finalTime, date, capacity, presentList);
        Singer = singer;
    }
    
    /*Declara��o dos atributos da classe*/
    private String Singer;
    
    /*Getter e Setter da classe*/
    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }
    
    /*Metodo para o registro do evento de show*/
    public void RegisterEventsConcert() {
        System.out.println("Digite nome do show: ");
        setNameEvent(sc.nextLine());

        System.out.println("Digite o local do show:");
        setPlaceEvent(sc.nextLine());

        System.out.println("Digite o cantor do show:");
        setSinger(sc.nextLine());

        System.out.println("Digite da data do evento");
        setDate(sc.nextLine());

        System.out.println("Digite o horario de inicio do show");
        setStartTime(sc.nextLine());

        System.out.println("Digite o horario de encerramento do show");
        setFinalTime(sc.nextLine());

        System.out.println("Digite a capacidade do show:");
        setCapacity(sc.nextInt());

        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Show "
                +"| Nome do show: " + getNameEvent()
                +"| Local do show: " + getPlaceEvent()
                +"| Cantor: " + getSinger()
                +"| Data do show:" + getDate()
                +"| Capacidade do show: " + getCapacity()
                +"| Inicia as: " + getStartTime()
                +"| Termina as: " + getFinalTime();
    }
  
    /*Metodo para o retorno de confirma��o de registro*/
    public void RegisterSuccess() {
        System.out.println("Show "
                +"| Nome do show: " + getNameEvent()
                +"| Local do show: " + getPlaceEvent()
                +"| Cantor: " + getSinger()
                +"| Capacidade do show: " + getCapacity()
                +"| Data do evento: " + getDate()
                +"| Inicia as: " + getStartTime()
                +"| Termina as: " + getFinalTime()
                +"\nEvento Registrado com sucesso");
    }
}
