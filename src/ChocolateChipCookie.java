class ChocolateChipCookie extends Cookie{
    ChocolateChipCookie(String flavor,int size, boolean isBaked){
        super(flavor,size,isBaked);
    }
    @Override
    void bake(){
        System.out.println("Preheat to 350 degrees and bake for 8 mins");
        System.out.println("Bake and be safe:p");
        this.isBaked=true;
    }
}
