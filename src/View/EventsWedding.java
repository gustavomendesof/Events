package View;

public class EventsWedding extends RegisterEvents {
    private String nameFiancee, nameEngaged, nameChurch, placeChurch;

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
        System.out.println("Digite o nome do Evento:");
        setNameEvent(sc.nextLine());

        System.out.println("Digite o Nome da igreja:");
        setNameChurch(sc.nextLine());

        System.out.println("Digite o local da igreja:");
        setPlaceChurch(sc.nextLine());

        System.out.println("Digite o nome da noiva:");
        setNameFiancee(sc.nextLine());

        System.out.println("Digite o nome do noivo");
        setNameEngaged(sc.nextLine());

        System.out.println("Digite o local da Festa: ");
        setPlaceEvent(sc.nextLine());

        System.out.println("Digite a capacidade da Festa");
        setCapacity(sc.nextInt());

        System.out.println("Digite o horario de inicio do Casamento: ");
        setStartTime(sc.nextDouble());

        System.out.println("Digite o horario final do casamento: ");
        setFinalTime(sc.nextDouble());

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
