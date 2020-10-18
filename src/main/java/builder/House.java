package builder;

public class House {
    private int roomsNo;
    private int windowsNo;
    private boolean hasGarage;
    private Garden garden;

    private House(int roomsNo,int windowsNo,boolean hasGarage,Garden garden){


    }


    public static class HouseBuilder{
        private int auxRoomsNo;
        private int auxWindowsNo;
        private boolean auxHasGarage;
        private Garden auxGarden;

        public HouseBuilder(){
            this.auxRoomsNo=0;
            this.auxHasGarage=false;
            this.auxWindowsNo=0;
            this.auxGarden=null;
        }

        public HouseBuilder addRooms(int rooms){
            this.auxRoomsNo=rooms;
            return this;
        }
        public HouseBuilder addWindows(int windows){
            this.auxWindowsNo=windows;
            return this;
        }
        public HouseBuilder addGarage(boolean hasGarage){
            this.auxHasGarage=hasGarage;
            return this;
        }
        public HouseBuilder addGarden(Garden garden){
            this.auxGarden=garden;
            return this;
        }

        public  House build(){
            return new House(this.auxRoomsNo,this.auxWindowsNo,this.auxHasGarage,this.auxGarden);
        }
    }
}
