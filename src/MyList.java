import javax.sound.midi.Soundbank;

public class MyList {

    private int[] numbersList = new int[5];
    private int count = 0;
    void insert(int value){
        if(count < numbersList.length) {
            numbersList[count] = value;
            count++;
        }else{
            System.out.println("list is full");
        }
    }

    void insert(int index,int value){
        if(index>=0 && index< numbersList.length && count < numbersList.length){
                for(int i=count;i>index;i--){
                    numbersList[i] = numbersList[i-1];
                }
                numbersList[index] = value;
                count++;
        }else{
            System.out.println("invalid index or list is full");
        }
    }

    void print(){
        for (int i = 0; i < count; i++) {
            System.out.print(numbersList[i]);
            System.out.print("\t");
        }

    }

    int size(){
        return count;
    }

    int get(int index){
        if(index>=0 && index< numbersList.length){
            return numbersList[index];
        }
        return 0;

    }

    void remove(){
        count--;
    }

    boolean isEmpty(){
        if(count == 0){
            return true;
        }else{
            return false;
        }

    }

}
