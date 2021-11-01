package code;

/**
 * Calcutor app
 *
 * @author gondaimgano
 */
public class Calculator {
private int x;


    /**
     *
     * @param x
     *
     */
    public Calculator(int x) {
        this.x = x;
    }

    /**
     *
     * @param x
     * @return Calculator
     */
    public  Calculator add(int x){

        this.x+=x;
        System.out.format("sum %s \n",this.x);
        return this;
}

public  Calculator subtract(int x){
        this.x-=x;
    System.out.format("subtract %s \n",this.x);
        return this;

}

public Calculator divide(int x){
        this.x/=x;
        System.out.format("divide %s \n",this.x);

        return this;
}

public Calculator times(int x){

        this.x*=x;
    System.out.format("times %s \n",this.x);
        return this;
}
public int result(){
  return x;
}


    @Override
    public String toString() {
        return   x+"";
    }
}
