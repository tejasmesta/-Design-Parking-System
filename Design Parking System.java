class ParkingSystem {
    
    int b;
    int m;
    int s;

    public ParkingSystem(int big, int medium, int small)
    {
        b = big;
        m = medium;
        s = small;
    }
    
    public boolean addCar(int carType) 
    {
        if(carType==1)
        {
            if(b>0)
            {
                b--;
                return true;
            }
            return false;
        }
        else if(carType==2)
        {
            if(m>0)
            {
                m--;
                return true;
            }
            return false;
        }
        else{
            if(s>0)
            {
                s--;
                return true;
            }
            return false;
        }
    }
}
