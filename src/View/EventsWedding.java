package View;

public class EventsWedding extends RegisterEvents {
    private String nameFiancee, nameEngaged, nameChurch, placeChurch;

    public EventsWedding() {}

    public EventsWedding(String nameEvent, String placeEvent, String info, String startTime, String finalTime, int capacity, String nameFiancee, String nameEngaged, String nameChurch, String placeChurch) {
        super(nameEvent, placeEvent, info, startTime, finalTime, capacity);
        this.nameFiancee = nameFiancee;
        this.nameEngaged = nameEngaged;
        this.nameChurch = nameChurch;
        this.placeChurch = placeChurch;

    }

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

    public void RegisterEventsWedding(){

        System.out.println("Digite o Nome da igreja:");
        setNameChurch(sc.next());

        System.out.println("Digite o local da igreja:");
        setPlaceChurch(sc.next());

        System.out.println("Digite o nome da noiva:");
        setNameFiancee(sc.next());

        System.out.println("Digite o nome do noivo");
        setNameEngaged(sc.next());

        System.out.println("Digite o horario de inicio do Casamento: ");
        setStartTime(sc.next());

        System.out.println("Digite o horario final do casamento: ");
        setFinalTime(sc.next());

    }

    @Override
    public String toString() {
        return "Casamento|"
                +"Nome da noiva: " + getNameFiancee()
                +"| Nome do noivo: " + getNameEngaged()
                +"| Nome da igreja: " + getNameChurch()
                +"| Local da igreja: " + getPlaceChurch()
                +"| Horario de inicio: " + getFinalTime()
                +"| Horario do fim: " + getStartTime();

    }

    public void RegisterSuccess(){
        System.out.println("Evento Registrado com sucesso"
                +"Nome do evento: " + getNameEvent()
                +"\nNome da igreja: " +  getNameChurch()
                +"\nLocal da igreja: " + getPlaceChurch()
                +"\nNome da noiva: " + getNameFiancee()
                +"\nNome do noivo: " + getNameEngaged()
                +"\nLocal da Festa: " + getPlaceEvent()
                +"\nCapacidade: " + getCapacity()
                +"\nTermina as:" + getFinalTime()
                +"\nCapacidade: " + getCapacity());

    }
}
