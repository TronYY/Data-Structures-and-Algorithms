public class Solution {
    public boolean Find(int target, int [][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int row = rows - 1;
        int column = 0;
        while (row >= 0 && column < columns) {
            if (array[row][column] == target) return true;
            else if (array[row][column] < target) column++;
            else row--;
        }
        return false;


    }
}
/**
 1. ????????????
 2.length?????Java???????????????????length???

 3.length()????????????????????????????length()???

 4.java??size()???????????,??????????????,?????????!
 **/