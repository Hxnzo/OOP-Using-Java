public class Sorting
{
    public static void insertionSort(String stringList[], int size)
    {
        //runs 2 for loops that compares the first and second words and then sorts them based on first letter
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < stringList.length; j++)
            {
                if (stringList[i].compareTo(stringList[j]) > 0)
                {
                    //sets the order of the words
                    String temp = stringList[i];
                    stringList[i] = stringList[j];
                    stringList[j] = temp;
                }
            }
        }
    }
}
