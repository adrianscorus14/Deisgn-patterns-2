package builder;

public class App {
    public static void main(String[] args) {
//        House house=new House(3,4,true,new Garden());
//        House house1=new House(3,4,true);

        House house=new House.HouseBuilder().build();

        House house1=new House.HouseBuilder()
                .addGarage(true)
                .addGarden(new Garden())
                .addRooms(5)
                .addWindows(10)
                .build();




        House houseWithoutGarden=new House.HouseBuilder().addGarage(true).addRooms(5).addWindows(10).build();

    }
}
