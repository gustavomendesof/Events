package app;

import java.util.List;

public class EventsWedding extends RegisterEvents {


    public EventsWedding() {}

    /*Contrutor da classe*/
    public EventsWedding(String nameEvent, String placeEvent, String info, String startTime, String finalTime, String date, int capacity, String nameFiancee, String nameEngaged, String nameChurch, String placeChurch, List<String> presentList) {
        super(nameEvent, placeEvent, info, startTime, finalTime, date,capacity, presentList);
        this.nameFiancee = nameFiancee;
        this.nameEngaged = nameEngaged;
        this.nameChurch = nameChurch;
        this.placeChurch = placeChurch;

    }
    /*Declara��o dos atributos da classe*/
    private String nameFiancee, nameEngaged, nameChurch, placeChurch;
    
    /*Getter e Setter da classe*/
    public String getNameFiancee() {
        return nameFiancee;
    }

    public void setNameFiancee(String nameFiancee) {
        this.nameFiancee = nameFiancee;
    }

    public String getNameEngaged() {
        return nameEngaged;
    }

    public void setNameEngaged(String nameEngaged) {
        this.nameEngaged = nameEngaged;
    }

    public String getNameChurch() {
        return nameChurch;
    }

    public void setNameChurch(String nameChurch) {
        this.nameChurch = nameChurch;
    }

    public String getPlaceChurch() {
        return placeChurch;
    }

    public void setPlaceChurch(String placeChurch) {
        this.placeChurch = placeChurch;
    }
    
    /*Metodo para o registro do evento de casamento*/
    public void RegisterEventsWedding(){

        System.out.println("Digite o Nome da igreja:");
        setNameChurch(sc.nextLine());

        System.out.println("Digite o local da igreja:");
        setPlaceChurch(sc.nextLine());

        System.out.println("Digite o nome da noiva:");
        setNameFiancee(sc.nextLine());

        System.out.println("Digite o nome do noivo");
        setNameEngaged(sc.nextLine());

        System.out.println("Digite da data do evento");
        setDate(sc.nextLine());

        System.out.println("Digite o horario de inicio do Casamento: ");
        setStartTime(sc.nextLine());

        System.out.println("Digite o horario final do casamento: ");
        setFinalTime(sc.nextLine());

        System.out.println("Digite a capacidade de pessoas:");
        setCapacity(sc.nextInt());

        sc.nextLine();

    }

    @Override
    public String toString() {
        return "Casamento "
                + "| Nome da noiva: " + getNameFiancee()
                + "| Nome do noivo: " + getNameEngaged()
                + "| Nome da igreja: " + getNameChurch()
                + "| Local da igreja: " + getPlaceChurch()
                + "| Data do casamento:" + getDate()
                + "| Horario de inicio: " + getStartTime()
                + "| Horario do fim:" + getFinalTime()
                + "| Capacidade: " + getCapacity();
    }
    /*Metodo para o retorno de confirma��o de registro*/
    public void RegisterSuccess(){
        System.out.println(
        		"Casamento "
                        +"| Nome da noiva: " + getNameFiancee()
                        +"| Nome do noivo: " + getNameEngaged()
                        +"| Nome da igreja: " +  getNameChurch()
                        +"| Local da igreja: " + getPlaceChurch()
                        +"| Data do evento: " + getDate()
                        +"| Horario de inicio: " + getStartTime()
                        +"| Horario do fim:" + getFinalTime()
                        +"| Capacidade: " + getCapacity()
                        +"\nEvento Registrado com sucesso");
    }
}
