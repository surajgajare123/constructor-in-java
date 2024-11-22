class Main {
    private int id;
    private String name;
    
    public Main(){// construcator
         id = 12;
         name = "suraj";
    }
    public Main(String mName , int idi){// paramataric construcator
        id = idi;
        name = mName;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int a){
       id = a;
    }
    public void setName(String n){
        name = n;
    }
    public static void main(String[] args) {
        System.out.println("construcator in java!");
        Main su = new Main("surj", 33);
       // su.setName("rushab");
       // su.setId(122);
        System.out.println(su.getId());
        System.out.println(su.getName());
    
    }
}
