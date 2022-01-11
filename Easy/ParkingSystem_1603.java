package Easy;

public class ParkingSystem_1603 {

    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem(1,1,0);
        System.out.println(ps.addCar(1));
        System.out.println(ps.addCar(2));
        System.out.println(ps.addCar(3));
        System.out.println(ps.addCar(1));
    }

}

class ParkingSystem {
    private int bi[],med[],sma[];
    private int bigIndex,medIndex,smallIndex;

    public ParkingSystem(int big, int medium, int small) {
        //size of each garage
        bi = new int[big];
        med = new int[medium];
        sma = new int[small];

        bigIndex = 0;
        medIndex = 0;
        smallIndex = 0;
    }

    public boolean addCar(int carType) {
        boolean res = false;

        if(carType == 1){
            //big
            if(bigIndex<bi.length){
                bi[bigIndex++] = carType;
               // bigIndex++;
                res = true;
            }
        }else if(carType ==2){
            //medium
            if(medIndex<med.length){
                med[medIndex++]=carType;
                //medIndex++;
                res = true;
            }
        }else if(carType == 3){
            //small
            if(smallIndex<sma.length){
                sma[smallIndex++]=carType;
                medIndex++;
                res = true;
            }
        }

        return res;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
