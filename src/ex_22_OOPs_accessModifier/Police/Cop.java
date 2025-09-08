package ex_22_OOPs_accessModifier.Police;

public class Cop {
    public int gun;
    String iCard;

    public Cop(int bullet){
        this.gun = bullet;

    }

    //Method and /Behav
   protected void canIShoot(){
        System.out.println("yes you can !!");
    }
}
