package model;

public class Garden {
    private int n;
    Plant[]plants;

    public Garden(int n) {
        this.n = n;
        this.plants=new Plant[n];
        for(int i=0;i<n;i++){
            plants[i]=null;
        }
    }

    protected boolean add(Plant p){             //1
        
        for (Plant plant:plants) {
            if(plant==null)
                plant=p;              
                return true;
        }
        return false;
    }
    
    protected Plant get(int index){           //2
        if(index>n) return null;
        return plants[n];
    }
    
    protected int count() {                  //3
        int count = 0;
        for (Plant plant : plants) {
            if (plant == null) return count;   
            count++;
        }
        return count;
    }
    
    protected String allPlants()            //4
    {
        String allPlants="";
        for (Plant plant : plants) {
            if (plant == null) return allPlants;
            allPlants+=plant.toString();
        }
        return allPlants;
    }
    
    protected Plant search(String name){  //5
        for (Plant plant : plants) {
            if (plant.getName() == name) return plant;
        }  
        return null;
    }

    protected int search(Plant p){     //6
        for (int i = 0; i <n ; i++) {
            if(plants[i]==p)
                 return i;
        }
        return -1;
    }

    protected Plant delete(String name){  //7
        Plant p=search(name);
        if(p==null) return null;

        int index=search(p);
        if (index==-1) return null;

        for(int i=index;i<n;i++)
        {
            plants[i]=plants[i+1];
            plants[i+1]=null;
        }

        return p;
    }

    protected boolean delete(Plant p){  //8

        int index=search(p);
        if (index==-1) return false;

        for(int i=index;i<n;i++)
        {
            plants[i]=plants[i+1];
            plants[i+1]=null;
        }

        return true;
    }

    protected boolean insert(int index, Plant p){  //9
        if (index>n) return false;
        if(plants[n]!=null) return false;   //the array is full. no place for insert

        for(int i=n;i<index;i--)
        {
            plants[i]=plants[i-1];
        }

        plants[index]=p;

        return true;
    }
    
}
