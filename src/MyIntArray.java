public class MyIntArray {


    int[] list ;
    int count;

    MyIntArray(int size){
        list = new int[size];
        count = 0;
    }

    void append(int value){
      if(count != length()){
            list[count] = value;
            count++;
      }
      else {
          System.out.println("list is full");
      }
    }

    int  indexOf(int value){
        for (int i = 0; i < list.length; i++) {
            if(list[i] == value){
                return i;
            }
        }
        return -1;
    }

    void pop(){
       list[count-1] = 0;
       count--;
    }

    void remove(int value){
        for (int i = 0; i < list.length; i++) {
            if(list[i] == value)
            {
                list[i] = 0;
            }
        }
    }

    void print(){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    int length(){
        return list.length;
    }
}
