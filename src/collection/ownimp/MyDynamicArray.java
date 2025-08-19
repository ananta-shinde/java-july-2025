package collection.ownimp;

public class MyDynamicArray<T> {
    private T[] values;
    private int  defaultCapacity = 5;
    private int capacity;

    private int count = 0;

    public MyDynamicArray(){

        values = (T[])new Object[defaultCapacity];
        capacity= defaultCapacity;
    }

    public int  getCapacity(){
        return capacity;
    }
    public void  setCapacity(int newCapacity){
        capacity = newCapacity;
    }

    public int  size(){
        return count;
    }

    public boolean add(T value)
    {
        if(capacity == count){
            updateCapacity();
        }
        values[count] = value;
        count++;
        return true;
    }

    private void  updateCapacity(){
        capacity = capacity +5;
        T[] oldvalues = values;
        values =(T[]) new Object[capacity];
        copyValues(oldvalues,values);
    }

    public T get(int index){
        return values[index];
    }

    public void set(int index,T value)
    {
        values[index] = value;
    }

    public void remove(int index){
        for(int i=index;i<size();i++){
            values[i] = values[i+1];
        }
        count--;
    }

    private void copyValues(T[] oldArray,T[] newArray){
        for(int i=0;i< oldArray.length;i++){
            newArray[i]=oldArray[i];
        }
    }





}
