class MethodOverloading{
    public static void print(){
        System.out.print("Inside print");
    }
    public static void print(int val){
        System.out.println("Inside print with val= "+val);
    }
    public static void main(String args[]){
        print();
        print(5);
    }
}