abstract class Cookie{
    private String flavor;
    private int size;
    protected boolean isBaked;

    Cookie(String flav, int size, boolean isBaked){
        this.flavor= flav;
        this.size= size;
        this.isBaked= isBaked;
    }

    abstract void bake();

    void printInfo(){
        System.out.println("Flavor:"+this.flavor);
        System.out.println("Size:"+this.size);
        System.out.println("Baked?:"+this.isBaked);
    }
}
