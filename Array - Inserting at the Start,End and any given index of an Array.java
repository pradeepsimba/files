public class Main {
    
    public static void main(String[] args) {
// Declare an integer array of 6 elements
        int[] intArray = new int[6];
        int length = 0;

// Add 3 elements to the Array
        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
        }

// Insert a new element at the end of the Array. Again,
// it's important to ensure that there is enough space
// in the array for inserting a new element.
        intArray[length] = 10;
        length++;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }

// First, we will have to create space for a new element.
// We do that by shifting each element one index to the right.
// This will firstly move the element at index 3, then 2, then 1, then finally 0.
// We need to go backwards to avoid overwriting any elements.
        for (int i = length; i >= 0; i--) {
            intArray[i + 1] = intArray[i];
        }

// Now that we have created space for the new element,
// we can insert it at the beginning.
        intArray[0] = 20;

        System.out.println("After inserting at start");

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }

// Say we want to insert the element at index 2.
// First, we will have to create space for the new element.
        for (int i = 4; i >= 2; i--)
        {
            // Shift each element one position to the right.
            intArray[i + 1] = intArray[i];
        }

// Now that we have created space for the new element,
// we can insert it at the required index.
        intArray[2] = 30;

        System.out.println("After inserting at any index");

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
        
    }

}
