 class convolu {
    double rad,hei,vol;
    convolu(double r,double h){
        rad=r;
        hei=h;
        vol=3.14*rad*rad*hei;
    }
 class volume{
    public static void main(String[] args) {
        convolu obj=new convolu(5,10);
        System.out.println("your vol="+obj.vol);
    }
  }
}
