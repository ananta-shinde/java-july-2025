public class MyStringArray {

    String[] list ;
    int count;

    MyStringArray(int size){
        list = new String[size];
        count = 0;
    }

    void append(String value){
      if(count != length()){
            list[count] = value;
            count++;
      }
      else {
          System.out.println("list is full");
      }
    }

    int  indexOf(String value){
        for (int i = 0; i < list.length; i++) {
            if(list[i] == value){
                return i;
            }
        }
        return -1;
    }

    void pop(){
       list[count-1] = null;
       count--;
    }

    void remove(String value){
        for (int i = 0; i < list.length; i++) {
            if(list[i].equals(value))
            {
                list[i] = null;
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
