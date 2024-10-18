class overloading {
    String name;
    int age;
    overloading(){
    name="bhavin";
    age=19;
    }
    overloading(String name){
        name="bhavin";
        age=19;
        }
        overloading(String name,int age){
            name="bhavin";
            age=19;
            }
            void print(){
                System.out.println("name is:"+name);
                System.out.println("age is:"+age);
            }
            public static void main(String[] args) {
                overloading b=new overloading("bhavin",19);
                b.print();
            }    
}