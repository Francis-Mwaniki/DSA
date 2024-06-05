public class MainDynamicArray {
    public static void main(String[] args){
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");

        //use insert --
        dynamicArray.insert(0,"X");
        // delete
        dynamicArray.delete("A");

        System.out.println(dynamicArray);
        System.out.println("Empty: " + dynamicArray.isEmpty());
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);

    }
}
