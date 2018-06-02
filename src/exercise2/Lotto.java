package exercise2;

public class Lotto {

    //Array
    private int[] lottoNumbers = new int[3];

    //Constructor receiving random numbers
    public Lotto(int num1, int num2, int num3){

        this.lottoNumbers[0] = num1;
        this.lottoNumbers[1] = num2;
        this.lottoNumbers[2] = num3;
    }
    //Method that returns the array
    public int[] getArray(){
        return this.lottoNumbers;
    }

    // method that return sum of numbers
    public int sum(){

        return (this.lottoNumbers[0]+this.lottoNumbers[1]+this.lottoNumbers[2]);

    }

}

